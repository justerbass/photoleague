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
fun PromoButton() {
    val context = LocalContext.current
    val sponsorUrl =
        "https://simufy.com/?sca_ref=5427618.iHB2Jjourw&utm_source=afiliados&utm_medium=photo-racertv&utm_campaign=77152"

    Button(
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(sponsorUrl))
            context.startActivity(intent)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text("Visita Nuestro Patrocinador")
    }
}