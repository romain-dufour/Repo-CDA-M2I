import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import { NavigationContainer } from '@react-navigation/native'
import Accueil from './components/Screens/Accueil'
import Pokedex from './components/Screens/Pokedex'
import DetailsPokemon from './components/Screens/DetailsPokemon'
import ListePokemons from './components/Screens/ListePokemons'

export default function App() {
const Stack = createNativeStackNavigator()

  return (
<NavigationContainer>
    <Stack.Navigator>
        <Stack.Screen name='Accueil' component={Accueil} />
        <Stack.Screen name='ListePokemons' component={ListePokemons} options={{title : "Pokemons"}}/>
        <Stack.Screen name='DetailsPokemon' component={DetailsPokemon} options={{title : "Détails"}}/>
        <Stack.Screen name='Pokedex' component={Pokedex} options={{title : "Mon Pokedex"}}/>
    </Stack.Navigator>
</NavigationContainer>
  )
}

const styles = StyleSheet.create({})