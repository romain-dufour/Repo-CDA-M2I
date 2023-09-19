<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="affichage PREND_LA_VALEUR i + &quot; x 9 = &quot; + i * 9"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" epaisseurLigne="2" epaisseurPoint="2" nbDecimales="8" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="itération EST_DU_TYPE NOMBRE" code="1#NOMBRE#itération"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="affichage EST_DU_TYPE CHAINE" code="1#CHAINE#affichage"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;combien d'iteration?&quot;" code="4#combien d'iteration?#0"/>
        <item algoitem="LIRE itération" code="2#itération#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 0 A itération" code="12#i#0#itération">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="affichage PREND_LA_VALEUR i + &quot; x 9 = &quot; + i * 9" code="5#affichage#i + &quot; x 9 = &quot; + i * 9#pasliste"/>
            <item algoitem="AFFICHER affichage" code="3#affichage#1#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
