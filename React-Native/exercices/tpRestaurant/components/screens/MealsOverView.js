import { Image, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function MealsOverView({route}) {

    const image = route.params.imageUrl
    const title = route.params.title
    const duration = route.params.duration
    const complexity = route.params.complexity
    const affordability = route.params.affordability

  return (
//faire pour chaque meal selon la catégorie sélectionnée (flatlist ou scroll ??)
// voir pour créer un 

    <Pressable>
    <View>
      <Image 
    //   style= {}
      source={image}
      ></Image>
      <Text>{title}</Text>
      <Text>{duration}</Text>
      <Text>{complexity}</Text>
      <Text>{affordability}</Text>
    </View>
    </Pressable>

  )
}

const styles = StyleSheet.create({})