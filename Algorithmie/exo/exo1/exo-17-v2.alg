<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Au revoir&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2lignes="" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="note EST_DU_TYPE NOMBRE" code="1#NOMBRE#note"/>
        <item algoitem="petite EST_DU_TYPE NOMBRE" code="1#NOMBRE#petite"/>
        <item algoitem="grande EST_DU_TYPE NOMBRE" code="1#NOMBRE#grande"/>
        <item algoitem="moyenne EST_DU_TYPE NOMBRE" code="1#NOMBRE#moyenne"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="menu EST_DU_TYPE NOMBRE" code="1#NOMBRE#menu"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;vous ne pouvez plus rentrer de note&quot;" code="4#vous ne pouvez plus rentrer de note#1"/>
        <item algoitem="petite PREND_LA_VALEUR 20" code="5#petite#20#pasliste"/>
        <item algoitem="grande PREND_LA_VALEUR 0" code="5#grande#0#pasliste"/>
        <item algoitem="AFFICHER &quot;rentrez une note&quot;" code="4#rentrez une note#0"/>
        <item algoitem="LIRE note" code="2#note#pasliste"/>
        <item algoitem="moyenne PREND_LA_VALEUR moyenne+note" code="5#moyenne#moyenne+note#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR 1" code="5#i#1#pasliste"/>
        <item algoitem="TANT_QUE (note>0) FAIRE" code="15#note>0">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="TANT_QUE (note&lt;petite) FAIRE" code="15#note&lt;petite">
                <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
                <item algoitem="petite PREND_LA_VALEUR note" code="5#petite#note#pasliste"/>
                <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
            </item>
            <item algoitem="TANT_QUE (grande&lt;note) FAIRE" code="15#grande&lt;note">
                <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
                <item algoitem="grande PREND_LA_VALEUR note" code="5#grande#note#pasliste"/>
                <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
            </item>
            <item algoitem="moyenne PREND_LA_VALEUR moyenne+note" code="5#moyenne#moyenne+note#pasliste"/>
            <item algoitem="i PREND_LA_VALEUR i+1" code="5#i#i+1#pasliste"/>
            <item algoitem="AFFICHER &quot;Pour avoir la note moyenne, tapez 1&quot;" code="4#Pour avoir la note moyenne, tapez 1#1"/>
            <item algoitem="AFFICHER &quot;Pour avoir la plus petite note, tapez 2&quot;" code="4#Pour avoir la plus petite note, tapez 2#1"/>
            <item algoitem="AFFICHER &quot;Pour avoir la plus grande note, tapez 3&quot;" code="4#Pour avoir la plus grande note, tapez 3#1"/>
            <item algoitem="AFFICHER &quot;Pour quitter, tapez 4&quot;" code="4#Pour quitter, tapez 4#1"/>
            <item algoitem="LIRE menu" code="2#menu#pasliste"/>
            <item algoitem="SI (menu>=4) ALORS" code="6#menu>=4">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="note PREND_LA_VALEUR 0" code="5#note#0#pasliste"/>
                <item algoitem="AFFICHER &quot;Au revoir&quot;" code="4#Au revoir#0"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="SI (menu==1) ALORS" code="6#menu==1">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="moyenne PREND_LA_VALEUR moyenne/i" code="5#moyenne#moyenne/i#pasliste"/>
                        <item algoitem="AFFICHER &quot;la note moyenne est : &quot;" code="4#la note moyenne est : #0"/>
                        <item algoitem="AFFICHER moyenne" code="3#moyenne#1#pasliste"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="SI (menu==2) ALORS" code="6#menu==2">
                                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                <item algoitem="AFFICHER &quot;la plus petite note est : &quot;" code="4#la plus petite note est : #0"/>
                                <item algoitem="AFFICHER petite" code="3#petite#1#pasliste"/>
                                <item algoitem="FIN_SI" code="8#finsi"/>
                                <item algoitem="SINON" code="9#sinon">
                                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                    <item algoitem="SI (menu==3) ALORS" code="6#menu==3">
                                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                                        <item algoitem="AFFICHER &quot;la plus grande note est : &quot;" code="4#la plus grande note est : #0"/>
                                        <item algoitem="AFFICHER grande" code="3#grande#1#pasliste"/>
                                        <item algoitem="FIN_SI" code="8#finsi"/>
                                    </item>
                                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                                </item>
                            </item>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="LIRE note" code="2#note#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER &quot;Au revoir&quot;" code="4#Au revoir#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
