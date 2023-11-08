import { Button, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function PageC({navigation}) {
  return (
    <View>
      <Text>PageC</Text>
      <Button title="Go to PageA" onPress={()=> navigation.navigate('PageA',{message : "coucou"})}/>
      <Button title="Go to PageB" onPress={()=> navigation.navigate('PageB')}/>
    </View>
  )
}

const styles = StyleSheet.create({})