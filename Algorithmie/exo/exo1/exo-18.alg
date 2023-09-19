<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHERCALCUL calculnbrleplusgrand(nbre1,nbre2)"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param nbDecimales="8" totalAffichages="1000" maxBoucle="500000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES">
        <item code="201#calculnbrleplusgrand#a,b" algoitem="FONCTION calculnbrleplusgrand(a,b)">
            <item code="202#declarationsvariablesfonction" algoitem="VARIABLES_FONCTION"/>
            <item code="203#debutfonction" algoitem="DEBUT_FONCTION"/>
            <item code="6#a>b" algoitem="SI (a>b) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="205#a" algoitem="RENVOYER a"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="205#b" algoitem="RENVOYER b"/>
            <item code="204#finfonction" algoitem="FIN_FONCTION"/>
        </item>
    </item>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbre1" algoitem="nbre1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbre2" algoitem="nbre2 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#rentrez un premier nombre : #1" algoitem="AFFICHER &quot;rentrez un premier nombre : &quot;"/>
        <item code="2#nbre1#pasliste" algoitem="LIRE nbre1"/>
        <item code="4#rentrez un premier nombre : #1" algoitem="AFFICHER &quot;rentrez un premier nombre : &quot;"/>
        <item code="2#nbre2#pasliste" algoitem="LIRE nbre2"/>
        <item code="4#le nombre le plus grand est : #0" algoitem="AFFICHER &quot;le nombre le plus grand est : &quot;"/>
        <item code="20#calculnbrleplusgrand(nbre1,nbre2)#0" algoitem="AFFICHERCALCUL calculnbrleplusgrand(nbre1,nbre2)"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
