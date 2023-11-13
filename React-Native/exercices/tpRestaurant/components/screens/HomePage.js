import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { CATEGORIES, MEALS } from '../projet/data/data'
import CustomMealType from '../CustomMealType'

export default function HomePage({ navigation ,route}) {
  const dataList = CATEGORIES
  const meal = MEALS
  console.log("data", dataList)

  return (
    <View style={styles.container}>      
      <FlatList data={dataList}
        renderItem={
          ({item}) => 
          <Pressable onPress={() => navigation.navigate("MealsOverView",{categoryId : itemData.item.id})} >
          <View>
              <Text>{item.title}</Text>
          </View>
      </Pressable>
        }
        keyExtractor={item => item.id.toString()}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flexDirection: "column",
    width: 180,
    
  }
})