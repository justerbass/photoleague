package cl.app.photoleague.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.components.CategorySelector
import cl.app.photoleague.components.PromoButton
import cl.app.photoleague.components.StreamButton
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.navigation.Screen
import cl.app.photoleague.viewModel.TeamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, viewModel: TeamsViewModel) {
    val selectedCategory by viewModel.selectedCategory.collectAsState()
    val teams by viewModel.teams.collectAsState()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = { Text(text = "PhotoLeague $selectedCategory") })
        },
        bottomBar = { BottomNavigationBar(navController) }

    ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            PromoButton()
            CategorySelector(selectedCategory, viewModel::selectCategory)
            StreamButton()
            LazyColumn {
                items(teams) { team ->
                    TeamItem(team) {
                        navController.navigate(Screen.TeamProfile.route + "/${team.name}/$selectedCategory")
                    }
                }
            }
        }
        Box(modifier = Modifier.padding(padding)) {

        }

    }
}

@Composable
fun TeamItem(team: Teams, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
            .background(Color.Gray)
            .padding(16.dp)
    ) {
        Text(text = team.name)

    }
}




