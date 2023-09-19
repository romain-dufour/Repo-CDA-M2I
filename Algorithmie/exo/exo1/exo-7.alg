<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;votre enfant est dans la catégorie licence pupille&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="ageenfant EST_DU_TYPE NOMBRE" code="1#NOMBRE#ageenfant"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;quel est ton age?&quot;" code="4#quel est ton age?#0"/>
        <item algoitem="LIRE ageenfant" code="2#ageenfant#pasliste"/>
        <item algoitem="SI (ageenfant&lt;3) ALORS" code="6#ageenfant&lt;3">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre enfant est trop jeune pour avoir une licence&quot;" code="4#votre enfant est trop jeune pour avoir une licence#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (ageenfant&lt;=6) ALORS" code="6#ageenfant&lt;=6">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;votre enfant est dans la catégorie licence baby&quot;" code="4#votre enfant est dans la catégorie licence baby#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (ageenfant&lt;=8) ALORS" code="6#ageenfant&lt;=8">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;votre enfant est dans la catégorie licence Poussin&quot;" code="4#votre enfant est dans la catégorie licence Poussin#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="SI (ageenfant&lt;=10) ALORS" code="6#ageenfant&lt;=10">
                                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                    <item algoitem="AFFICHER &quot;votre enfant est dans la catégorie licence pupille&quot;" code="4#votre enfant est dans la catégorie licence pupille#0"/>
                                    <item algoitem="FIN_SI" code="8#finsi"/>
                                    <item algoitem="SINON" code="9#sinon">
                                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                        <item algoitem="SI (ageenfant&lt;=12) ALORS" code="6#ageenfant&lt;=12">
                                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                            <item algoitem="AFFICHER &quot;votre enfant est dans la catégorie licence minime&quot;" code="4#votre enfant est dans la catégorie licence minime#0"/>
                                            <item algoitem="FIN_SI" code="8#finsi"/>
                                            <item algoitem="SINON" code="9#sinon">
                                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                                <item algoitem="SI (ageenfant>=13) ALORS" code="6#ageenfant>=13">
                                                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                                    <item algoitem="AFFICHER &quot;votre enfant est dans la catégorie licence cadet&quot;" code="4#votre enfant est dans la catégorie licence cadet#0"/>
                                                    <item algoitem="FIN_SI" code="8#finsi"/>
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
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
