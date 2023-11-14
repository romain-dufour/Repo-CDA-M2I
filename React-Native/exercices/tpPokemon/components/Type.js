import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function Type(name) {

  return (
    <View style={styles.container}>
      <Text style={styles.view}>{name.name}</Text>
    </View>
  )
}

const styles = StyleSheet.create({
  container:{
    opacity:40,
  },
  view:{
    // backgroundColor:"red",
    margin:2,
    textAlign:'center',
    fontSize:12,
    color:'white',
    borderRadius:10,
    height:20,
    width:50
  }
})