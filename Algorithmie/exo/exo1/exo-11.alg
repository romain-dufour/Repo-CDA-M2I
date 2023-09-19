<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot; ans&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2lignes="" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalBoucles="5000000" nbDecimales="8" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#t" algoitem="t EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#année" algoitem="année EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#temp" algoitem="temp EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#année#1#pasliste" algoitem="année PREND_LA_VALEUR 1"/>
        <item code="4#quel est votre capital ?#1" algoitem="AFFICHER &quot;quel est votre capital ?&quot;"/>
        <item code="2#c#pasliste" algoitem="LIRE c"/>
        <item code="4#quel est le taux (en pourcentage)? #1" algoitem="AFFICHER &quot;quel est le taux (en pourcentage)? &quot;"/>
        <item code="2#t#pasliste" algoitem="LIRE t"/>
        <item code="5#temp#c#pasliste" algoitem="temp PREND_LA_VALEUR c"/>
        <item code="15#c&lt;=2*temp" algoitem="TANT_QUE (c&lt;=2*temp) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#c#c*(1+t)**année#pasliste" algoitem="c PREND_LA_VALEUR c*(1+t)**année"/>
            <item code="5#année#année+1#pasliste" algoitem="année PREND_LA_VALEUR année+1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Le nombre d'année pour doubler votre capital est : #0" algoitem="AFFICHER &quot;Le nombre d'année pour doubler votre capital est : &quot;"/>
        <item code="3#année#0#pasliste" algoitem="AFFICHER année"/>
        <item code="4# ans#0" algoitem="AFFICHER &quot; ans&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
