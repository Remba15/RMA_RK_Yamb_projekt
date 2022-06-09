fun main(args: Array<String>) {
    /*
    Napišite program koji omogućuje igranje igre Jamb (engl. Yahtzee). Poštujte SOLID načela. Poštujte pravila OOP dizajna. Razdvojite funkcionalnost u klase.
    Treba postojati:
        -bacanje kockice, provjera stanja
        -igra se sa 6 kockica, omogućiti bacanje svih kockica, zaključavanje 0-6 kockica, bacanje samo otključanih kockica
        -provjeru rezultata bacanja - podržati barem 3 provjere za jamb (jamb, poker, skala)
        -pogonski program za provjeru napisane funkcionalnosti*/

    //PROVJERA ZAKLJUCAVANJA KOCKICA
        provjeraZakljucanihKockika()
    //PROVJERA REZULTATA BACANJA
        //JAMB
        provjeraJamba()
        //POKER
        provjeraPokera()
        //SKALA
        provjeraSkale()
}