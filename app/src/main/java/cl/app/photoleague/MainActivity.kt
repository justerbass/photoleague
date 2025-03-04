package cl.app.photoleague

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import cl.app.photoleague.navigation.NavManager
import cl.app.photoleague.ui.theme.PhotoLeagueTheme
import cl.app.photoleague.viewModel.TeamsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: TeamsViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            PhotoLeagueTheme {
                NavManager(viewModel)
            }
        }
    }
}




