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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cl.app.photoleague.Model.Drivers
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.components.DriverItem
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.ui.theme.getTeamColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeamProfile(navController: NavController, team: Teams, category: String) {

    val (drivers, categoryPoints) = when (category) {
        "F1 Pro" -> Pair(team.f1Drivers, team.f1Points)
        "F2 Junior" -> Pair(team.f2Drivers, team.f2Points)
        "F3 Academy" -> Pair(team.f3Drivers, team.f3Points)
        else -> Pair(emptyList(), 0)
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
                        end = Offset(1000f, 1000f)
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
                    text = "Puntaje en $category: $categoryPoints",
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
                LazyColumn {
                    items(drivers) { driver ->
                        DriverItem(driver)
                    }
                }
            }
        }
        Box(modifier = Modifier.padding(padding)) {

        }

    }
}
