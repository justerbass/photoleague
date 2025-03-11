package cl.app.photoleague.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cl.app.photoleague.Model.Resource
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.components.DriverItem
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.ui.theme.getTeamColors
import cl.app.photoleague.viewModel.TeamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeamProfile(navController: NavController, team: Teams, category: String, viewModel: TeamsViewModel) {

    val apiResource = when (category) {
        "F1 Pro" -> viewModel.resultadosF1.collectAsState().value
        "F2 Junior" -> viewModel.resultadosF2.collectAsState().value
        "F3 Academy" -> viewModel.resultadosF3.collectAsState().value
        else -> null
    }
    val teamPoints = remember(apiResource) {
        if (apiResource is Resource.Success) {
            apiResource.data.puntosPorEquipo
                .find { it.equipo_nombre.equals(team.name, ignoreCase = true) }
                ?.total_puntos ?: "N/A"
        } else "Cargando..."
    }

    val pilotPointsMap = remember(apiResource) {
        if (apiResource is Resource.Success) {
            apiResource.data.puntosPorPiloto
                .filter { it.equipo_nombre.equals(team.name, ignoreCase = true) }
                .associateBy { it.piloto_nombre }
        } else emptyMap()
    }

    val teamDrivers = remember(apiResource) {
        if (apiResource is Resource.Success) {
            apiResource.data.entry_list.filter { it.equipo_nombre.equals(team.name, ignoreCase = true) }
        } else emptyList()
    }

    val (primaryColor, secondaryColor) = getTeamColors(team.name)

    Scaffold(
        containerColor = Color.Transparent,

        topBar =
        {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .statusBarsPadding()
            ) {
                CenterAlignedTopAppBar(
                    title = { Text(team.name, color = Color.White) },
                    navigationIcon = {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(
                                Icons.AutoMirrored.Default.ArrowBack,
                                contentDescription = "Volver",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Transparent,
                        scrolledContainerColor = Color.Transparent
                    )
                )
            }
        },
        bottomBar = { BottomNavigationBar(navController) })

    { padding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(primaryColor, secondaryColor),
                        start = Offset(0f, 0f),
                        end = Offset(1000f, 2000f)
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp)
                    .fillMaxSize()
            ) {
                Text(
                    text = "Jefe de Equipo: ${team.teamPrincipal}",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Puntaje en $category: $teamPoints",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Pilotos en $category:",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(16.dp))
                when (apiResource) {
                    null -> {
                        CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
                    }
                    is Resource.Error -> {
                        Text(
                            text = "Error: ${apiResource.message}",
                            color = Color.White,
                            modifier = Modifier.padding(16.dp)
                        )
                    }
                    is Resource.Success -> {
                        if (teamDrivers.isEmpty()) {
                            Text(
                                text = "No se encontraron pilotos para este equipo.",
                                color = Color.White
                            )
                        } else {
                            val sortedTeamDrivers = teamDrivers.sortedByDescending { driver ->
                                pilotPointsMap[driver.piloto_nombre]?.puntos_totales?.toIntOrNull() ?: 0
                            }
                            LazyColumn {
                                items(sortedTeamDrivers) { driver ->
                                    val driverPoints = pilotPointsMap[driver.piloto_nombre]?.puntos_totales ?: "N/A"
                                    DriverItem(driver = driver, points = driverPoints)
                                }
                            }
                        }
                    }
                }
            }
        }
        Box(modifier = Modifier.padding(padding)) {

        }

    }
}
