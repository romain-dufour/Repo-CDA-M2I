<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2defaut="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbre_aleatoire EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbre_aleatoire"/>
        <item algoitem="niveau EST_DU_TYPE NOMBRE" code="1#NOMBRE#niveau"/>
        <item algoitem="Choice EST_DU_TYPE NOMBRE" code="1#NOMBRE#Choice"/>
        <item algoitem="replay EST_DU_TYPE NOMBRE" code="1#NOMBRE#replay"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Choisir un mode de difficulté&quot;" code="4#Choisir un mode de difficulté#1"/>
        <item algoitem="AFFICHER &quot;1. Facile&quot;" code="4#1. Facile#1"/>
        <item algoitem="AFFICHER &quot;2. Moyen&quot;" code="4#2. Moyen#1"/>
        <item algoitem="AFFICHER &quot;3. Difficile&quot;" code="4#3. Difficile#1"/>
        <item algoitem="LIRE niveau" code="2#niveau#pasliste"/>
        <item algoitem="SI (niveau==1) ALORS" code="6#niveau==1">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="niveau PREND_LA_VALEUR 3" code="5#niveau#3#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (niveau==2) ALORS" code="6#niveau==2">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="niveau PREND_LA_VALEUR 5" code="5#niveau#5#pasliste"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="niveau PREND_LA_VALEUR 7" code="5#niveau#7#pasliste"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="nbre_aleatoire PREND_LA_VALEUR ALGOBOX_ALEA_ENT(1,niveau)" code="5#nbre_aleatoire#ALGOBOX_ALEA_ENT(1,niveau)#pasliste"/>
        <item algoitem="AFFICHER &quot;Chercher la boule cachée sous les gobelets : [&quot;" code="4#Chercher la boule cachée sous les gobelets : [#0"/>
        <item algoitem="SI (niveau==3) ALORS" code="6#niveau==3">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;_ _ _]&quot;" code="4#_ _ _]#1"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (niveau==5) ALORS" code="6#niveau==5">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;_ _ _ _ _]&quot;" code="4#_ _ _ _ _]#1"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="AFFICHER &quot;_ _ _ _ _ _ _]&quot;" code="4#_ _ _ _ _ _ _]#1"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="AFFICHER nbre_aleatoire" code="3#nbre_aleatoire#1#pasliste"/>
        <item algoitem="AFFICHER &quot;Votre choix :&quot;" code="4#Votre choix :#1"/>
        <item algoitem="LIRE Choice" code="2#Choice#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR 1" code="5#i#1#pasliste"/>
        <item algoitem="TANT_QUE (Choice!=nbre_aleatoire) FAIRE" code="15#Choice!=nbre_aleatoire">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="i PREND_LA_VALEUR i+1" code="5#i#i+1#pasliste"/>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #1"/>
            <item algoitem="AFFICHER &quot;Perdu, la boule était sous le gobelet : [&quot;" code="4#Perdu, la boule était sous le gobelet : [#0"/>
            <item algoitem="AFFICHER nbre_aleatoire" code="3#nbre_aleatoire#0#pasliste"/>
            <item algoitem="AFFICHER &quot;]&quot;" code="4#]#1"/>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #1"/>
            <item algoitem="AFFICHER &quot;On recommence (1/2) ?&quot;" code="4#On recommence (1/2) ?#1"/>
            <item algoitem="LIRE replay" code="2#replay#pasliste"/>
            <item algoitem="SI (replay==2) ALORS" code="6#replay==2">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="Choice PREND_LA_VALEUR nbre_aleatoire" code="5#Choice#nbre_aleatoire#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="nbre_aleatoire PREND_LA_VALEUR ALGOBOX_ALEA_ENT(1,niveau)" code="5#nbre_aleatoire#ALGOBOX_ALEA_ENT(1,niveau)#pasliste"/>
                    <item algoitem="AFFICHER nbre_aleatoire" code="3#nbre_aleatoire#0#pasliste"/>
                    <item algoitem="AFFICHER &quot;Votre choix :&quot;" code="4#Votre choix :#1"/>
                    <item algoitem="LIRE Choice" code="2#Choice#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="SI (replay==2) ALORS" code="6#replay==2">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Au revoir&quot;" code="4#Au revoir#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;Gagné, vous avez eu besoin de &quot;" code="4#Gagné, vous avez eu besoin de #0"/>
                <item algoitem="AFFICHER i" code="3#i#0#pasliste"/>
                <item algoitem="AFFICHER &quot; tentatives !&quot;" code="4# tentatives !#0"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
