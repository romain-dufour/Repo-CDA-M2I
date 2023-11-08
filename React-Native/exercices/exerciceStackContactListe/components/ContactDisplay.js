import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function ContactDisplay({route}) {
    const display = route.params
  return (
    <View  style={styles.container}>
      <Text style={styles.texte} >{display.Nom}</Text>
      <Text style={styles.texte}>{display.Prenom}</Text>
      <Text style={styles.texte}>{display.telephone}</Text>
      <Text style={styles.texte}>{display.adresse}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
    container : {
        flex : 1,
        backgroundColor : "#1abc9c",
        alignItems: 'center',
        justifyContent:'center'
    },
    texte : {
        fontSize: 20,
        margin:20,
        fontWeight:"bold"
    }
})