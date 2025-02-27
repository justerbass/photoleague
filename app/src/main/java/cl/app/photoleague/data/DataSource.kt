package cl.app.photoleague.data

import cl.app.photoleague.Model.Drivers
import cl.app.photoleague.Model.Races
import cl.app.photoleague.Model.Teams
import cl.app.photoleague.R

object DataSource {

    private val f1Drivers = listOf(
        Drivers(1, "Hugo Wulf", "FER", "F1", 0),
        Drivers(2, "FFuuNNeeSS", "FER", "F1", 0),
        Drivers(3, "Cristina Pérez", "RB", "F1", 0),
        Drivers(4, "Felix Redondo (redonares)", "RB", "F1", 0),
        Drivers(5, "Fran Romero Lázaro", "MCL", "F1", 0),
        Drivers(6, "alvaro inchausti", "MCL", "F1", 0),
        Drivers(7, "Diego Fernandez", "WIL", "F1", 0),
        Drivers(8, "Alex Puertas", "WIL", "F1", 0),
        Drivers(9, "Pau Armemesto / ARMEMES", "AS", "F1", 0),
        Drivers(10, "Iván Pérez | NanoMosca", "AS", "F1", 0),
        Drivers(11, "Miguel Angel Gutierrez Estevez2", "HAS", "F1", 0),
        Drivers(12, "Tony_tgn", "HAS", "F1", 0),
        Drivers(13, "Raúl Martín", "REN", "F1", 0),
        Drivers(14, "McSabroson", "REN", "F1", 0),
        Drivers(15, "xurde", "MER", "F1", 0),
        Drivers(16, "Abel Sánchez", "MER", "F1", 0),
        Drivers(17, "Marc de Fulgencio", "RBS", "F1", 0),
        Drivers(18, "Tejerinhoo", "RBS", "F1", 0),
        Drivers(19, "izan_asecas", "KS", "F1", 0),
        Drivers(20, "Tomas Gonzalez Lo", "KS", "F1", 0),
        Drivers(21, "PhotoRacerTV", "JOR", "F1", 0),
        Drivers(22, "f1mproplayer", "JOR", "F1", 0),
        Drivers(23, "Axel Vilar (Mr Phoskitos)", "BRW", "F1", 0),
        Drivers(24, "Antonio Ridao(Ridmar)", "BRW", "F1", 0)
    )

    private val f2Drivers = listOf(
        Drivers(1, "Jorge De La Gracia", "FER", "F2", 0),
        Drivers(2, "Gelson Godoy", "FER", "F2", 0),
        Drivers(3, "Matias Cunial", "FER", "F2", 0),
        Drivers(4, "Eder Goros", "RB", "F2", 0),
        Drivers(5, "Alesander Rodrigo", "RB", "F2", 0),
        Drivers(6, "Adrián Fariñas Rodríguez", "RB", "F2", 0),
        Drivers(7, "Arteom Tambur", "MCL", "F2", 0),
        Drivers(8, "Aitor Galbarriartu", "MCL", "F2", 0),
        Drivers(9, "Gustavo Gutiérrez", "MCL", "F2", 0),
        Drivers(10, "Rubén Iglesias Cotelo", "WIL", "F2", 0),
        Drivers(11, "Rubén Rodríguez Cueto", "WIL", "F2", 0),
        Drivers(12, "Enrique Yusta", "WIL", "F2", 0),
        Drivers(13, "Javier Soto", "AS", "F2", 0),
        Drivers(14, "Ángel Trinidad De Haro", "AS", "F2", 0),
        Drivers(15, "Adri Casado", "AS", "F2", 0),
        Drivers(16, "Héctor Pérez", "HAS", "F2", 0),
        Drivers(17, "Álvaro Fernández", "HAS", "F2", 0),
        Drivers(18, "Marcos Argibay", "HAS", "F2", 0),
        Drivers(19, "Daniel Pumar", "REN", "F2", 0),
        Drivers(20, "Maria Primo Leal", "REN", "F2", 0),
        Drivers(21, "Adrian Dominguez", "REN", "F2", 0),
        Drivers(22, "Saul Ardura", "MER", "F2", 0),
        Drivers(23, "Javier Linares Hernandez", "MER", "F2", 0),
        Drivers(24, "Josu Leciñana", "MER", "F2", 0),
        Drivers(25, "Mariano Quilez", "RBS", "F2", 0),
        Drivers(26, "Francisco Cadenas Ruiz", "RBS", "F2", 0),
        Drivers(27, "David Hernández Leciñana", "RBS", "F2", 0),
        Drivers(28, "Asier López Lobato", "KS", "F2", 0),
        Drivers(29, "Marc Martínez Mascarell", "KS", "F2", 0),
        Drivers(30, "Guillem Musarro", "KS", "F2", 0),
        Drivers(31, "Alejandro Guerrero", "JOR", "F2", 0),
        Drivers(32, "Alberto Gallardo Aviles", "JOR", "F2", 0),
        Drivers(33, "Ignacio Rodríguez", "JOR", "F2", 0),
        Drivers(34, "Adrian Cespedes Gomez", "BRW", "F2", 0),
        Drivers(35, "Felipe Solari", "BRW", "F2", 0),
        Drivers(36, "Oriol Montoy", "BRW", "F2", 0)
    )

