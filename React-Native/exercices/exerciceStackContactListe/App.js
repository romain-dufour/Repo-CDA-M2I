import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import ContactDisplay from './components/ContactDisplay'
import Home from './components/Home'

export default function App() {
const Stack = createNativeStackNavigator()

  return (
<NavigationContainer>
    <Stack.Navigator >
    <Stack.Screen name = 'Contact' component={Home} options={{title: 'Home'}}></Stack.Screen>
    <Stack.Screen name = 'Display' component={ContactDisplay} options={{title: 'Contact'}}></Stack.Screen>
    </Stack.Navigator>
</NavigationContainer>
  )
}

const styles = StyleSheet.create({})