<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="SI (prix>10 &amp;&amp; prix&lt;20) ALORS"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Nbrecopies EST_DU_TYPE NOMBRE" code="1#NOMBRE#Nbrecopies"/>
        <item algoitem="prix EST_DU_TYPE NOMBRE" code="1#NOMBRE#prix"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;combien de photocopies voulez vous faire?&quot;" code="4#combien de photocopies voulez vous faire?#0"/>
        <item algoitem="LIRE Nbrecopies" code="2#Nbrecopies#pasliste"/>
        <item algoitem="SI (Nbrecopies&lt;10) ALORS" code="6#Nbrecopies&lt;10">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="prix PREND_LA_VALEUR Nbrecopies*0.5" code="5#prix#Nbrecopies*0.5#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (prix>10 &amp;&amp; prix&lt;20) ALORS" code="6#prix>10 &amp;&amp; prix&lt;20">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="prix PREND_LA_VALEUR Nbrecopies*0.4" code="5#prix#Nbrecopies*0.4#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="prix PREND_LA_VALEUR Nbrecopies*0.3" code="5#prix#Nbrecopies*0.3#pasliste"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="AFFICHER &quot;votre prix est de : &quot;" code="4#votre prix est de : #0"/>
        <item algoitem="AFFICHER prix" code="3#prix#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
