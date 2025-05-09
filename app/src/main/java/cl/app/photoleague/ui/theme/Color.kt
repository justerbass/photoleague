package cl.app.photoleague.ui.theme

import androidx.compose.ui.graphics.Color
import java.util.jar.JarFile

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val RedPrimary = Color(0xFFDC0000)
val RedSecondary = Color.Black

val MurosPrimary = Color(0xFFC8081B)
val MurosSecondary = Color(0xFF168299)

val SpeedPrimary = Color(0xFFD72E28)
val SpeedSecondary = Color.Black

val ZeroPrimary = Color(0xFF1B2D69)
val ZeroSecondary = Color(0xFF00A0DE)

val PacePrimary = Color(0xFF2BBF6B)
val PaceSecondary = Color(0xFFC1B7B0)

val JaspersorPrimary = Color(0xFFC8857F)
val JaspersorSecondary = Color(0xFF2D6B91)

val CaracolPrimary = Color(0xFFB9812A)
val CaracolSecondary = Color(0xFFA3292C)

val NextPrimary = Color(0xFF093EE7)
val NextSecondary = Color(0xFFBEDB50)

val TorosPrimary = Color(0xFFEB2B2B)
val TorosSecondary = Color(0xFF9F9896)

val MancosPrimary = Color(0xFF23AAB8)
val MancosSecondary = Color(0xFF7F7F7F)

val ZorrosPrimary = Color(0xFFFFD700)
val ZorrosSecondary = Color.Black

val NovaPrimary = Color(0xFF019B93)
val NovaSecondary = Color(0xFFBAB911)

val SimufyPrimary = Color(0xFFff5730)
val SimufySecondary = Color.Black

val canary = Color(0xFFFFD54F)
val background = Color(0xFF0B0E0F)

val Gold = Color(0xFFCFB53B)
val Silver = Color(0xFFC0C0C0)
val Bronze = Color(0xFFCD7F32)

val twitterColor = Color(0xFF00ACEE)
val instagramColor = Color(0xFF405DE6)

fun getTeamColors(teamName: String): Pair<Color, Color> {
    return when (teamName) {
        "Red Motors" -> Pair(RedPrimary, RedSecondary)
        "Muros Lovers" -> Pair(MurosPrimary, MurosSecondary)
        "No Speed Limit" -> Pair(SpeedPrimary, SpeedSecondary)
        "Zero Racing" -> Pair(ZeroPrimary, ZeroSecondary)
        "Team No Pace" -> Pair(PacePrimary, PaceSecondary)
        "Jaspersor" -> Pair(JaspersorPrimary, JaspersorSecondary)
        "Caracoles Furiosos" -> Pair(CaracolPrimary, CaracolSecondary)
        "Next Lap" -> Pair(NextPrimary, NextSecondary)
        "Toros Racing" -> Pair(TorosPrimary, TorosSecondary)
        "Mancos" -> Pair(MancosPrimary, MancosSecondary)
        "Zorros Salvajes" -> Pair(ZorrosPrimary, ZorrosSecondary)
        "Nova GP" -> Pair(NovaPrimary, NovaSecondary)
        "Simufy Wildcard" -> Pair(SimufyPrimary, SimufySecondary)
        else -> Pair(Color.Gray, Color.DarkGray)
    }
}
