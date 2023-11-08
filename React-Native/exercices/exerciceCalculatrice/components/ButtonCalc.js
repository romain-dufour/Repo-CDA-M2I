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
    width: 80,
    height: 80,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: "white",
    borderRadius: 40,
  },
  operatorItem: {
    backgroundColor: "grey",
    borderRadius: 15,
    width: 80,
    height: 80,
    alignItems: 'center',
    justifyContent: 'center',
  },
  numberText: {
    color: "black",
    fontSize:30
  },
  operatorText: {
    color: 'white',
    fontSize:30

  }
})