import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function PageA({navigation}) {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
    <Button
      onPress={() => navigation.navigate('PageB')}
      title="Go to notifications"
    />
  </View>
  )
}

const styles = StyleSheet.create({})