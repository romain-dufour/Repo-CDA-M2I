import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Provider } from 'react-redux'
import { store } from './store/redux/store'
import MyID from './MyID'

// npm i @reduxjs/toolkit react-redux 
export default function App() {
  return (
    <Provider store={store}>
    <View>
      <Text>App</Text>
      <MyID ></MyID>
    </View>
    </Provider>

  )
}

const styles = StyleSheet.create({})