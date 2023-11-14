import { StyleSheet, Text, View, Pressable, FlatList, Image } from 'react-native'
import React from 'react'
import Type from './Type'

export default function GridPokemon({ name, image, onPress, type, color }) {

  
  return (
    <View style={[styles.gridItem,{backgroundColor: type[0].type.name == 
    "fire" ? "red" : "normal"? "grey" :"poison" ? "purple" : "ground" ? "#e67e22" : "bug" ? "green" : "electric" ?  "yellow" : "blue" }]}  >
      <Pressable onPress={onPress}  style={styles.pokeContainer}>
        <View style={styles.textContainer}>
          <Text style={styles.title}>{name}</Text>
          <FlatList
            data={type}
            // keyExtractor={(item,index) =>index.toString()}
            renderItem={({ item }) => {
              return (
                <Type name={item.type.name}  ></Type>
              )

            }}
          />

        </View>
        <View style={styles.imageContainer}>
          <Image style={styles.tinyLogo}
            source={{
              uri: image
            }} />
        </View>
      </Pressable>
    </View>

  )
}

const styles = StyleSheet.create({
  gridItem: {
    flex: 1,
    margin: 5,
    
    borderRadius: 15,
    backgroundColor: "white",
    elevation: 4,

  },
  pokeContainer: {
    flexDirection: 'row',
    height: 120,
  },
  textContainer: {
    margin:16,
    borderRadius: 8,

  },
  imageContainer: {
    alignItems: 'center',
  },
  title: {
    fontWeight: 'bold',
    textTransform: "capitalize",
    fontSize: 15,
  },
  tinyLogo: {
    width: 80,
    height: 80,
    overflow: 'hidden'
  }

})