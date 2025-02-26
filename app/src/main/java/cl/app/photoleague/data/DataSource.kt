package cl.app.photoleague.data

import cl.app.photoleague.Model.Driver
import cl.app.photoleague.Model.Team

object DataSource {

    private val f1Drivers = listOf(
        Driver(1, "Hugo Wulf", "FER", "F1", 0),
        Driver(2, "FFuuNNeeSS", "FER", "F1", 0),
        Driver(3, "Cristina Pérez", "RB", "F1", 0),
        Driver(4, "Felix Redondo (redonares)", "RB", "F1", 0),
        Driver(5, "Fran Romero Lázaro", "MCL", "F1", 0),
        Driver(6, "alvaro inchausti", "MCL", "F1", 0),
        Driver(7, "Diego Fernandez", "WIL", "F1", 0),
        Driver(8, "Alex Puertas", "WIL", "F1", 0),
        Driver(9, "Pau Armemesto / ARMEMES", "AS", "F1", 0),
        Driver(10, "Iván Pérez | NanoMosca", "AS", "F1", 0),
        Driver(11, "Miguel Angel Gutierrez Estevez2", "HAS", "F1", 0),
        Driver(12, "Tony_tgn", "HAS", "F1", 0),
        Driver(13, "Raúl Martín", "REN", "F1", 0),
        Driver(14, "McSabroson", "REN", "F1", 0),
        Driver(15, "xurde", "MER", "F1", 0),
        Driver(16, "Abel Sánchez", "MER", "F1", 0),
        Driver(17, "Marc de Fulgencio", "RBS", "F1", 0),
        Driver(18, "Tejerinhoo", "RBS", "F1", 0),
        Driver(19, "izan_asecas", "KS", "F1", 0),
        Driver(20, "Tomas Gonzalez Lo", "KS", "F1", 0),
        Driver(21, "PhotoRacerTV", "JOR", "F1", 0),
        Driver(22, "f1mproplayer", "JOR", "F1", 0),
        Driver(23, "Axel Vilar (Mr Phoskitos)", "BRW", "F1", 0),
        Driver(24, "Antonio Ridao(Ridmar)", "BRW", "F1", 0)
    )

    private val f2Drivers = listOf(
        Driver(1, "Piloto F2 a confirmar", "FER", "F2", 0),
        Driver(2, "Piloto F2 a confirmar", "FER", "F2", 0),
        Driver(3, "Piloto F2 a confirmar", "RB", "F2", 0),
        Driver(4, "Piloto F2 a confirmar", "RB", "F2", 0),
        Driver(5, "Piloto F2 a confirmar", "MCL", "F2", 0),
        Driver(6, "Piloto F2 a confirmar", "MCL", "F2", 0),
        Driver(7, "Piloto F2 a confirmar", "WIL", "F2", 0),
        Driver(8, "Piloto F2 a confirmar", "WIL", "F2", 0),
        Driver(9, "Piloto F2 a confirmar", "AS", "F2", 0),
        Driver(10, "Piloto F2 a confirmar", "AS", "F2", 0),
        Driver(11, "Piloto F2 a confirmar", "HAS", "F2", 0),
        Driver(12, "Piloto F2 a confirmar", "HAS", "F2", 0),
        Driver(13, "Piloto F2 a confirmar", "REN", "F2", 0),
        Driver(14, "Piloto F2 a confirmar", "REN", "F2", 0),
        Driver(15, "Piloto F2 a confirmar", "MER", "F2", 0),
        Driver(16, "Piloto F2 a confirmar", "MER", "F2", 0),
        Driver(17, "Piloto F2 a confirmar", "RBS", "F2", 0),
        Driver(18, "Piloto F2 a confirmar", "RBS", "F2", 0),
        Driver(19, "Piloto F2 a confirmar", "KS", "F2", 0),
        Driver(20, "Piloto F2 a confirmar", "KS", "F2", 0),
        Driver(21, "Piloto F2 a confirmar", "JOR", "F2", 0),
        Driver(22, "Piloto F2 a confirmar", "JOR", "F2", 0),
        Driver(23, "Piloto F2 a confirmar", "BRW", "F2", 0),
        Driver(24, "Piloto F2 a confirmar", "BRW", "F2", 0)
    )

