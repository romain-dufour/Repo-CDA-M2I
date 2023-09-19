<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Vous avez rentré la note de 0, bonne journée.&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" totalAffichages="1000" arrondiAuto="vrai" nbDecimales="8" maxBoucle="500000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#noteSaisie" algoitem="noteSaisie EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#noteMax" algoitem="noteMax EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#noteMin" algoitem="noteMin EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#somme" algoitem="somme EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#menu" algoitem="menu EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez entrer la note n°1 : #0" algoitem="AFFICHER &quot;Veuillez entrer la note n°1 : &quot;"/>
        <item code="2#noteSaisie#pasliste" algoitem="LIRE noteSaisie"/>
        <item code="5#noteMin#noteSaisie#pasliste" algoitem="noteMin PREND_LA_VALEUR noteSaisie"/>
        <item code="5#noteMax#0#pasliste" algoitem="noteMax PREND_LA_VALEUR 0"/>
        <item code="5#i#1#pasliste" algoitem="i PREND_LA_VALEUR 1"/>
        <item code="15#noteSaisie!=0" algoitem="TANT_QUE (noteSaisie!=0) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="6#noteSaisie > noteMax" algoitem="SI (noteSaisie > noteMax) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#noteMax#noteSaisie#pasliste" algoitem="noteMax PREND_LA_VALEUR noteSaisie"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#noteSaisie &lt; noteMin" algoitem="SI (noteSaisie &lt; noteMin) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="5#noteMin#noteSaisie#pasliste" algoitem="noteMin PREND_LA_VALEUR noteSaisie"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="5#somme#somme + noteSaisie#pasliste" algoitem="somme PREND_LA_VALEUR somme + noteSaisie"/>
            <item code="5#menu#0#pasliste" algoitem="menu PREND_LA_VALEUR 0"/>
            <item code="15#menu != -1" algoitem="TANT_QUE (menu != -1) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="4#\n--- MENU ---#1" algoitem="AFFICHER &quot;\n--- MENU ---&quot;"/>
                <item code="4#1. Afficher la note la plus grande#1" algoitem="AFFICHER &quot;1. Afficher la note la plus grande&quot;"/>
                <item code="4#2. Afficher la note la plus petite#1" algoitem="AFFICHER &quot;2. Afficher la note la plus petite&quot;"/>
                <item code="4#3. Afficher la moyenne#1" algoitem="AFFICHER &quot;3. Afficher la moyenne&quot;"/>
                <item code="4#-1. Quitter le programme#1" algoitem="AFFICHER &quot;-1. Quitter le programme&quot;"/>
                <item code="4#\nVotre choix : #0" algoitem="AFFICHER &quot;\nVotre choix : &quot;"/>
                <item code="2#menu#pasliste" algoitem="LIRE menu"/>
                <item code="6#menu == 1" algoitem="SI (menu == 1) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#La plus grande note est #0" algoitem="AFFICHER &quot;La plus grande note est &quot;"/>
                    <item code="3#noteMax#1#pasliste" algoitem="AFFICHER noteMax"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#menu == 2" algoitem="SI (menu == 2) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#La plus petite note est #0" algoitem="AFFICHER &quot;La plus petite note est &quot;"/>
                            <item code="3#noteMin#1#pasliste" algoitem="AFFICHER noteMin"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#menu == 3 " algoitem="SI (menu == 3 ) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="4#La moyenne des notes est #0" algoitem="AFFICHER &quot;La moyenne des notes est &quot;"/>
                                    <item code="20#round(somme /i)#1" algoitem="AFFICHERCALCUL round(somme /i)"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="4#Merci, au revoir.#1" algoitem="AFFICHER &quot;Merci, au revoir.&quot;"/>
                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                    </item>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="5#i#i+1#pasliste" algoitem="i PREND_LA_VALEUR i+1"/>
            <item code="4#Veuillez entrer la note n°#0" algoitem="AFFICHER &quot;Veuillez entrer la note n°&quot;"/>
            <item code="3#i#0#pasliste" algoitem="AFFICHER i"/>
            <item code="4# : #0" algoitem="AFFICHER &quot; : &quot;"/>
            <item code="2#noteSaisie#pasliste" algoitem="LIRE noteSaisie"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Vous avez rentré la note de 0, bonne journée.#1" algoitem="AFFICHER &quot;Vous avez rentré la note de 0, bonne journée.&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
