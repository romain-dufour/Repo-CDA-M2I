import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createDrawerNavigator } from '@react-navigation/drawer'
import PageA from './screen/PageA'
import PageB from './screen/PageB'


// package necessaire navigation :
// npm install @react-navigation/native
// npm install react-native-screens react-native-safe-area-context
// npm i @react-navigation/drawer
// npm i react-native-gesture-handler
// npm i react-natime-reanimated

const Drawer = createDrawerNavigator()

export default function App() {
  return (
<NavigationContainer >
    <Drawer.Navigator>
        <Drawer.Screen name='PageA' component={PageA}/>
        <Drawer.Screen name='PageA' component={PageB}/>
    </Drawer.Navigator>

</NavigationContainer>

  )
}

const styles = StyleSheet.create({})