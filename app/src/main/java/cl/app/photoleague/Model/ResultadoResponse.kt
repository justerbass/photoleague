package cl.app.photoleague.Model

data class ResultadoResponse(
    val puntosPorEquipo: List<PuntosPorEquipo>,
    val puntosPorPiloto: List<PuntosPorPiloto>,
    val torneo_id: String,
    val entry_list: List<Entry>
)
