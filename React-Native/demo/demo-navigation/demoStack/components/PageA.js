import { Button, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function PageA({route}) {
const message = route.params.message

  return (
    <View>
      <Text>PageA</Text>
      <Text>{route.params.message}</Text>
{/*      ou autre maniere avec creation d'une constante  */}
      <Text>{message}</Text>

    </View>
  )
}
//ds
const styles = StyleSheet.create({})