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
fun PromoButton() {
    val context = LocalContext.current
    val sponsorUrl =
        "https://simufy.com/?ref=photoracertv"

    Button(
        onClick = {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(sponsorUrl))
            context.startActivity(intent)
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFe0e0d4))
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_brand_claim_black_120x2),
            contentDescription = "simufy logo",
            contentScale = ContentScale.FillBounds
        )

    }
}