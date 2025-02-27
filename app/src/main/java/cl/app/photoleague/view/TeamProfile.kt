package cl.app.photoleague.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cl.app.photoleague.Model.Drivers
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.navigation.BottomNavigationBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeamProfile(navController: NavController, team: Teams, category: String) {

    val (drivers, categoryPoints) = when (category) {
        "F1 Pro" -> Pair(team.f1Drivers, team.f1Points)
        "F2 Junior" -> Pair(team.f2Drivers, team.f2Points)
        "F3 Academy" -> Pair(team.f3Drivers, team.f3Points)
        else -> Pair(emptyList(), 0)
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(team.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.AutoMirrored.Default.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        },
        bottomBar = { BottomNavigationBar(navController) })

    { padding ->

        Column(modifier = Modifier
            .padding(padding)
            .fillMaxSize()) {
            Text(
                text = "Jefe de Equipo: ${team.teamPrincipal}",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Puntaje en $category: $categoryPoints",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = "Pilotos en $category:",
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
            LazyColumn {
                items(drivers) { driver ->
                    DriverItem(driver)
                }
            }
        }
        Box(modifier = Modifier.padding(padding)) {

        }

    }
}

@Composable
fun DriverItem(driver: Drivers) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = driver.name, style = MaterialTheme.typography.bodyLarge)
            Text(text = "Puntos: ${driver.points}", style = MaterialTheme.typography.bodyMedium)
        }
    }
}