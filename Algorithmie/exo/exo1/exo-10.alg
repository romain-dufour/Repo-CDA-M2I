<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="nbre PREND_LA_VALEUR 0"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2defaut="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" arrondiAuto="vrai" maxBoucle="500000" nbDecimales="8" totalBoucles="5000000" epaisseurPoint="2" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbre" algoitem="nbre EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#nbre#0#pasliste" algoitem="nbre PREND_LA_VALEUR 0"/>
        <item code="4#svp rentrez un nombre en 1 et 3#1" algoitem="AFFICHER &quot;svp rentrez un nombre en 1 et 3&quot;"/>
        <item code="2#nbre#pasliste" algoitem="LIRE nbre"/>
        <item code="15#nbre>3 || nbre&lt;1" algoitem="TANT_QUE (nbre>3 || nbre&lt;1) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#svp rentrez un nombre en 1 et 3#1" algoitem="AFFICHER &quot;svp rentrez un nombre en 1 et 3&quot;"/>
            <item code="2#nbre#pasliste" algoitem="LIRE nbre"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
