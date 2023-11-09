import { Button, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState, useEffect } from 'react'
import Geolocation from '@react-native-community/geolocation'
import axios from 'axios'
import { getActionFromState } from '@react-navigation/native'


// npm i @react-native-community/geolocation 
// ajout de la ligne : 
// dans le répertoir android/app/src/main/AndroidManifest.xml
// rajouter <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

// const URL_Adress = "http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=%20JEkmX3KrFVxlKLl5aOzXQ71c4Y9zglgh%20&q=50.6157%2C%203.1048&language=en-us&details=false&toplevel=false"

export default function App() {

    const [latitude, setLatitude] = useState(null)
    const [longitude, setLongitude] = useState(null)
    const [getPosition, setGetPosition] = useState(true)
    const [localisationFetch, setLocalisationFetch] = useState({ pays: "", ville: "" })

    // const [ville, setVille] = useState({ ville: "" })

    // const getVille = async() => {
    //     try {
    //         const maVille = await axios.get(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=%20JEkmX3KrFVxlKLl5aOzXQ71c4Y9zglgh%20&q=${latitude}%2C%${longitude}`)
    //         if(maVille !== null){
    //             setVille(maVille.LocalizedName)
    //         }
    //     }catch (error) {
    //         console.error(error.message)
    // }}

    function getApiWithFetch() {
        fetch(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=%20JEkmX3KrFVxlKLl5aOzXQ71c4Y9zglgh%20&q=${latitude}%2C${longitude}`)
            .then(response => response.json())
            .then(data => setLocalisationFetch({pays : data.Country.LocalizedName, ville:data.LocalizedName}))
    .catch(error => console.log(error))
        }



    useEffect(() => {
        Geolocation.requestAuthorization()
        Geolocation.getCurrentPosition(position => {
            setLatitude(position.coords.latitude)
            setLongitude(position.coords.longitude)
        },
            error => console.log(error),
            { enableHighAccuracy: true, timeout: 20000, maximumAge: 1000 }
        )
    }, [getPosition])

    function reload() {
        setGetPosition(state => !state)
    }

    return (
        <View>
            <Button onPress={reload} title='mettre a jour' />
            <Text>Latitude : {latitude}</Text>
            <Text>Longitude : {longitude}</Text>
            <Button title='Get location withFetch' onPress={getApiWithFetch} />
            <Text>Localisation : {localisationFetch.pays} {localisationFetch.ville}</Text>
            {/* <TextInput > {getVille.ville}</TextInput> */}

        </View>
    )
}

const styles = StyleSheet.create({})