package cl.app.photoleague.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import cl.app.photoleague.navigation.BottomNavigationBar


@Composable
fun Streaming(navController: NavController){
    Scaffold (bottomBar = { BottomNavigationBar(navController) })

    {   padding ->
        Box(modifier = Modifier.padding(padding)){

        }

    }
}