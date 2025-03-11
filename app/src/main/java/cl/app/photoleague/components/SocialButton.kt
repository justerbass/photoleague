package cl.app.photoleague.components

import android.content.Intent

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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

@Composable
fun SocialButton(
    appsocial: String,
    websocial: String,
    red: String,
    icon: Int,
    containercolor: Color,

    ) {
    val context = LocalContext.current
    Button(
        onClick = {
            try {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(appsocial)
                )
                context.startActivity(intent)
            } catch (e: Exception) {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(websocial)
                )
                context.startActivity(intent)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .height(48.dp),
        colors = ButtonDefaults.buttonColors(containerColor = containercolor)
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = red,
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(32.dp).padding(end = 8.dp)
        )
        Text(text = "Ver mas Noticias en $red")
    }
}