    private val f3Drivers = listOf(
        Drivers(1, "Gonzalo Barros", "FER", "F3", 43),
        Drivers(2, "David Goldaracena", "FER", "F3", 121),
        Drivers(3, "Jose Muñoz Torres", "FER", "F3", 8),
        Drivers(4, "David Del Pino", "RB", "F3", 64),
        Drivers(5, "Julian Tur", "RB", "F3", 5),
        Drivers(6, "Francisco Alfaro", "RB", "F3", 105),
        Drivers(7, "Gustavo Gutiérrez", "MCL", "F3", 36),
        Drivers(8, "Diego Guggiari", "MCL", "F3", 0),
        Drivers(9, "Carlos Medero", "MCL", "F3", 0),
        Drivers(10, "Gerard Boldú", "WIL", "F3", 55),
        Drivers(11, "Alex Bretones", "WIL", "F3", 12),
        Drivers(12, "Piloto F3 a confirmar", "WIL", "F3", 0),
        Drivers(13, "José Moya", "AS", "F3", 18),
        Drivers(14, "Javier Mosquera", "AS", "F3", 76),
        Drivers(15, "Miguel F Villegas", "AS", "F3", 1),
        Drivers(16, "Ignacio Jimenez", "HAS", "F3", 13),
        Drivers(17, "Jorge Guillen", "HAS", "F3", 0),
        Drivers(18, "Ian Trevol", "HAS", "F3", 47),
        Drivers(19, "Jose Salinas", "REN", "F3", 20),
        Drivers(20, "Alejandro Rieiro", "REN", "F3", 97),
        Drivers(21, "Sergi Quesada Ramos", "REN", "F3", 40),
        Drivers(22, "Xose Deniz", "MER", "F3", 76),
        Drivers(23, "Diego De La Fuente", "MER", "F3", 19),
        Drivers(24, "Raul Garciar", "MER", "F3", 19),
        Drivers(25, "Luis Pensado", "RBS", "F3", 0),
        Drivers(26, "Pablo Chaves", "RBS", "F3", 43),
        Drivers(27, "Adam Train", "RBS", "F3", 54),
        Drivers(28, "Francisco Javier Jimenez Gomez", "KS", "F3", 28),
        Drivers(29, "Arturo Rodriguez Alonso", "KS", "F3", 0),
        Drivers(30, "Alejandro Martín de Miguel", "KS", "F3", 92),
        Drivers(31, "Antonio Vicente Linares", "JOR", "F3", 36),
        Drivers(32, "MJ Neira", "JOR", "F3", 30),
        Drivers(33, "Martin Echevarria", "JOR", "F3", 17),
        Drivers(34, "Guillermo Vilas", "BRW", "F3", 44),
        Drivers(35, "Jesus Cruz", "BRW", "F3", 5),
        Drivers(36, "Juan Diego Jimenez Robles", "BRW", "F3", 16)
    )

    val teams = listOf(
        Teams(
            "FER",
            "Ferrari",
            "proyectohistoria",
            f1Drivers.filter { it.teamId == "FER" },
            f2Drivers.filter { it.teamId == "FER" },
            f3Drivers.filter { it.teamId == "FER" }),
        Teams(
            "RB",
            "Red Bull",
            "[PEC] FelipeBau09",
            f1Drivers.filter { it.teamId == "RB" },
            f2Drivers.filter { it.teamId == "RB" },
            f3Drivers.filter { it.teamId == "RB" }),
        Teams(
            "MCL",
            "McLaren",
            "Comerut",
            f1Drivers.filter { it.teamId == "MCL" },
            f2Drivers.filter { it.teamId == "MCL" },
            f3Drivers.filter { it.teamId == "MCL" }),
        Teams(
            "WIL",
            "Williams",
            "Reversemodex (Fer)",
            f1Drivers.filter { it.teamId == "WIL" },
            f2Drivers.filter { it.teamId == "WIL" },
            f3Drivers.filter { it.teamId == "WIL" }),
        Teams(
            "AS",
            "Aston Martin",
            "Alberto Alcalá Cano | LGNZH",
            f1Drivers.filter { it.teamId == "AS" },
            f2Drivers.filter { it.teamId == "AS" },
            f3Drivers.filter { it.teamId == "AS" }),
        Teams(
            "HAS",
            "Haas",
            "paulaaa_moreno",
            f1Drivers.filter { it.teamId == "HAS" },
            f2Drivers.filter { it.teamId == "HAS" },
            f3Drivers.filter { it.teamId == "HAS" }),
        Teams(
            "REN",
            "Renault",
            "MAOMOGA_56",
            f1Drivers.filter { it.teamId == "REN" },
            f2Drivers.filter { it.teamId == "REN" },
            f3Drivers.filter { it.teamId == "REN" }),
        Teams(
            "MER",
            "Mercedes",
            "MERCURIO",
            f1Drivers.filter { it.teamId == "MER" },
            f2Drivers.filter { it.teamId == "MER" },
            f3Drivers.filter { it.teamId == "MER" }),
        Teams(
            "RBS",
            "Racing Bulls",
            "el provi",
            f1Drivers.filter { it.teamId == "RBS" },
            f2Drivers.filter { it.teamId == "RBS" },
            f3Drivers.filter { it.teamId == "RBS" }),
        Teams(
            "KS",
            "Kick Sauber",
            "Christiantmt14",
            f1Drivers.filter { it.teamId == "KS" },
            f2Drivers.filter { it.teamId == "KS" },
            f3Drivers.filter { it.teamId == "KS" }),
        Teams(
            "JOR",
            "Jordan",
            "Fran_JM",
            f1Drivers.filter { it.teamId == "JOR" },
            f2Drivers.filter { it.teamId == "JOR" },
            f3Drivers.filter { it.teamId == "JOR" }),
        Teams(
            "BRW",
            "Brawn",
            "Robb3n RossBrawn",
            f1Drivers.filter { it.teamId == "BRW" },
            f2Drivers.filter { it.teamId == "BRW" },
            f3Drivers.filter { it.teamId == "BRW" })
    )

