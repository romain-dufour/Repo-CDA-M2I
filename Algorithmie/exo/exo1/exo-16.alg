<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Au revoir&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" nbDecimales="8" epaisseurLigne="2" arrondiAuto="vrai" epaisseurPoint="2" totalBoucles="5000000" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#note" algoitem="note EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#petite" algoitem="petite EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#grande" algoitem="grande EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#moyenne" algoitem="moyenne EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#menu" algoitem="menu EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#petite#20#pasliste" algoitem="petite PREND_LA_VALEUR 20"/>
        <item code="5#grande#0#pasliste" algoitem="grande PREND_LA_VALEUR 0"/>
        <item code="5#moyenne#0#pasliste" algoitem="moyenne PREND_LA_VALEUR 0"/>
        <item code="12#i#0#3" algoitem="POUR i ALLANT_DE 0 A 3">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4#rentrez la note #0" algoitem="AFFICHER &quot;rentrez la note &quot;"/>
            <item code="20#i+1#0" algoitem="AFFICHERCALCUL i+1"/>
            <item code="2#note#pasliste" algoitem="LIRE note"/>
            <item code="5#moyenne#moyenne+note#pasliste" algoitem="moyenne PREND_LA_VALEUR moyenne+note"/>
            <item code="15#note&lt;petite" algoitem="TANT_QUE (note&lt;petite) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="5#petite#note#pasliste" algoitem="petite PREND_LA_VALEUR note"/>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="15#grande&lt;note" algoitem="TANT_QUE (grande&lt;note) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="5#grande#note#pasliste" algoitem="grande PREND_LA_VALEUR note"/>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="5#moyenne#moyenne/i#pasliste" algoitem="moyenne PREND_LA_VALEUR moyenne/i"/>
        <item code="15#menu&lt;4" algoitem="TANT_QUE (menu&lt;4) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Pour avoir la note moyenne, tapez 1#1" algoitem="AFFICHER &quot;Pour avoir la note moyenne, tapez 1&quot;"/>
            <item code="4#Pour avoir la plus petite note, tapez 2#1" algoitem="AFFICHER &quot;Pour avoir la plus petite note, tapez 2&quot;"/>
            <item code="4#Pour avoir la plus grande note, tapez 3#1" algoitem="AFFICHER &quot;Pour avoir la plus grande note, tapez 3&quot;"/>
            <item code="4#Pour quitter, tapez 4#1" algoitem="AFFICHER &quot;Pour quitter, tapez 4&quot;"/>
            <item code="2#menu#pasliste" algoitem="LIRE menu"/>
            <item code="6#menu==1" algoitem="SI (menu==1) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#la note moyenne est : #0" algoitem="AFFICHER &quot;la note moyenne est : &quot;"/>
                <item code="3#moyenne#1#pasliste" algoitem="AFFICHER moyenne"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#menu==2" algoitem="SI (menu==2) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="4#la plus petite note est : #0" algoitem="AFFICHER &quot;la plus petite note est : &quot;"/>
                        <item code="3#petite#1#pasliste" algoitem="AFFICHER petite"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                        <item code="9#sinon" algoitem="SINON">
                            <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                            <item code="6#menu==3" algoitem="SI (menu==3) ALORS">
                                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                <item code="4#la plus grande note est : #0" algoitem="AFFICHER &quot;la plus grande note est : &quot;"/>
                                <item code="3#grande#1#pasliste" algoitem="AFFICHER grande"/>
                                <item code="8#finsi" algoitem="FIN_SI"/>
                            </item>
                            <item code="11#finsinon" algoitem="FIN_SINON"/>
                        </item>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Au revoir#0" algoitem="AFFICHER &quot;Au revoir&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
