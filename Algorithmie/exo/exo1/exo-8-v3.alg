<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SINON" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#longueur_AB" algoitem="longueur_AB EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#longueur_BC" algoitem="longueur_BC EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#longueur_AC" algoitem="longueur_AC EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#longueur_AB#pasliste" algoitem="LIRE longueur_AB"/>
        <item code="2#longueur_BC#pasliste" algoitem="LIRE longueur_BC"/>
        <item code="2#longueur_AC#pasliste" algoitem="LIRE longueur_AC"/>
        <item code="6#MODULO_ABAC-MODULO_ACBC==0" algoitem="SI (MODULO_ABAC-MODULO_ACBC==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Le triangle est équilatéral#0" algoitem="AFFICHER &quot;Le triangle est équilatéral&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#longueur_AB/longueur_AC==1" algoitem="SI (longueur_AB/longueur_AC==1) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4# Le triangle est isocèle en A mais n'est pas équilatéral#0" algoitem="AFFICHER &quot; Le triangle est isocèle en A mais n'est pas équilatéral&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
