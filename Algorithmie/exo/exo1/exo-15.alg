<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" nbDecimales="8" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="z EST_DU_TYPE CHAINE" code="1#CHAINE#z"/>
        <item algoitem="i EST_DU_TYPE CHAINE" code="1#CHAINE#i"/>
        <item algoitem="j EST_DU_TYPE CHAINE" code="1#CHAINE#j"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="POUR i ALLANT_DE 1 A 10" code="12#i#1#10">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="POUR j ALLANT_DE 1 A 10" code="12#j#1#10">
                <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                <item algoitem="z PREND_LA_VALEUR j*i" code="5#z#j*i#pasliste"/>
                <item algoitem="" code="103#commentaire"/>
                <item algoitem="AFFICHER z" code="3#z#0#pasliste"/>
                <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
                <item algoitem="FIN_POUR" code="14#finpour"/>
            </item>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #1"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
