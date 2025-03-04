package cl.app.photoleague.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.components.CategorySelector
import cl.app.photoleague.components.PromoButton
import cl.app.photoleague.components.StreamButton
import cl.app.photoleague.components.TeamItem
import cl.app.photoleague.navigation.BottomNavigationBar
import cl.app.photoleague.navigation.Screen
import cl.app.photoleague.ui.theme.getTeamColors
import cl.app.photoleague.viewModel.TeamsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, viewModel: TeamsViewModel) {
    val selectedCategory by viewModel.selectedCategory.collectAsState()
    val teams by viewModel.teams.collectAsState()


    Scaffold(

        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "PhotoLeague $selectedCategory") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFFFEF00)
                )
            )
        },
        bottomBar = { BottomNavigationBar(navController) },

        ) { padding ->

        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(Color(0xFFFFEF00))
        ) {
            PromoButton()
            CategorySelector(selectedCategory, viewModel::selectCategory)
            StreamButton()
            if (selectedCategory.isNotBlank()) {
                LazyColumn {
                    items(teams) { team ->
                        val (primaryColor, secondaryColor) = getTeamColors(team.name)
                        TeamItem(team, primaryColor, secondaryColor) {
                            navController.navigate(Screen.TeamProfile.route + "/${team.name}/$selectedCategory")
                        }
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

