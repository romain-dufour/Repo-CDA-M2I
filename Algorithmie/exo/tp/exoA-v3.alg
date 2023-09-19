<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER somme"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" arrondiAuto="vrai" totalAffichages="1000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="n EST_DU_TYPE NOMBRE" code="1#NOMBRE#n"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="somme EST_DU_TYPE NOMBRE" code="1#NOMBRE#somme"/>
        <item algoitem="affichage EST_DU_TYPE CHAINE" code="1#CHAINE#affichage"/>
        <item algoitem="j EST_DU_TYPE NOMBRE" code="1#NOMBRE#j"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Veuillez entrer un nombre entier&quot;" code="4#Veuillez entrer un nombre entier#0"/>
        <item algoitem="LIRE n" code="2#n#pasliste"/>
        <item algoitem="somme PREND_LA_VALEUR 0" code="5#somme#0#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A n" code="12#i#1#n">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="affichage PREND_LA_VALEUR &quot;&quot;" code="5#affichage#&quot;&quot;#pasliste"/>
            <item algoitem="POUR j ALLANT_DE i A n" code="12#j#i#n">
                <item algoitem="DEBUT_POUR" code="13#debutpour"/>
                <item algoitem="TANT_QUE (j!=n) FAIRE" code="15#j!=n">
                    <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
                    <item algoitem="somme PREND_LA_VALEUR somme+j" code="5#somme#somme+j#pasliste"/>
                    <item algoitem="SI (somme==n) ALORS" code="6#somme==n">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="affichage PREND_LA_VALEUR affichage + j" code="5#affichage#affichage + j#pasliste"/>
                        <item algoitem="AFFICHER affichage" code="3#affichage#0#pasliste"/>
                        <item algoitem="AFFICHER &quot; = &quot;" code="4# = #0"/>
                        <item algoitem="AFFICHER somme" code="3#somme#1#pasliste"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                    </item>
                    <item algoitem="affichage PREND_LA_VALEUR affichage + j +&quot; + &quot;" code="5#affichage#affichage + j +&quot; + &quot;#pasliste"/>
                    <item algoitem="j PREND_LA_VALEUR j+1" code="5#j#j+1#pasliste"/>
                    <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
                </item>
                <item algoitem="FIN_POUR" code="14#finpour"/>
            </item>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
            <item algoitem="somme PREND_LA_VALEUR 0" code="5#somme#0#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
