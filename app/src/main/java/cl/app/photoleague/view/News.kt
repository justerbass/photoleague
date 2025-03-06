package cl.app.photoleague.view

import android.content.Intent
import android.net.Uri
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import cl.app.photoleague.navigation.BottomNavigationBar

@Composable
fun News(navController: NavController) {
    Scaffold(bottomBar = { BottomNavigationBar(navController) })

    { padding ->

        Box(modifier = Modifier.padding(padding)) {
            OpenInstagramButton()
        }

    }
}

@Composable
fun OpenInstagramButton() {
    val context = LocalContext.current
    Button(
        onClick = {
            try {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("instagram://user?username=photoleagueinfo")
                )
                context.startActivity(intent)
            } catch (e: Exception) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.instagram.com/photoleagueinfo")
                )
                context.startActivity(intent)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Ver Noticias en Instagram")
    }
}