    val races = listOf(
        Races(
            "F1 Pro",
            "Circuitro de Virginia",
            "Gran Premio de EEUU",
            "27-02-2025",
            R.drawable.virginia
        ),
        Races(
            "F2 Junior",
            "Circuitro de Virginia",
            "Gran Premio de EEUU",
            "27-02-2025",
            R.drawable.virginia
        ),
        Races(
            "F3 Academy",
            "Circuitro de Laguna Seca",
            "Gran Premio de EEUU",
            "26-02-2025",
            R.drawable.laguna_seca
        ),

        Races(
            "F1 Pro",
            "Circuitro de Catalunya",
            "Gran Premio de España",
            "06-03-2025",
            R.drawable.catalunya
        ),
        Races(
            "F2 Junior",
            "Circuitro de Catalunya",
            "Gran Premio de España",
            "06-03-2025",
            R.drawable.catalunya
        ),
        Races(
            "F3 Academy",
            "Circuitro de Navarra",
            "Gran Premio de España",
            "05-03-2025",
            R.drawable.navarra
        ),

        Races(
            "F1 Pro",
            "Circuitro de Okayama",
            "Gran Premio del Pacífico",
            "13-03-2025",
            R.drawable.okayama
        ),
        Races(
            "F2 Junior",
            "Circuitro de Okayama",
            "Gran Premio del Pacífico",
            "13-03-2025",
            R.drawable.okayama
        ),
        Races(
            "F3 Academy",
            "Circuitro de Oran Park",
            "Gran Premio del Pacífico",
            "12-03-2025",
            R.drawable.oran_park
        ),

        Races(
            "F1 Pro",
            "Circuitro de Silverstone",
            "Gran Premio de Gran Bretaña",
            "20-03-2025",
            R.drawable.silverstone
        ),
        Races(
            "F2 Junior",
            "Circuitro de Silverstone",
            "Gran Premio de Gran Bretaña",
            "20-03-2025",
            R.drawable.silverstone
        ),
        Races(
            "F3 Academy",
            "Circuitro de Silverstone",
            "Gran Premio de Gran Bretaña",
            "19-03-2025",
            R.drawable.silverstone
        ),

        Races(
            "F1 Pro",
            "Circuitro de Nurburgring",
            "Gran Premio de Alemania",
            "27-03-2025",
            R.drawable.nurburgring
        ),
        Races(
            "F2 Junior",
            "Circuitro de Nurburgring",
            "Gran Premio de Alemania",
            "27-03-2025",
            R.drawable.nurburgring
        ),
        Races(
            "F3 Academy",
            "Circuitro de Orschersleben",
            "Gran Premio de Alemania",
            "26-03-2025",
            R.drawable.orschersleben
        ),

        Races(
            "F1 Pro",
            "Circuitro de Spa-Francorchams",
            "Gran Premio de Bélgica",
            "03-04-2025",
            R.drawable.spa_francorchamps
        ),
        Races(
            "F2 Junior",
            "Circuitro de Spa-Francorchams",
            "Gran Premio de Bélgica",
            "03-04-2025",
            R.drawable.spa_francorchamps
        ),
        Races(
            "F3 Academy",
            "Circuitro de Spa-Francorchams",
            "Gran Premio de Bélgica",
            "02-04-2025",
            R.drawable.spa_francorchamps
        ),
    )
}