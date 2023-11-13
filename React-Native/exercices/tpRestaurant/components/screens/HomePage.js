import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { CATEGORIES } from '../projet/data/data'
import CustomMealType from '../CustomMealType'
import FoodList from '../FoodList'

export default function HomePage(navigation, route) {
  const dataList = CATEGORIES
  console.log("data", dataList)

  return (
    <View>
      <Text>App</Text>
      <FlatList data={dataList}
        renderItem={

          ({ item }) => <FoodList item={item} />}
        keyExtractor={item => item.id.toString()}
      />
    </View>
  );
}

    //     (itemData) => {
    //     return (
    //       <FoodList item={item}></FoodList>
    //     )
    //   }
    //   } keyExtractor={(item, index) => {
    //     return index
    //   }
    // }



const styles = StyleSheet.create({})