<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="n PREND_LA_VALEUR -3"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" maxBoucle="500000" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#n" algoitem="n EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#text" algoitem="text EST_DU_TYPE CHAINE"/>
        <item code="1#LISTE#tab1" algoitem="tab1 EST_DU_TYPE LISTE"/>
        <item code="1#LISTE#tab2" algoitem="tab2 EST_DU_TYPE LISTE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#veuillez rentrer un nombre supérieur à 1 :#0" algoitem="AFFICHER &quot;veuillez rentrer un nombre supérieur à 1 :&quot;"/>
        <item code="2#n#pasliste" algoitem="LIRE n"/>
        <item code="12#i#0#n" algoitem="POUR i ALLANT_DE 0 A n">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#i%3==0 &amp;&amp; i%5==0" algoitem="SI (i%3==0 &amp;&amp; i%5==0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#n#-1#pasliste" algoitem="n PREND_LA_VALEUR -1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#i%3==0" algoitem="SI (i%3==0) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="5#n#-2#pasliste" algoitem="n PREND_LA_VALEUR -2"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                        <item code="9#sinon" algoitem="SINON">
                            <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                            <item code="6#i%5==0" algoitem="SI (i%5==0) ALORS">
                                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                <item code="5#n#-3#pasliste" algoitem="n PREND_LA_VALEUR -3"/>
                                <item code="8#finsi" algoitem="FIN_SI"/>
                            </item>
                            <item code="11#finsinon" algoitem="FIN_SINON"/>
                        </item>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="6#i%3==0 || i%5==0" algoitem="SI (i%3==0 || i%5==0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#tab1#(n)#i-1" algoitem="tab1[i-1] PREND_LA_VALEUR (n)"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="5#tab1#(i)#i-1" algoitem="tab1[i-1] PREND_LA_VALEUR (i)"/>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="12#i#0#n" algoitem="POUR i ALLANT_DE 0 A n">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="20#tab1[i]#0" algoitem="AFFICHERCALCUL tab1[i]"/>
            <item code="4# ; #0" algoitem="AFFICHER &quot; ; &quot;"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
