<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="nbrhabitant PREND_LA_VALEUR 96809" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" nbDecimales="8" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbrannée EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbrannée"/>
        <item algoitem="nbrhabitant EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbrhabitant"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="nbrannée PREND_LA_VALEUR 0" code="5#nbrannée#0#pasliste"/>
        <item algoitem="nbrhabitant PREND_LA_VALEUR 96809" code="5#nbrhabitant#96809#pasliste"/>
        <item algoitem="TANT_QUE (nbrhabitant&lt;=120000) FAIRE" code="15#nbrhabitant&lt;=120000">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="nbrhabitant PREND_LA_VALEUR nbrhabitant*(0.89/100+1)" code="5#nbrhabitant#nbrhabitant*(0.89/100+1)#pasliste"/>
            <item algoitem="nbrannée PREND_LA_VALEUR nbrannée+1" code="5#nbrannée#nbrannée+1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER &quot;pour atteindre 120000 habitants, il faudra : &quot;" code="4#pour atteindre 120000 habitants, il faudra : #0"/>
        <item algoitem="AFFICHER nbrannée" code="3#nbrannée#0#pasliste"/>
        <item algoitem="AFFICHER &quot; ans.&quot;" code="4# ans.#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
