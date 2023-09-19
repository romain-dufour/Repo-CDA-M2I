<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_TANT_QUE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2lignes="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" arrondiAuto="vrai" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nbrannée" algoitem="nbrannée EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbrhabitant" algoitem="nbrhabitant EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#aujourdhui" algoitem="aujourdhui EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#En quelle année sommes nous?#1" algoitem="AFFICHER &quot;En quelle année sommes nous?&quot;"/>
        <item code="2#aujourdhui#pasliste" algoitem="LIRE aujourdhui"/>
        <item code="5#nbrannée#0#pasliste" algoitem="nbrannée PREND_LA_VALEUR 0"/>
        <item code="5#nbrhabitant#96809#pasliste" algoitem="nbrhabitant PREND_LA_VALEUR 96809"/>
        <item code="15#nbrhabitant*pow(0.89/100+1,nbrannée)&lt;=120000" algoitem="TANT_QUE (nbrhabitant*pow(0.89/100+1,nbrannée)&lt;=120000) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#nbrannée#nbrannée+1#pasliste" algoitem="nbrannée PREND_LA_VALEUR nbrannée+1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#pour atteindre 120000 habitants, il faudra : #0" algoitem="AFFICHER &quot;pour atteindre 120000 habitants, il faudra : &quot;"/>
        <item code="3#nbrannée#0#pasliste" algoitem="AFFICHER nbrannée"/>
        <item code="4# ans.#1" algoitem="AFFICHER &quot; ans.&quot;"/>
        <item code="6#aujourdhui&lt;(2015+nbrannée)" algoitem="SI (aujourdhui&lt;(2015+nbrannée)) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Nous devrons encore attendre #0" algoitem="AFFICHER &quot;Nous devrons encore attendre &quot;"/>
            <item code="20#2015+nbrannée-aujourdhui#0" algoitem="AFFICHERCALCUL 2015+nbrannée-aujourdhui"/>
            <item code="4# ans pour atteindre 120000 habitants#0" algoitem="AFFICHER &quot; ans pour atteindre 120000 habitants&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#Nous avons atteinds les 120000 habitants il y a #0" algoitem="AFFICHER &quot;Nous avons atteinds les 120000 habitants il y a &quot;"/>
                <item code="20#aujourdhui-(2015+nbrannée)#0" algoitem="AFFICHERCALCUL aujourdhui-(2015+nbrannée)"/>
                <item code="4# ans#0" algoitem="AFFICHER &quot; ans&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
