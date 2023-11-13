import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { Provider } from 'react-redux'
import { createNativeStackNavigator } from '@react-navigation/native-stack'
import HomePage from './components/screens/HomePage'
import MealsOverView from './components/screens/MealsOverView'
import AboutTheMeal from './components/screens/AboutTheMeal'


export default function App() {
    const Stack = createNativeStackNavigator()

    return (

        <NavigationContainer>
            <Stack.Navigator>
                <Stack.Screen name='HomePage' component={HomePage} options={{title : "All categories"}}></Stack.Screen>
                <Stack.Screen name='MealsOverView' component={MealsOverView} ></Stack.Screen>
                <Stack.Screen name='AboutTheMeal' component={AboutTheMeal}></Stack.Screen>
            </Stack.Navigator>
        </NavigationContainer>
    


    )
}

const styles = StyleSheet.create({})