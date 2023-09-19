<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="DEBUT_ALGORITHME" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" arrondiAuto="vrai" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#note" algoitem="note EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#petite" algoitem="petite EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#grande" algoitem="grande EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#moyenne" algoitem="moyenne EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#petite#20#pasliste" algoitem="petite PREND_LA_VALEUR 20"/>
        <item code="5#grande#0#pasliste" algoitem="grande PREND_LA_VALEUR 0"/>
        <item code="4#rentrez une note supérieure à 0#0" algoitem="AFFICHER &quot;rentrez une note supérieure à 0&quot;"/>
        <item code="2#note#pasliste" algoitem="LIRE note"/>
        <item code="5#moyenne#note#pasliste" algoitem="moyenne PREND_LA_VALEUR note"/>
        <item code="6#note==0" algoitem="SI (note==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#vous ne pouvez plus saisir de note#0" algoitem="AFFICHER &quot;vous ne pouvez plus saisir de note&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="5#petite#note#pasliste" algoitem="petite PREND_LA_VALEUR note"/>
                <item code="12#i#0#3" algoitem="POUR i ALLANT_DE 0 A 3">
                    <item code="13#debutpour" algoitem="DEBUT_POUR"/>
                    <item code="4#rentrez une note#0" algoitem="AFFICHER &quot;rentrez une note&quot;"/>
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
                <item code="5#moyenne#moyenne/(i+1)#pasliste" algoitem="moyenne PREND_LA_VALEUR moyenne/(i+1)"/>
                <item code="3#moyenne#1#pasliste" algoitem="AFFICHER moyenne"/>
                <item code="3#petite#1#pasliste" algoitem="AFFICHER petite"/>
                <item code="3#grande#1#pasliste" algoitem="AFFICHER grande"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
