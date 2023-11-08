import { StyleSheet, Text, View, Button } from 'react-native'
import React from 'react'

export default function Home({ navigation }) {
    return (
        <View style={styles.container}>
            <View style={styles.containerTexte}>
                <Text style={styles.texte}>Mes contacts</Text>
            </View>
            <View style={styles.bouton}>
                <Button title="Jean Michel" onPress={() => navigation.navigate("Display", { Prenom: "Jean Michel", Nom: "alphonse", telephone: "0675489510", adresse: "3 rue des lilas , loin" })} />
            </View>
            <View style={styles.bouton}>
                <Button title="Robert" onPress={() => navigation.navigate('Display', { Prenom: "Robert", Nom: "alphonse", telephone: "0675489510", adresse: "3 rue des lilas , loin" })} />
            </View>
            <View style={styles.bouton}>
                <Button title="Mon numero" onPress={() => navigation.navigate('Display', { Prenom: "Mon numero", Nom: "", telephone: "0675489510", adresse: "3 rue des lilas , loin" })} />
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "#9b59b6",
    },
    texte: {
        fontSize: 20,
        fontWeight: "bold",
    },
    containerTexte: {
        margin: 20,
        alignItems: 'center',
        justifyContent: 'center'
    },
    bouton: {
        margin: 20,
        width: "auto",

    }


})