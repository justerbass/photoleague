package cl.app.photoleague.Model

data class PuntosPorPiloto(
    val piloto_id: Int,
    val torneo_id: Int,
    val puntos_totales: String,
    val rondas: Int,
    val total_incidents: Int,
    val piloto_nombre: String,
    val equipo_nombre: String
)