    private val f3Drivers = listOf(
        Driver(1, "Piloto F3 a confirmar", "FER", "F3", 0),
        Driver(2, "Piloto F3 a confirmar", "FER", "F3", 0),
        Driver(3, "Piloto F3 a confirmar", "RB", "F3", 0),
        Driver(4, "Piloto F3 a confirmar", "RB", "F3", 0),
        Driver(5, "Piloto F3 a confirmar", "MCL", "F3", 0),
        Driver(6, "Piloto F3 a confirmar", "MCL", "F3", 0),
        Driver(7, "Piloto F3 a confirmar", "WIL", "F3", 0),
        Driver(8, "Piloto F3 a confirmar", "WIL", "F3", 0),
        Driver(9, "Piloto F3 a confirmar", "AS", "F3", 0),
        Driver(10, "Piloto F3 a confirmar", "AS", "F3", 0),
        Driver(11, "Piloto F3 a confirmar", "HAS", "F3", 0),
        Driver(12, "Piloto F3 a confirmar", "HAS", "F3", 0),
        Driver(13, "Piloto F3 a confirmar", "REN", "F3", 0),
        Driver(14, "Piloto F3 a confirmar", "REN", "F3", 0),
        Driver(15, "Piloto F3 a confirmar", "MER", "F3", 0),
        Driver(16, "Piloto F3 a confirmar", "MER", "F3", 0),
        Driver(17, "Piloto F3 a confirmar", "RBS", "F3", 0),
        Driver(18, "Piloto F3 a confirmar", "RBS", "F3", 0),
        Driver(19, "Piloto F3 a confirmar", "KS", "F3", 0),
        Driver(20, "Piloto F3 a confirmar", "KS", "F3", 0),
        Driver(21, "Piloto F3 a confirmar", "JOR", "F3", 0),
        Driver(22, "Piloto F3 a confirmar", "JOR", "F3", 0),
        Driver(23, "Piloto F3 a confirmar", "BRW", "F3", 0),
        Driver(24, "Piloto F3 a confirmar", "BRW", "F3", 0)
    )

    val teams = listOf(
        Team(
            "FER",
            "Ferrari",
            f1Drivers.filter { it.teamId == "FER" },
            f2Drivers.filter { it.teamId == "FER" },
            f3Drivers.filter { it.teamId == "FER" }),
        Team(
            "RB",
            "Red Bull",
            f1Drivers.filter { it.teamId == "RB" },
            f2Drivers.filter { it.teamId == "RB" },
            f3Drivers.filter { it.teamId == "RB" }),
        Team(
            "MCL",
            "McLaren",
            f1Drivers.filter { it.teamId == "MCL" },
            f2Drivers.filter { it.teamId == "MCL" },
            f3Drivers.filter { it.teamId == "MCL" }),
        Team(
            "WIL",
            "Williams",
            f1Drivers.filter { it.teamId == "WIL" },
            f2Drivers.filter { it.teamId == "WIL" },
            f3Drivers.filter { it.teamId == "WIL" }),
        Team(
            "AS",
            "Aston Martin",
            f1Drivers.filter { it.teamId == "AS" },
            f2Drivers.filter { it.teamId == "AS" },
            f3Drivers.filter { it.teamId == "AS" }),
        Team(
            "HAS",
            "Haas",
            f1Drivers.filter { it.teamId == "HAS" },
            f2Drivers.filter { it.teamId == "HAS" },
            f3Drivers.filter { it.teamId == "HAS" }),
        Team(
            "REN",
            "Renault",
            f1Drivers.filter { it.teamId == "REN" },
            f2Drivers.filter { it.teamId == "REN" },
            f3Drivers.filter { it.teamId == "REN" }),
        Team(
            "RBS",
            "Racing Bulls",
            f1Drivers.filter { it.teamId == "RBS" },
            f2Drivers.filter { it.teamId == "RBS" },
            f3Drivers.filter { it.teamId == "RBS" }),
        Team(
            "KS",
            "Kick Sauber",
            f1Drivers.filter { it.teamId == "KS" },
            f2Drivers.filter { it.teamId == "KS" },
            f3Drivers.filter { it.teamId == "KS" }),
        Team(
            "JOR",
            "Jordan",
            f1Drivers.filter { it.teamId == "JOR" },
            f2Drivers.filter { it.teamId == "JOR" },
            f3Drivers.filter { it.teamId == "JOR" }),
        Team(
            "BRW",
            "Brawn",
            f1Drivers.filter { it.teamId == "BRW" },
            f2Drivers.filter { it.teamId == "BRW" },
            f3Drivers.filter { it.teamId == "BRW" })
    )
}