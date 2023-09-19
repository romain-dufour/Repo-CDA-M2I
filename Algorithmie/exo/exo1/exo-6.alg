<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER montant"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="capital EST_DU_TYPE NOMBRE" code="1#NOMBRE#capital"/>
        <item algoitem="taux EST_DU_TYPE NOMBRE" code="1#NOMBRE#taux"/>
        <item algoitem="nombreannées EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombreannées"/>
        <item algoitem="montant EST_DU_TYPE NOMBRE" code="1#NOMBRE#montant"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE capital" code="2#capital#pasliste"/>
        <item algoitem="LIRE taux" code="2#taux#pasliste"/>
        <item algoitem="LIRE nombreannées" code="2#nombreannées#pasliste"/>
        <item algoitem="montant PREND_LA_VALEUR capital*(1+taux/100)**nombreannées" code="5#montant#capital*(1+taux/100)**nombreannées#pasliste"/>
        <item algoitem="AFFICHER montant" code="3#montant#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
