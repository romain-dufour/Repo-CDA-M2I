<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="longueur_AB EST_DU_TYPE NOMBRE" code="1#NOMBRE#longueur_AB"/>
        <item algoitem="longueur_BC EST_DU_TYPE NOMBRE" code="1#NOMBRE#longueur_BC"/>
        <item algoitem="longueur_AC EST_DU_TYPE NOMBRE" code="1#NOMBRE#longueur_AC"/>
        <item algoitem="MODULO_ABAC EST_DU_TYPE NOMBRE" code="1#NOMBRE#MODULO_ABAC"/>
        <item algoitem="MODULO_ACBC EST_DU_TYPE NOMBRE" code="1#NOMBRE#MODULO_ACBC"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="LIRE longueur_AB" code="2#longueur_AB#pasliste"/>
        <item algoitem="LIRE longueur_BC" code="2#longueur_BC#pasliste"/>
        <item algoitem="LIRE longueur_AC" code="2#longueur_AC#pasliste"/>
        <item algoitem="MODULO_ABAC PREND_LA_VALEUR longueur_AB/longueur_AC" code="5#MODULO_ABAC#longueur_AB/longueur_AC#pasliste"/>
        <item algoitem="MODULO_ACBC PREND_LA_VALEUR longueur_AC/longueur_BC" code="5#MODULO_ACBC#longueur_AC/longueur_BC#pasliste"/>
        <item algoitem="SI (MODULO_ABAC-MODULO_ACBC==0) ALORS" code="6#MODULO_ABAC-MODULO_ACBC==0">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Le triangle est équilatéral&quot;" code="4#Le triangle est équilatéral#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (longueur_AB/longueur_AC==1) ALORS" code="6#longueur_AB/longueur_AC==1">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot; Le triangle est isocèle en A mais n'est pas équilatéral&quot;" code="4# Le triangle est isocèle en A mais n'est pas équilatéral#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (longueur_AB/longueur_BC==1) ALORS" code="6#longueur_AB/longueur_BC==1">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot; Le triangle est isocèle en B mais n'est pas équilatéral&quot;" code="4# Le triangle est isocèle en B mais n'est pas équilatéral#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="SI (longueur_Ac/longueur_BC==1) ALORS" code="6#longueur_Ac/longueur_BC==1">
                                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                    <item algoitem="AFFICHER &quot; Le triangle est isocèle en C mais n'est pas équilatéral&quot;" code="4# Le triangle est isocèle en C mais n'est pas équilatéral#0"/>
                                    <item algoitem="FIN_SI" code="8#finsi"/>
                                    <item algoitem="SINON" code="9#sinon">
                                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                        <item algoitem="AFFICHER &quot; Le triangle n'est isocèle ni en A, ni en B, ni en C&quot;" code="4# Le triangle n'est isocèle ni en A, ni en B, ni en C#0"/>
                                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                                    </item>
                                </item>
                                <item algoitem="FIN_SINON" code="11#finsinon"/>
                            </item>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
