import { StyleSheet, Text, View, Pressable, Article, FlatList } from 'react-native'
import React, { useState } from 'react'
// import { useNavigation } from 'react-router-dom'

export default function Home({ navigation }) {

  const [articles, setArticles] = useState()
  function addArticle(article) {
    setArticles(articlesCurrent => [
      ...articlesCurrent,
      { text: article, id: Math.random().toString() }
    ])
  }
    return (

      <View style={styles.container}>
        <Pressable addArticle={addArticle} onPress={() => navigation.navigate('FormAddArticle')} style={({ pressed }) => pressed && styles.pressedItem}>
          <View style={styles.custonButton}>
            <Text style={styles.texte}>Add Article</Text>
          </View>
        </Pressable>
        <View>

        </View>
        <FlatList data={articles} renderItem={(itemData) => {
          return (
            <Article item={itemData.item} deleteArticle={deleteArticle}></Article>
          )
        }
        } keyExtractor={(item, index) => {
          return index // item.id
        }}
        ></FlatList>
      </View>

    )
  
}

const styles = StyleSheet.create({
  container: {
    margin: 25
  },
  custonButton: {
    backgroundColor: 'blue',
    padding: 10,
    height: 'auto',
    justifyContent: "center",
    alignItems: "center",
    borderRadius: 15,

  },
  texte: {
    fontSize: 20,
    fontWeight: "bold",
    color: "white",

  },
  pressedItem: {
    backgroundColor: "yellow",

  }

})