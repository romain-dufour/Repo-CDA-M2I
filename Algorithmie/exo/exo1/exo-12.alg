<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER calcul" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#répétition" algoitem="répétition EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#calcul" algoitem="calcul EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#jusqu'à combien voulez vous afficher la table de 9? #0" algoitem="AFFICHER &quot;jusqu'à combien voulez vous afficher la table de 9? &quot;"/>
        <item code="2#répétition#pasliste" algoitem="LIRE répétition"/>
        <item code="5#i#0#pasliste" algoitem="i PREND_LA_VALEUR 0"/>
        <item code="5#calcul#calcul*i#pasliste" algoitem="calcul PREND_LA_VALEUR calcul*i"/>
        <item code="15#i&lt;répétition" algoitem="TANT_QUE (i&lt;répétition) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="3#calcul#1#pasliste" algoitem="AFFICHER calcul"/>
            <item code="5#i#i+1#pasliste" algoitem="i PREND_LA_VALEUR i+1"/>
            <item code="5#calcul#9*i#pasliste" algoitem="calcul PREND_LA_VALEUR 9*i"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
