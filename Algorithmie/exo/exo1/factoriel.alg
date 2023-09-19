<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FONCTION factorielle(x)"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" maxBoucle="500000" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES">
        <item code="201#factorielle#x" algoitem="FONCTION factorielle(x)">
            <item code="202#declarationsvariablesfonction" algoitem="VARIABLES_FONCTION">
                <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
                <item code="1#NOMBRE#f" algoitem="f EST_DU_TYPE NOMBRE"/>
            </item>
            <item code="203#debutfonction" algoitem="DEBUT_FONCTION"/>
            <item code="5#f#1#pasliste" algoitem="f PREND_LA_VALEUR 1"/>
            <item code="12#i#1#x" algoitem="POUR i ALLANT_DE 1 A x">
                <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                <item code="5#f#f*i#pasliste" algoitem="f PREND_LA_VALEUR f*i"/>
                <item code="14#finpour" algoitem="FIN_POUR"/>
            </item>
            <item code="205#f" algoitem="RENVOYER f"/>
            <item code="204#finfonction" algoitem="FIN_FONCTION"/>
        </item>
    </item>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#x" algoitem="x EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#j" algoitem="j EST_DU_TYPE NOMBRE"/>
        <item code="1#LISTE#tab" algoitem="tab EST_DU_TYPE LISTE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#veuillez rentrer un nombre :#0" algoitem="AFFICHER &quot;veuillez rentrer un nombre :&quot;"/>
        <item code="2#x#pasliste" algoitem="LIRE x"/>
        <item code="5#tab#1#0" algoitem="tab[0] PREND_LA_VALEUR 1"/>
        <item code="12#j#1#x" algoitem="POUR j ALLANT_DE 1 A x">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#tab#factorielle(j)#j" algoitem="tab[j] PREND_LA_VALEUR factorielle(j)"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="4#la factorielle de x est :#1" algoitem="AFFICHER &quot;la factorielle de x est :&quot;"/>
        <item code="12#j#0#x" algoitem="POUR j ALLANT_DE 0 A x">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="20#tab[j]#0" algoitem="AFFICHERCALCUL tab[j]"/>
            <item code="4# ; #0" algoitem="AFFICHER &quot; ; &quot;"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
