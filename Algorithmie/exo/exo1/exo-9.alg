<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SI"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" nbDecimales="8" totalAffichages="1000" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="Poids EST_DU_TYPE NOMBRE" code="1#NOMBRE#Poids"/>
        <item algoitem="taille EST_DU_TYPE NOMBRE" code="1#NOMBRE#taille"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;quel est votre poids&quot;" code="4#quel est votre poids#0"/>
        <item algoitem="LIRE Poids" code="2#Poids#pasliste"/>
        <item algoitem="AFFICHER &quot;quel est votre taille&quot;" code="4#quel est votre taille#0"/>
        <item algoitem="LIRE taille" code="2#taille#pasliste"/>
        <item algoitem="SI (Poids>=43 &amp;&amp; Poids&lt;=47 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=169 ) ALORS" code="6#Poids>=43 &amp;&amp; Poids&lt;=47 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=169 ">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre taille est 1&quot;" code="4#votre taille est 1#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
        <item algoitem="SI (Poids>=48 &amp;&amp; Poids&lt;=53 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=166 ) ALORS" code="6#Poids>=48 &amp;&amp; Poids&lt;=53 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=166 ">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre taille est 1&quot;" code="4#votre taille est 1#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (Poids>=48 &amp;&amp; Poids&lt;=53 &amp;&amp; taille>=169 &amp;&amp;taille&lt;=178) ALORS" code="6#Poids>=48 &amp;&amp; Poids&lt;=53 &amp;&amp; taille>=169 &amp;&amp;taille&lt;=178">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;votre taille est 2&quot;" code="4#votre taille est 2#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="SI (Poids>=54 &amp;&amp; Poids&lt;=59 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=163) ALORS" code="6#Poids>=54 &amp;&amp; Poids&lt;=59 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=163">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre taille est 1&quot;" code="4#votre taille est 1#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (Poids>=54 &amp;&amp; Poids&lt;=59 &amp;&amp; taille>=166 &amp;&amp;taille&lt;=175) ALORS" code="6#Poids>=54 &amp;&amp; Poids&lt;=59 &amp;&amp; taille>=166 &amp;&amp;taille&lt;=175">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;votre taille est 2&quot;" code="4#votre taille est 2#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (Poids>=54 &amp;&amp; Poids&lt;=59 &amp;&amp; taille>=178 &amp;&amp;taille&lt;=183) ALORS" code="6#Poids>=54 &amp;&amp; Poids&lt;=59 &amp;&amp; taille>=178 &amp;&amp;taille&lt;=183">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;votre taille est 3&quot;" code="4#votre taille est 3#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="SI (Poids>=60 &amp;&amp; Poids&lt;=65 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=160) ALORS" code="6#Poids>=60 &amp;&amp; Poids&lt;=65 &amp;&amp; taille>=145 &amp;&amp;taille&lt;=160">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre taille est 1&quot;" code="4#votre taille est 1#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (Poids>=60 &amp;&amp; Poids&lt;=65 &amp;&amp; taille>=163 &amp;&amp;taille&lt;=172) ALORS" code="6#Poids>=60 &amp;&amp; Poids&lt;=65 &amp;&amp; taille>=163 &amp;&amp;taille&lt;=172">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;votre taille est 2&quot;" code="4#votre taille est 2#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (Poids>=60 &amp;&amp; Poids&lt;=65 &amp;&amp; taille>=175 &amp;&amp;taille&lt;=183) ALORS" code="6#Poids>=60 &amp;&amp; Poids&lt;=65 &amp;&amp; taille>=175 &amp;&amp;taille&lt;=183">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;votre taille est 3&quot;" code="4#votre taille est 3#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="SI (Poids>=66 &amp;&amp; Poids&lt;=71 &amp;&amp; taille>=160 &amp;&amp;taille&lt;=169) ALORS" code="6#Poids>=66 &amp;&amp; Poids&lt;=71 &amp;&amp; taille>=160 &amp;&amp;taille&lt;=169">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre taille est 2&quot;" code="4#votre taille est 2#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (Poids>=66 &amp;&amp; Poids&lt;=71 &amp;&amp; taille>=172 &amp;&amp;taille&lt;=183) ALORS" code="6#Poids>=66 &amp;&amp; Poids&lt;=71 &amp;&amp; taille>=172 &amp;&amp;taille&lt;=183">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;votre taille est 3&quot;" code="4#votre taille est 3#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="SI (Poids>=72 &amp;&amp; Poids&lt;=77 &amp;&amp; taille>=163 &amp;&amp;taille&lt;=183) ALORS" code="6#Poids>=72 &amp;&amp; Poids&lt;=77 &amp;&amp; taille>=163 &amp;&amp;taille&lt;=183">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;votre taille est 3&quot;" code="4#votre taille est 3#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
