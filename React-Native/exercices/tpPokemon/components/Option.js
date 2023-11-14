import { StyleSheet, Text, View, Pressable } from 'react-native'
import React from 'react'

export default function Option({ onPress, title, color }) {

  return (
    <Pressable onPress={onPress} style={styles.container} >
      <Text style={styles.option} backgroundColor={color}>{title}</Text>
    </Pressable>

  )
}

const styles = StyleSheet.create({
  container: {
    justifyContent: 'space-between'
  },
  option: {
    color: "white",
    width: 150,
    textAlign: 'center',
    fontSize: 20,
    fontWeight: "bold",
    borderRadius: 25,
    padding: 20
  }
})