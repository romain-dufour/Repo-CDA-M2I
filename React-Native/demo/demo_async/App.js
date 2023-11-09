import { Button, StyleSheet, Text, View } from 'react-native'
import React, { useState } from 'react'
import AsyncStorage from '@react-native-async-storage/async-storage'

export default function App() {

    const [value, setValue] = useState({ nom: "", prenom: "" })

    // stockage String
    // const addData = async () => {
    //     try {
    //         await AsyncStorage.setItem('@storage_Key', "toto")
    //         // pour une deuxieme value du storage await AsyncStorage.setItem('@storage_Key2', "toto")

    //     } catch (error) {
    //         console.log(error);
    //     }
    // }
    // const getData = async () => {
    //     try {
    //         const maValue = await AsyncStorage.getItem('@storage_Key')
    //         if(maValue !== null){
    //             setValue({nom : maValue, prenom: maValue})
    //         }
    //     } catch (error) {
    //         console.log(error);
    //     }
    // }
    // const deleteData = async () => {
    //     try {
    //         const maValue = await AsyncStorage.removeItem('@storage_Key')
    //         if(maValue !== null){
    //             setValue({ nom: "", prenom: "" })
    //         }
    //     } catch (error) {
    //         console.log(error);
    //     }
    // }

     // stockage objet
     const addData = async () => {
        try {
            await AsyncStorage.setItem('storageKeyObject',JSON.stringify({ nom: "tata", prenom: "titi" }))

        } catch (error) {
            console.log(error);
        }
    }
    const getData = async () => {
        try {
            const maValue = await AsyncStorage.getItem('storageKeyObject')
            if(maValue !== null){
                setValue(JSON.parse(maValue))
            }
        } catch (error) {
            console.log(error);
        }
    }
    const deleteData = async () => {
        try {
            const maValue = await AsyncStorage.removeItem('storageKeyObject')
            
                setValue({ nom: "", prenom: "" })
            
        } catch (error) {
            console.log(error);
        }
    }

        return (
            <View>
                <Text>Nom : {value.nom}</Text>
                <Text>Prenom : {value.prenom}</Text>
                <Button title='Add data' onPress={addData}></Button>
                <Button title='Get Data' onPress={getData}></Button>
                <Button title='Delete data' onPress={deleteData}></Button>

            </View>
        )
    }

    const styles = StyleSheet.create({})