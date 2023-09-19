<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;= &quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" epaisseurLigne="2" epaisseurPoint="2" nbDecimales="8" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbr EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbr"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="somme EST_DU_TYPE NOMBRE" code="1#NOMBRE#somme"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="i PREND_LA_VALEUR 1" code="5#i#1#pasliste"/>
        <item algoitem="AFFICHER &quot;rentrez un nombre&quot;" code="4#rentrez un nombre#0"/>
        <item algoitem="LIRE nbr" code="2#nbr#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A nbr" code="12#i#1#nbr">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="somme PREND_LA_VALEUR somme+i" code="5#somme#somme+i#pasliste"/>
            <item algoitem="AFFICHER i" code="3#i#0#pasliste"/>
            <item algoitem="AFFICHER &quot; + &quot;" code="4# + #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;= &quot;" code="4#= #0"/>
        <item algoitem="AFFICHER somme" code="3#somme#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
