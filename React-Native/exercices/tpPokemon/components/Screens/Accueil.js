import { StyleSheet, Pressable, Text, View, Image, ImageBackground } from 'react-native'
import React, { useEffect, useState } from 'react'
import Option from '../Option'
import AsyncStorage from '@react-native-async-storage/async-storage'
import {font_ecran} from '../assets/font_ecran'
export default function Accueil({ navigation }) {

const image = {uri : "https://static.printler.com/media/photo/136994-1.jpg"}
    return (
        <View style={styles.container}>
            <ImageBackground 
            source={image}
            resizeMode="cover" style={styles.image}>
            <Text style={styles.texte}>Attrapez les tous, Pokemon !!</Text>
            <View style={styles.Viewoption}   >
                <Option title="Pokemons" onPress={() => navigation.navigate('ListePokemons',)} color="#27ae60"></Option>
                <Option title="Pokedex" onPress={() => navigation.navigate('Pokedex')} color='#3498db'></Option>
            </View>
            </ImageBackground>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
         flex: 1,
    },
    image: {
        flex: 1,
        justifyContent: 'center',
      },
    texte: {
        fontSize: 40,
        marginBottom:100,
        color:"#8e44ad",
        fontWeight: "bold",
        // alignSelf:'center',
        textAlign:'center',
        justifyContent:'flex-start'

    },

    Viewoption: {
        marginTop:0,
        flexDirection: 'row',
        justifyContent: 'space-around'
    }
})