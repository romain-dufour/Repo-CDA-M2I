<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="affichage PREND_LA_VALEUR affichage +&quot; &quot; + i + &quot; &quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param nbDecimales="8" totalAffichages="1000" maxBoucle="500000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#n" algoitem="n EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#affichage" algoitem="affichage EST_DU_TYPE CHAINE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#n#pasliste" algoitem="LIRE n"/>
        <item code="12#i#1#n" algoitem="POUR i ALLANT_DE 1 A n">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#affichage#affichage +&quot; &quot; + i + &quot; &quot;#pasliste" algoitem="affichage PREND_LA_VALEUR affichage +&quot; &quot; + i + &quot; &quot;"/>
            <item code="3#affichage#1#pasliste" algoitem="AFFICHER affichage"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
