package cl.app.photoleague.Model

data class Entry(
    val equipo_nombre: String,
    val equipo_color: String,
    val team: Int,
    val driver: Int,
    val piloto_nombre: String,
    val twitch_nick: String?,
    val custom_display_name: String?,
    val country: String,
    val final_country_code: String,
    val image_url: String?,
    val logo_url: String?,
    val first_name: String,
    val last_name: String
)
