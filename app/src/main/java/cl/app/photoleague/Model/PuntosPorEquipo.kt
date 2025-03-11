package cl.app.photoleague.Model

data class PuntosPorEquipo(
    val equipo_id: Int,
    val torneo_id: Int,
    val total_puntos: String,
    val equipo_nombre: String
)
