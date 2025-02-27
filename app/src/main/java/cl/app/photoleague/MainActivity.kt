package cl.app.photoleague

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import cl.app.photoleague.navigation.NavManager
import cl.app.photoleague.ui.theme.PhotoLeagueTheme
import cl.app.photoleague.viewModel.TeamsViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PhotoLeagueTheme {
                NavManager(viewModel = TeamsViewModel())
            }
        }
    }
}




