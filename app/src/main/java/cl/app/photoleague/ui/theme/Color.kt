package cl.app.photoleague.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val FerrariPrimary = Color(0xFFDC0000)
val FerrariSecondary = Color(0xFFFF2800)

val RedBullPrimary = Color(0xFF0033A0)
val RedBullSecondary = Color(0xFFDA291C)

val McLarenPrimary = Color(0xFFFF8700)
val McLarenSecondary = Color(0xFFFFB700)

val WilliamsPrimary = Color(0xFF041E42)
val WilliamsSecondary = Color(0xFF0082FA)

val AstonMartinPrimary = Color(0xFF006F62)
val AstonMartinSecondary = Color(0xFF00A499)

val HaasPrimary = Color(0xFFE10600)
val HaasSecondary = Color.Black

val RenaultPrimary = Color(0xFF0E88D3)
val RenaultSecondary = Color(0xFFFFD700)

val MercedesPrimary = Color(0xFF6CD3BF)
val MercedesSecondary = Color(0xFF1E1E1E)

val RacingBullsPrimary = Color(0xFF1E41FF)
val RacingBullsSecondary = Color(0xFFFFD700)

val KickSauberPrimary = Color(0xFF00E701)
val KickSauberSecondary = Color(0xFF0B0E0F)

val JordanPrimary = Color(0xFFFFD700)
val JordanSecondary = Color.Black

val BrawnPrimary = Color(0xFFCEDC00)
val BrawnSecondary = Color.White

val SimufyPrimary = Color(0xFFff5730)
val SimufySecondary = Color(0xFFe0e0d4)

fun getTeamColors(teamName: String): Pair<Color, Color> {
    return when (teamName) {
        "Ferrari" -> Pair(FerrariPrimary, FerrariSecondary)
        "Red Bull" -> Pair(RedBullPrimary, RedBullSecondary)
        "McLaren" -> Pair(McLarenPrimary, McLarenSecondary)
        "Williams" -> Pair(WilliamsPrimary, WilliamsSecondary)
        "Aston Martin" -> Pair(AstonMartinPrimary, AstonMartinSecondary)
        "Haas" -> Pair(HaasPrimary, HaasSecondary)
        "Renault" -> Pair(RenaultPrimary, RenaultSecondary)
        "Mercedes" -> Pair(MercedesPrimary, MercedesSecondary)
        "Racing Bulls" -> Pair(RacingBullsPrimary, RacingBullsSecondary)
        "Kick Sauber" -> Pair(KickSauberPrimary, KickSauberSecondary)
        "Jordan" -> Pair(JordanPrimary, JordanSecondary)
        "Brawn" -> Pair(BrawnPrimary, BrawnSecondary)
        "Simufy Wildcard" -> Pair(SimufyPrimary, SimufySecondary)
        else -> Pair(Color.Gray, Color.DarkGray)
    }
}

val canary = Color(0xFFFFD54F)
val background = Color(0xFF0B0E0F)

val Gold = Color(0xFFCFB53B)
val Silver = Color(0xFFC0C0C0)
val Bronze = Color(0xFFCD7F32)