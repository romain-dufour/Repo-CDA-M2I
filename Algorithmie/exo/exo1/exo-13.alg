<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="nbr1 EST_DU_TYPE NOMBRE"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalAffichages="1000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" epaisseurPoint="2" totalBoucles="5000000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbr" algoitem="nbr EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbr1" algoitem="nbr1 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#nbr1#0#pasliste" algoitem="nbr1 PREND_LA_VALEUR 0"/>
        <item code="4#veuillez entrer le nombre 1 : #0" algoitem="AFFICHER &quot;veuillez entrer le nombre 1 : &quot;"/>
        <item code="2#nbr1#pasliste" algoitem="LIRE nbr1"/>
        <item code="12#i#2#6" algoitem="POUR i ALLANT_DE 2 A 6">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#rentrez un nombre#1" algoitem="AFFICHER &quot;rentrez un nombre&quot;"/>
            <item code="2#nbr#pasliste" algoitem="LIRE nbr"/>
            <item code="6#nbr>=nbr1" algoitem="SI (nbr>=nbr1) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#nbr1#nbr#pasliste" algoitem="nbr1 PREND_LA_VALEUR nbr"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#nbr1#0#pasliste" algoitem="AFFICHER nbr1"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
