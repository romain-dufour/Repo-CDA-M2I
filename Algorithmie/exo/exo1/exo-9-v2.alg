<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2defaut="" F2etat="inactif" F2para=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurLigne="2" arrondiAuto="vrai" epaisseurPoint="2" totalAffichages="1000" totalBoucles="5000000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="poids EST_DU_TYPE NOMBRE" code="1#NOMBRE#poids"/>
        <item algoitem="taille EST_DU_TYPE NOMBRE" code="1#NOMBRE#taille"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;quel est votre poids&quot;" code="4#quel est votre poids#0"/>
        <item algoitem="LIRE poids" code="2#poids#pasliste"/>
        <item algoitem="AFFICHER &quot;quel est votre taille&quot;" code="4#quel est votre taille#0"/>
        <item algoitem="LIRE taille" code="2#taille#pasliste"/>
        <item algoitem="SI ((poids>65 &amp;&amp; taille&lt;160) || (poids>71 &amp;&amp; taille&lt;163) || (poids&lt;48 &amp;&amp; taille>169) || (poids>54 &amp;&amp; taille>178)) ALORS" code="6#(poids>65 &amp;&amp; taille&lt;160) || (poids>71 &amp;&amp; taille&lt;163) || (poids&lt;48 &amp;&amp; taille>169) || (poids>54 &amp;&amp; taille>178)">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Nous n'avons pas votre taille&quot;" code="4#Nous n'avons pas votre taille#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI ((poids>=43 &amp;&amp; poids>=65 &amp;&amp; taille>=145 &amp;&amp; taille&lt;163) || (poids>=43 &amp;&amp; poids&lt;=59 &amp;&amp; taille>=160 &amp;&amp; taille&lt;166) || (poids>=43 &amp;&amp; poids&lt;=53 &amp;&amp; taille>=163 &amp;&amp; taille&lt;169) || (poids>=43 &amp;&amp; poids&lt;=47 &amp;&amp; taille>=166 &amp;&amp; taille&lt;=169)) ALORS" code="6#(poids>=43 &amp;&amp; poids>=65 &amp;&amp; taille>=145 &amp;&amp; taille&lt;163) || (poids>=43 &amp;&amp; poids&lt;=59 &amp;&amp; taille>=160 &amp;&amp; taille&lt;166) || (poids>=43 &amp;&amp; poids&lt;=53 &amp;&amp; taille>=163 &amp;&amp; taille&lt;169) || (poids>=43 &amp;&amp; poids&lt;=47 &amp;&amp; taille>=166 &amp;&amp; taille&lt;=169)">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHER &quot;votre taille est 1&quot;" code="4#votre taille est 1#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (poids>=48 &amp;&amp; poids&lt;54 &amp;&amp; taille>166 &amp;&amp; taille&lt;183 || poids>=54 &amp;&amp; poids&lt;60 &amp;&amp; taille>163 &amp;&amp; taille&lt;178 || poids>=60 &amp;&amp; poids&lt;66 &amp;&amp; taille>160 &amp;&amp; taille&lt;175 || poids>=66 &amp;&amp; poids&lt;72 &amp;&amp; taille>157 &amp;&amp; taille&lt;172) ALORS" code="6#poids>=48 &amp;&amp; poids&lt;54 &amp;&amp; taille>166 &amp;&amp; taille&lt;183 || poids>=54 &amp;&amp; poids&lt;60 &amp;&amp; taille>163 &amp;&amp; taille&lt;178 || poids>=60 &amp;&amp; poids&lt;66 &amp;&amp; taille>160 &amp;&amp; taille&lt;175 || poids>=66 &amp;&amp; poids&lt;72 &amp;&amp; taille>157 &amp;&amp; taille&lt;172">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;votre taille est 2&quot;" code="4#votre taille est 2#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="AFFICHER &quot;votre taille est 3&quot;" code="4#votre taille est 3#0"/>
                                <item algoitem="FIN_SINON" code="11#finsinon"/>
                            </item>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
