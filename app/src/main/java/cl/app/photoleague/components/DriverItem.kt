package cl.app.photoleague.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cl.app.photoleague.Model.Entry


@Composable
fun DriverItem(driver: Entry, points: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = driver.piloto_nombre, style = MaterialTheme.typography.bodyLarge)
            Text(text = "Puntos: $points", style = MaterialTheme.typography.bodyMedium)
        }
    }
}