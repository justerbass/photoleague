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
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "RB",
            "Muros Lovers",
            "[PEC] FelipeBau09",
            R.drawable.redbull_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "MCL",
            "No Speed Limit",
            "Comerut",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "WIL",
            "Zero Racing",
            "Reversemodex (Fer)",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "AS",
            "Team No Pace",
            "Alberto Alcalá Cano | LGNZH",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "HAS",
            "Jaspersor",
            "paulaaa_moreno",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "REN",
            "Caracoles Furiosos",
            "MAOMOGA_56",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "MER",
            "Next Lap",
            "MERCURIO",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "RBS",
            "Toros Racing",
            "el provi",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "KS",
            "Mancos",
            "Christiantmt14",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "JOR",
            "Zorros Salvajes",
            "Fran_JM",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "BRW",
            "Nova GP",
            "Robb3n RossBrawn",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
        Teams(
            "SW",
            "Simufy Wildcard",
            "Simufy",
            R.drawable.ferrary_logo,
            R.drawable.ferrary_f1,
            R.drawable.ferrary_f2,
            R.drawable.ferrary_f3
        ),
    )

    val races = listOf(
        Races(
            "Elite",
            "Circuitro de Silverstone",
            "Gran Premio Histórico",
            "08-05-2025",
            R.drawable.silverstone,
            R.drawable.flag_of_the_united_kingdom
        ),
        Races(
            "Junior",
            "Circuitro de Snetterton",
            "Gran Premio Histórico",
            "07-05-2025",
            R.drawable.snetterton,
            R.drawable.flag_of_the_united_kingdom
        ),
        Races(
            "Academy",
            "Circuitro de Snetterton",
            "Gran Premio Histórico",
            "07-05-2025",
            R.drawable.snetterton,
            R.drawable.flag_of_the_united_kingdom
        ),

        Races(
            "Elite",
            "Circuitro de Road América",
            "Gran Premio de EEUU",
            "15-05-2025",
            R.drawable.road_america,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "Junior",
            "Circuitro de Road América",
            "Gran Premio de EEUU",
            "14-05-2025",
            R.drawable.road_america,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "Academy",
            "Circuitro de Summit Point",
            "Gran Premio de EEUU",
            "14-05-2025",
            R.drawable.road_america,
            R.drawable.flag_of_the_united_states
        ),

        Races(
            "Elite",
            "Circuitro de Monza",
            "Gran Premio de Europa",
            "22-05-2025",
            R.drawable.monza,
            R.drawable.flag_of_italy
        ),
        Races(
            "Junior",
            "Circuitro de Monza",
            "Gran Premio de Europa",
            "21-05-2025",
            R.drawable.monza,
            R.drawable.flag_of_italy
        ),
        Races(
            "Academy",
            "Circuitro de Oran Rudskogen",
            "Gran Premio de Europa",
            "21-05-2025",
            R.drawable.rudskogen,
            R.drawable.flag_of_norway
        ),

        Races(
            "Elite",
            "Circuitro de Suzuka",
            "Gran Premio del Pacífico",
            "28-05-2025",
            R.drawable.suzuka,
            R.drawable.flag_of_japan
        ),
        Races(
            "Junior",
            "Circuitro de Suzuka",
            "Gran Premio del Pacífico",
            "27-05-2025",
            R.drawable.suzuka,
            R.drawable.flag_of_japan
        ),
        Races(
            "Academy",
            "Circuitro de Winton",
            "Gran Premio del Pacífico",
            "27-05-2025",
            R.drawable.winton,
            R.drawable.flag_of_australia
        ),

        Races(
            "Elite",
            "Circuitro de Interlagos",
            "Gran Premio de las Américas",
            "05-06-2025",
            R.drawable.interlagos,
            R.drawable.flag_of_brazil
        ),
        Races(
            "Junior",
            "Circuitro de Laguna Seca",
            "Gran Premio de las Américas",
            "04-06-2025",
            R.drawable.laguna_seca,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "Academy",
            "Circuitro de Laguna Seca",
            "Gran Premio de las Américas",
            "04-06-2025",
            R.drawable.laguna_seca,
            R.drawable.flag_of_the_united_states
        ),

        Races(
            "Elite",
            "Circuitro de Catalunya",
            "Gran Premio de Iberia",
            "12-06-2025",
            R.drawable.catalunya,
            R.drawable.bandera_nacional_de_espana
        ),
        Races(
            "Junior",
            "Circuitro de Catalunya",
            "Gran Premio de Iberia",
            "11-06-2025",
            R.drawable.catalunya,
            R.drawable.bandera_nacional_de_espana
        ),
        Races(
            "Academy",
            "Circuitro de Navarra",
            "Gran Premio de Iberia",
            "11-06-2025",
            R.drawable.navarra,
            R.drawable.bandera_nacional_de_espana
        ),
    )
}