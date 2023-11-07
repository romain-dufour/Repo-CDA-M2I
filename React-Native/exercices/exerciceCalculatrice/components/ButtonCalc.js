import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function ButtonCalc(props) {
  return (
     <Pressable onPress={props.calculate}>
       <View style={props.isNumber ? styles.numberItem : styles.operatorItem}>
         <Text style={props.isNumber ? styles.numberText : styles.operatorText} >{props.item.text}</Text>
       </View>
     </Pressable>

  )
}

const styles = StyleSheet.create({

  numberItem: {
    width: 60,
    height: 60,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: "white",
    borderRadius: 30,
  },
  operatorItem: {
    backgroundColor: "grey",
    borderRadius: 5,
    width: 60,
    height: 60,
    alignItems: 'center',
    justifyContent: 'center',
  },
  numberText: {
    color: "black",
  },
  operatorText: {
    color: 'white'
  }
})