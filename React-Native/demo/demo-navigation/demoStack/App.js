import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import PageA from './components/PageA'
import PageB from './components/PageB'
import PageC from './components/PageC'


export default function App() {
const Stack = createNativeStackNavigator()

  return (
<NavigationContainer>
    <Stack.Navigator initialRouteName='PageC'>
        <Stack.Screen name='PageA' component={PageA} options={{title: "Ma page A"}}/> 
        <Stack.Screen name='PageB' component={PageB}/>
        <Stack.Screen name='PageC' component={PageC} options = {{headerShown : false}}/>

    </Stack.Navigator>
</NavigationContainer>
  )
}

const styles = StyleSheet.create({})