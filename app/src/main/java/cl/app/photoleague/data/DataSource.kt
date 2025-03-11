package cl.app.photoleague.data

import cl.app.photoleague.Model.Races
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.R

object DataSource {

    val teams = listOf(
        Teams(
            "FER",
            "Ferrari",
            "proyectohistoria",
        ),
        Teams(
            "RB",
            "Red Bull",
            "[PEC] FelipeBau09",
        ),
        Teams(
            "MCL",
            "McLaren",
            "Comerut",
        ),
        Teams(
            "WIL",
            "Williams",
            "Reversemodex (Fer)",
        ),
        Teams(
            "AS",
            "Aston Martin",
            "Alberto Alcalá Cano | LGNZH",
        ),
        Teams(
            "HAS",
            "Haas",
            "paulaaa_moreno",
        ),
        Teams(
            "REN",
            "Renault",
            "MAOMOGA_56",
        ),
        Teams(
            "MER",
            "Mercedes",
            "MERCURIO",
        ),
        Teams(
            "RBS",
            "Racing Bulls",
            "el provi",
        ),
        Teams(
            "KS",
            "Kick Sauber",
            "Christiantmt14",
        ),
        Teams(
            "JOR",
            "Jordan",
            "Fran_JM"
        ),
        Teams(
            "BRW",
            "Brawn GP",
            "Robb3n RossBrawn",
        ),
        Teams(
            "SW",
            "Simufy Wildcard",
            "Simufy",
        ),
    )

    val races = listOf(
        Races(
            "F1 Pro",
            "Circuitro de Virginia",
            "Gran Premio de EEUU",
            "27-02-2025",
            R.drawable.virginia,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "F2 Junior",
            "Circuitro de Virginia",
            "Gran Premio de EEUU",
            "27-02-2025",
            R.drawable.virginia,
            R.drawable.flag_of_the_united_states
        ),
        Races(
            "F3 Academy",
            "Circuitro de Laguna Seca",
            "Gran Premio de EEUU",
            "26-02-2025",
            R.drawable.laguna_seca,
            R.drawable.flag_of_the_united_states
        ),

        Races(
            "F1 Pro",
            "Circuitro de Catalunya",
            "Gran Premio de España",
            "06-03-2025",
            R.drawable.catalunya,
            R.drawable.bandera_nacional_de_espana
        ),
        Races(
            "F2 Junior",
            "Circuitro de Catalunya",
            "Gran Premio de España",
            "06-03-2025",
            R.drawable.catalunya,
            R.drawable.bandera_nacional_de_espana
        ),
        Races(
            "F3 Academy",
            "Circuitro de Navarra",
            "Gran Premio de España",
            "05-03-2025",
            R.drawable.navarra,
            R.drawable.bandera_nacional_de_espana
        ),

        Races(
            "F1 Pro",
            "Circuitro de Okayama",
            "Gran Premio del Pacífico",
            "13-03-2025",
            R.drawable.okayama,
            R.drawable.flag_of_pacific
        ),
        Races(
            "F2 Junior",
            "Circuitro de Okayama",
            "Gran Premio del Pacífico",
            "13-03-2025",
            R.drawable.okayama,
            R.drawable.flag_of_pacific
        ),
        Races(
            "F3 Academy",
            "Circuitro de Oran Park",
            "Gran Premio del Pacífico",
            "12-03-2025",
            R.drawable.oran_park,
            R.drawable.flag_of_pacific
        ),

        Races(
            "F1 Pro",
            "Circuitro de Silverstone",
            "Gran Premio de Gran Bretaña",
            "20-03-2025",
            R.drawable.silverstone,
            R.drawable.flag_of_the_united_kingdom
        ),
        Races(
            "F2 Junior",
            "Circuitro de Silverstone",
            "Gran Premio de Gran Bretaña",
            "20-03-2025",
            R.drawable.silverstone,
            R.drawable.flag_of_the_united_kingdom
        ),
        Races(
            "F3 Academy",
            "Circuitro de Silverstone",
            "Gran Premio de Gran Bretaña",
            "19-03-2025",
            R.drawable.silverstone,
            R.drawable.flag_of_the_united_kingdom
        ),

        Races(
            "F1 Pro",
            "Circuitro de Nurburgring",
            "Gran Premio de Alemania",
            "27-03-2025",
            R.drawable.nurburgring,
            R.drawable.flag_of_germany
        ),
        Races(
            "F2 Junior",
            "Circuitro de Nurburgring",
            "Gran Premio de Alemania",
            "27-03-2025",
            R.drawable.nurburgring,
            R.drawable.flag_of_germany
        ),
        Races(
            "F3 Academy",
            "Circuitro de Orschersleben",
            "Gran Premio de Alemania",
            "26-03-2025",
            R.drawable.orschersleben,
            R.drawable.flag_of_germany
        ),

        Races(
            "F1 Pro",
            "Circuitro de Spa-Francorchams",
            "Gran Premio de Bélgica",
            "03-04-2025",
            R.drawable.spa_francorchamps,
            R.drawable.flag_of_belgium
        ),
        Races(
            "F2 Junior",
            "Circuitro de Spa-Francorchams",
            "Gran Premio de Bélgica",
            "03-04-2025",
            R.drawable.spa_francorchamps,
            R.drawable.flag_of_belgium
        ),
        Races(
            "F3 Academy",
            "Circuitro de Spa-Francorchams",
            "Gran Premio de Bélgica",
            "02-04-2025",
            R.drawable.spa_francorchamps,
            R.drawable.flag_of_belgium
        ),
    )
}