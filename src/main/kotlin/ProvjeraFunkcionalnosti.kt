fun provjeraZakljucanihKockika(): Unit{
    println("ZAKLJUCAVANJE KOCKICA:")
    throwUnlockedDies()
    listOfDies[0].lockDie()
    listOfDies[1].lockDie()
    throwUnlockedDies()
    listOfDies[2].lockDie()
    listOfDies[3].lockDie()
    listOfDies[4].lockDie()
    throwUnlockedDies()
    listOfDies[0].unlockDie()
    throwUnlockedDies()
    listOfDies.forEach{ it.unlockDie() }
    throwUnlockedDies()
    println("")
}

fun provjeraJamba(): Unit{
    println("PROVJERA JAMBA:")
    throwUnlockedDies()
    println("Yamb? ${checkForYamb()}")
    listOfDies.forEach{it.mNumber = 5}
    println("Yamb? ${checkForYamb()}")
    listOfDies[0].mNumber = 1
    println("Yamb? ${checkForYamb()}")
    listOfDies[1].mNumber = 3
    println("Yamb? ${checkForYamb()}")
    println("")
}

fun provjeraPokera(): Unit{
    println("PROVJERA POKERA:")
    throwUnlockedDies()
    println("Poker? ${checkForPoker()}")
    listOfDies.forEach{it.mNumber = 5}
    println("Poker? ${checkForPoker()}")
    listOfDies[0].mNumber = 1
    println("Poker? ${checkForPoker()}")
    listOfDies[1].mNumber = 2
    println("Poker? ${checkForPoker()}")
    listOfDies[2].mNumber = 3
    println("Poker? ${checkForPoker()}")
    println("")
}

fun provjeraSkale(): Unit{
    println("PROVJERA SKALE:")
    throwUnlockedDies()
    println("Straight? ${checkForStraight()}")
    listOfDies[0].mNumber = 1
    listOfDies[1].mNumber = 5
    listOfDies[2].mNumber = 4
    listOfDies[3].mNumber = 3
    listOfDies[4].mNumber = 6
    listOfDies[5].mNumber = 2
    println("Straight? ${checkForStraight()}")
    listOfDies[0].mNumber = 1
    listOfDies[1].mNumber = 5
    listOfDies[2].mNumber = 4
    listOfDies[3].mNumber = 3
    listOfDies[4].mNumber = 5
    listOfDies[5].mNumber = 2
    println("Straight? ${checkForStraight()}")
    listOfDies[0].mNumber = 6
    listOfDies[1].mNumber = 5
    listOfDies[2].mNumber = 4
    listOfDies[3].mNumber = 3
    listOfDies[4].mNumber = 6
    listOfDies[5].mNumber = 2
    println("Straight? ${checkForStraight()}")
    listOfDies[0].mNumber = 1
    listOfDies[1].mNumber = 5
    listOfDies[2].mNumber = 2
    listOfDies[3].mNumber = 3
    listOfDies[4].mNumber = 2
    listOfDies[5].mNumber = 2
    println("Straight? ${checkForStraight()}")
    println("")
}