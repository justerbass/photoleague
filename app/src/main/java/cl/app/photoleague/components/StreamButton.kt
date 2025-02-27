package cl.app.photoleague.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun StreamButton() {
    val context = LocalContext.current
    val streamUrl = "https://www.twitch.tv/photoracertv"

    Button(
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(streamUrl))
            context.startActivity(intent)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text("📺 Ver el Stream de la Carrera")
    }
}