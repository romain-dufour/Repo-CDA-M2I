import { StyleSheet, Text, View,Pressable } from 'react-native'
import React from 'react'

export default function FoodList(props,{navigation}) {


  return (

    <Pressable onPress={() => navigation.navigate("MealsOverView",{title:dataList})}>
<View>
    <Text>{props.item.text}</Text>
</View>
    </Pressable>

  )
}

const styles = StyleSheet.create({})