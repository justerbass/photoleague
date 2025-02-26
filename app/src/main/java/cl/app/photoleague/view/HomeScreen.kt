package cl.app.photoleague.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import cl.app.photoleague.navigation.BottomNavigationBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(title = { Text(text = "PhotoLeague") })
        },
        bottomBar = {BottomNavigationBar(navController)}
    
    ){   padding ->

        LazyColumn(modifier = Modifier.padding(padding)) {
            items(teams) { team ->
                TeamItem(team.name)
            }
        }
        Box(modifier = Modifier.padding(padding)){

        }

    }
}

@Composable
fun TeamItem(name: String) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Text(
            text = name,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
