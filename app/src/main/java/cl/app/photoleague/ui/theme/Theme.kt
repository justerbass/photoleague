package cl.app.photoleague.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val AppColorScheme = lightColorScheme(

    primary = Color.Red,
    secondary = canary,
    tertiary = SimufyPrimary,
    background = background,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onTertiary = Silver,
    onBackground = Color.White,
    onSurface = Color.Black,
    error = Color.Red,
    onError = Color.White
)

@Composable
fun PhotoLeagueTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = Typography,
        content = content
    )
}