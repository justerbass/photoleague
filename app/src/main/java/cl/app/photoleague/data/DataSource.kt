package cl.app.photoleague.data

import cl.app.photoleague.Model.Races
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.R

object DataSource {

    val teams = listOf(
        Teams(
            "FER",
            "Red Motors",
            "proyectohistoria",
            R.drawable.red_motors,
            R.drawable.red_motors_f1,
            R.drawable.red_motors_f2,
            R.drawable.red_motors_f3
        ),
        Teams(
            "RB",
            "Muros Lovers",
            "[PEC] FelipeBau09",
            R.drawable.muros_lovers,
            R.drawable.muros_lovers_f1,
            R.drawable.muros_lovers_f2,
            R.drawable.muros_lovers_f3
        ),
        Teams(
            "MCL",
            "No Speed Limit",
            "Maomoga_56",
            R.drawable.no_speed_limit,
            R.drawable.no_speed_limit_f1,
            R.drawable.no_speed_limit_f2,
            R.drawable.no_speed_limit_f3
        ),
        Teams(
            "WIL",
            "Zero Racing",
            "Reversemodex (Fer)",
            R.drawable.zero_racing,
            R.drawable.zero_racing_f1,
            R.drawable.zero_racing_f2,
            R.drawable.zero_racing_f3
        ),
        Teams(
            "AS",
            "Team No Pace",
            "Lgnzh",
            R.drawable.team_no_pace,
            R.drawable.team_no_pace_f1,
            R.drawable.team_no_pace_f2,
            R.drawable.team_no_pace_f3
        ),
        Teams(
            "HAS",
            "Jaspersor",
            "paulaaa_moreno",
            R.drawable.jaspersor,
            R.drawable.jaspersor_f1,
            R.drawable.jaspersor_f2,
            R.drawable.jaspersor_f3
        ),
        Teams(
            "REN",
            "Caracoles Furiosos",
            "xGersonG",
            R.drawable.caracoles_furiosos,
            R.drawable.caracoles_furiosos_f1,
            R.drawable.caracoles_furiosos_f2,
            R.drawable.caracoles_furiosos_f3
        ),
        Teams(
            "MER",
            "Next Lap",
            "Snowdenesp",
            R.drawable.next_lap,
            R.drawable.next_lap_f1,
            R.drawable.next_lap_f2,
            R.drawable.next_lap_f3
        ),
        Teams(
            "RBS",
            "Toros Racing",
            "Proviagus",
            R.drawable.toros_racing,
            R.drawable.toros_racing_f1,
            R.drawable.toros_racing_f2,
            R.drawable.toros_racing_f3
        ),
        Teams(
            "KS",
            "Mancos",
            "Christiantmt14",
            R.drawable.mancos,
            R.drawable.mancos_f1,
            R.drawable.mancos_f2,
            R.drawable.mancos_f3
        ),
        Teams(
            "JOR",
            "Zorros Salvajes",
            "fjm_mamolas",
            R.drawable.zorros_salvajes,
            R.drawable.zorros_salvajes_f1,
            R.drawable.zorros_salvajes_f2,
            R.drawable.zorros_salvajes_f3
        ),
        Teams(
            "BRW",
            "Nova GP",
            "Robb3n23",
            R.drawable.nova_gp,
            R.drawable.nova_gp_f1,
            R.drawable.nova_gp_f2,
            R.drawable.nova_gp_f3
        ),
        Teams(
            "SW",
            "Simufy Wildcard",
            "Simufy",
            R.drawable.simufy_wildcard,
            R.drawable.simufy_wildcard_f1,
            R.drawable.simufy_wildcard_f2,
            R.drawable.simufy_wildcard_f3
        ),
    )

    val races = listOf(
        Races(
            "Elite",
            "Circuitro de Silverstone",
            "Gran Premio Histórico",
            "15-05-2025",
            R.drawable.silverstone,
            R.drawable.flag_of_the_united_kingdom
        ),
        Races(
            "Junior",
            "Circuitro de Snetterton",
            "Gran Premio Histórico",
            "14-05-2025",
            R.drawable.snetterton,
            R.drawable.flag_of_the_united_kingdom
        ),
        Races(
            "Academy",
            "Circuitro de Snetterton",
            "Gran Premio Histórico",
            "14-05-2025",
            R.drawable.snetterton,
            R.drawable.flag_of_the_united_kingdom
        ),

        Races(
            "Elite",
            "Circuitro de Road América",
            "Gran Premio de EEUU",
            "22-05-2025",
            R.drawable.road_america,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "Junior",
            "Circuitro de Road América",
            "Gran Premio de EEUU",
            "21-05-2025",
            R.drawable.road_america,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "Academy",
            "Circuitro de Summit Point",
            "Gran Premio de EEUU",
            "21-05-2025",
            R.drawable.road_america,
            R.drawable.flag_of_the_united_states
        ),

        Races(
            "Elite",
            "Circuitro de Monza",
            "Gran Premio de Europa",
            "29-05-2025",
            R.drawable.monza,
            R.drawable.flag_of_italy
        ),
        Races(
            "Junior",
            "Circuitro de Monza",
            "Gran Premio de Europa",
            "28-05-2025",
            R.drawable.monza,
            R.drawable.flag_of_italy
        ),
        Races(
            "Academy",
            "Circuitro de Oran Rudskogen",
            "Gran Premio de Europa",
            "28-05-2025",
            R.drawable.rudskogen,
            R.drawable.flag_of_norway
        ),

        Races(
            "Elite",
            "Circuitro de Suzuka",
            "Gran Premio del Pacífico",
            "05-06-2025",
            R.drawable.suzuka,
            R.drawable.flag_of_japan
        ),
        Races(
            "Junior",
            "Circuitro de Suzuka",
            "Gran Premio del Pacífico",
            "04-06-2025",
            R.drawable.suzuka,
            R.drawable.flag_of_japan
        ),
        Races(
            "Academy",
            "Circuitro de Winton",
            "Gran Premio del Pacífico",
            "04-06-2025",
            R.drawable.winton,
            R.drawable.flag_of_australia
        ),

        Races(
            "Elite",
            "Circuitro de Interlagos",
            "Gran Premio de las Américas",
            "12-06-2025",
            R.drawable.interlagos,
            R.drawable.flag_of_brazil
        ),
        Races(
            "Junior",
            "Circuitro de Laguna Seca",
            "Gran Premio de las Américas",
            "11-06-2025",
            R.drawable.laguna_seca,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "Academy",
            "Circuitro de Laguna Seca",
            "Gran Premio de las Américas",
            "11-06-2025",
            R.drawable.laguna_seca,
            R.drawable.flag_of_the_united_states
        ),

        Races(
            "Elite",
            "Circuitro de Catalunya",
            "Gran Premio de Iberia",
            "19-06-2025",
            R.drawable.catalunya,
            R.drawable.bandera_nacional_de_espana
        ),
        Races(
            "Junior",
            "Circuitro de Catalunya",
            "Gran Premio de Iberia",
            "18-06-2025",
            R.drawable.catalunya,
            R.drawable.bandera_nacional_de_espana
        ),
        Races(
            "Academy",
            "Circuitro de Navarra",
            "Gran Premio de Iberia",
            "18-06-2025",
            R.drawable.navarra,
            R.drawable.bandera_nacional_de_espana
        ),
    )
}