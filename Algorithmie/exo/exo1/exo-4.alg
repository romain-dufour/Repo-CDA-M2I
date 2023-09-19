<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="reste PREND_LA_VALEUR nbrentier%3"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbrentier EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbrentier"/>
        <item algoitem="resultat EST_DU_TYPE NOMBRE" code="1#NOMBRE#resultat"/>
        <item algoitem="reste EST_DU_TYPE NOMBRE" code="1#NOMBRE#reste"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE nbrentier" code="2#nbrentier#pasliste"/>
        <item algoitem="resultat PREND_LA_VALEUR nbrentier / 3" code="5#resultat#nbrentier / 3#pasliste"/>
        <item algoitem="reste PREND_LA_VALEUR nbrentier%3" code="5#reste#nbrentier%3#pasliste"/>
        <item algoitem="SI (reste==0) ALORS" code="6#reste==0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER nbrentier" code="3#nbrentier#0#pasliste"/>
            <item algoitem="AFFICHER &quot; est divisible par 3&quot;" code="4# est divisible par 3#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER nbrentier" code="3#nbrentier#0#pasliste"/>
                <item algoitem="AFFICHER &quot; n'est pas divisible par 3&quot;" code="4# n'est pas divisible par 3#0"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
