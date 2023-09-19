<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER nbrannée"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Prénom EST_DU_TYPE CHAINE" code="1#CHAINE#Prénom"/>
        <item algoitem="Nom EST_DU_TYPE CHAINE" code="1#CHAINE#Nom"/>
        <item algoitem="Age EST_DU_TYPE NOMBRE" code="1#NOMBRE#Age"/>
        <item algoitem="année EST_DU_TYPE NOMBRE" code="1#NOMBRE#année"/>
        <item algoitem="nbrannée EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbrannée"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE Prénom" code="2#Prénom#pasliste"/>
        <item algoitem="LIRE Nom" code="2#Nom#pasliste"/>
        <item algoitem="LIRE Age" code="2#Age#pasliste"/>
        <item algoitem="année PREND_LA_VALEUR 2023" code="5#année#2023#pasliste"/>
        <item algoitem="nbrannée PREND_LA_VALEUR année - Age" code="5#nbrannée#année - Age#pasliste"/>
        <item algoitem="AFFICHER &quot;Bonjour &quot;" code="4#Bonjour #0"/>
        <item algoitem="AFFICHER Nom" code="3#Nom#0#pasliste"/>
        <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
        <item algoitem="AFFICHER Prénom" code="3#Prénom#0#pasliste"/>
        <item algoitem="AFFICHER &quot;, vous avez  &quot;" code="4#, vous avez  #0"/>
        <item algoitem="AFFICHER Age" code="3#Age#0#pasliste"/>
        <item algoitem="AFFICHER &quot; ans ? Vous êtes sans doute né en &quot;" code="4# ans ? Vous êtes sans doute né en #0"/>
        <item algoitem="AFFICHER nbrannée" code="3#nbrannée#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
