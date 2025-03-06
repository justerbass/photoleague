package cl.app.photoleague.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import cl.app.photoleague.components.CategorySelector
import cl.app.photoleague.components.PromoButton
import cl.app.photoleague.components.RaceCard
import cl.app.photoleague.components.StreamButton
import cl.app.photoleague.data.DataSource.races
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.viewModel.TeamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calendar(navController: NavController, viewModel: TeamsViewModel) {

    val selectedCategory by viewModel.selectedCategory.collectAsState()
    val races = viewModel.getRacesByCategory(selectedCategory)

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "PhotoLeague Calendario $selectedCategory") },
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
                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(races) { race ->
                        RaceCard(race = race)
                    }
                }
            } else {
                Text(
                    text = "Seleccione una categoría para ver la información",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

        Box(modifier = Modifier.padding(padding)) {

        }

    }
}