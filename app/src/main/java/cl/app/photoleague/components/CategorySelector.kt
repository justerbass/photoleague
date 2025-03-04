package cl.app.photoleague.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun CategorySelector(selectedCategory: String, onCategorySelected: (String) -> Unit) {
    val categories = listOf("F1 Pro", "F2 Junior", "F3 Academy")

    val categoryColors = mapOf(
        "F1 Pro" to Color(0xFFE10600),
        "F2 Junior" to Color(0xFF004267),
        "F3 Academy" to Color(0xFF7E7E7E)
    )

    Row(
        modifier = Modifier
            .fillMaxWidth(),

        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        categories.forEach { category ->
            Button(
                onClick = { onCategorySelected(category) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = categoryColors[category] ?: Color.Gray,
                    contentColor = Color.White
                ),
                modifier = Modifier.weight(1f).padding(4.dp)
            ) {
                Text(category, fontWeight = FontWeight.Bold)
            }
        }
    }
}