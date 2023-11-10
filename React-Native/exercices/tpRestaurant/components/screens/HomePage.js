import { FlatList, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import {CATEGORIES} from '../projet/data/data'
import CustomMealType from '../CustomMealType'

export default function HomePage(navigation,route) {
const dataList= CATEGORIES

  return (
    <View>
      <FlatList data={dataList} renderItem={(itemData) => {
        return(
            <CATEGORIES item={itemData.item}></CATEGORIES>

        )
      }
    }keyExtractor={(item,index) => {
        return index
    }
    }
       ></FlatList>
    </View>
  )
}

const styles = StyleSheet.create({})