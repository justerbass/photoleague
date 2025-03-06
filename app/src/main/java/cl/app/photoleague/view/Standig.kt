package cl.app.photoleague.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import cl.app.photoleague.Model.Resource
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.R
import cl.app.photoleague.components.CategorySelector
import cl.app.photoleague.components.PromoButton
import cl.app.photoleague.components.StandingItem
import cl.app.photoleague.components.StreamButton
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.viewModel.TeamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Standing(navController: NavController, viewModel: TeamsViewModel) {

    val selectedCategory by viewModel.selectedCategory.collectAsState()
    var showTeams by remember { mutableStateOf(false) }

    val apiResource = when (selectedCategory) {
        "F1 Pro" -> viewModel.resultadosF1.collectAsState().value
        "F2 Junior" -> viewModel.resultadosF2.collectAsState().value
        "F3 Academy" -> viewModel.resultadosF3.collectAsState().value
        else -> null
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.photo1),
                            contentDescription = "Logo",
                            modifier = Modifier.size(64.dp)
                        )
                        Text(
                            text = "PhotoLeague Clasificación \n$selectedCategory",
                            textAlign = TextAlign.Center
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary
                )
            )
        },
        bottomBar = { BottomNavigationBar(navController) })

    { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            PromoButton()
            CategorySelector(selectedCategory, viewModel::selectCategory)
            StreamButton()

            if (selectedCategory.isNotBlank()) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        onClick = { showTeams = false },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (!showTeams) Color.Blue else Color.Gray
                        )

                    ) {
                        Text("Pilotos", color = Color.White)
                    }

                    Spacer(modifier = Modifier.width(16.dp))

                    Button(
                        onClick = { showTeams = true },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (showTeams) Color.Blue else Color.Gray
                        )
                    ) {
                        Text("Equipos", color = Color.White)
                    }
                }
                when {
                    apiResource == null -> {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator()
                        }
                    }

                    apiResource is Resource.Error -> {
                        Text(
                            text = "Error: ${apiResource.message}",
                            modifier = Modifier.padding(16.dp)
                        )
                    }

                    apiResource is Resource.Success -> {
                        val driverStanding = apiResource.data.puntosPorPiloto.sortedByDescending {
                            it.puntos_totales.toIntOrNull() ?: 0
                        }
                        val teamStanding = apiResource.data.puntosPorEquipo.sortedByDescending {
                            it.total_puntos.toIntOrNull() ?: 0
                        }

                        if (!showTeams) {
                            Text(
                                text = "Clasificación de Pilotos",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(vertical = 16.dp)
                            )
                            LazyColumn {
                                itemsIndexed(driverStanding) { index, driver ->
                                    StandingItem(
                                        position = index + 1,
                                        name = driver.piloto_nombre,
                                        points = driver.puntos_totales,
                                        modifier = Modifier.padding(horizontal = 8.dp)
                                    )
                                }
                            }

                        } else {
                            Text(
                                text = "Clasificación de Equipos",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(vertical = 16.dp)
                            )
                            LazyColumn {
                                itemsIndexed(teamStanding) { index, team ->
                                    StandingItem(
                                        position = index + 1,
                                        name = team.equipo_nombre,
                                        points = team.total_puntos,
                                        modifier = Modifier.padding(horizontal = 8.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            } else {
                Text(
                    text = "Seleccione una categoría para ver la información",
                    modifier = Modifier.padding(16.dp)
                )
            }

            Box(modifier = Modifier.padding(padding)) {

            }
        }
    }
}