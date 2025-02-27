package cl.app.photoleague.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cl.app.photoleague.R

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
            .padding(16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6441a5))
    ) {
        Image(painter = painterResource(id = R.drawable.icons8_twitch_384),
            contentDescription = "twitch icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(32.dp).padding(end = 8.dp)
            )
        Text(" Ver el Stream de la Carrera")
    }
}