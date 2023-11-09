import { StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import { NavigationContainer } from '@react-navigation/native'
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs'
import Home from './screen/Home'
import FormAddArticle from './screen/FormAddArticle'
import DetailsArticle from './screen/DetailsArticle'



export default function App() {
    const Tab = createBottomTabNavigator()
    const [listeCourse, setListeCourse] = useState()
    return (
        <NavigationContainer>
            <Tab.Navigator screenOptions={{ tabBarIconStyle: { display: "none" }, tabBarLabelPosition: "beside-icon" }}>
                <Tab.Screen name='Home' component={Home} />
                <Tab.Screen name='FormAddArticle' component={FormAddArticle} options={{headerShown: false}} />
                <Tab.Screen name='DetailsArticle' component={DetailsArticle} options={{headerShown: false}}/>

            </Tab.Navigator>
        </NavigationContainer>
    )
}

const styles = StyleSheet.create({})