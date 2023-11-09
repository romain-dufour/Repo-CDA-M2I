import { Button, Image, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'

export default function FormAddArticle({ navigation }) {
    const [texteArticle, setTexteArticle] = useState("")
    const [articles, setArticles] = useState([])


    function recupTextArticle(enteredText) {
        setTexteArticle(enteredText)
    }
    // function addElement() {
    //     // props.addArticle(texteArticle)
    // }

    function addArticle(article) {
        setArticles(articlesCurrent => [
            ...articlesCurrent,
            { text: article, id: Math.random().toString() }

        ])
        console.log(texteArticle)
    }

    return (
        <View style={styles.container}>
            <Image source={require('./assets/caddie.png')} style={styles.image} resizeMode='contain' />

            <TextInput style={styles.textInput} placeholder='Article' value={texteArticle} onChangeText={recupTextArticle} />


            <View style={styles.buttonContainer}>
                <Pressable addArticle={addArticle} onPress={() => navigation.navigate('FormAddArticle')} style={styles.addArticleContainer}>
                    <View >
                        <Text style={styles.texteArticle}>Add Article</Text>
                    </View>
                </Pressable>
                <Pressable style={styles.cancelContainer} addArticle={addArticle} onPress={() => navigation.navigate('Home')} >
                    <View >
                        <Text style={styles.texteCancel}>Cancel</Text>
                    </View>
                </Pressable>

            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
    },
    textInput: {
        borderWidth: 1,
        borderColor: "#cccccc",
        width: "70%",
        padding: 8,
        borderRadius: 12,
    },
    buttonContainer: {
        marginTop: 16,
        flexDirection: 'row',
    },
    button: {
        width: "40%",
        marginHorizontal: 8,
    },
    image: {
        width: 100,
        height: 150,
    },
    presseditem: {
        backgroundColor: "yellow",
    },
    texteCancel: {
        fontSize: 20,
        fontWeight: "bold",
        color: "white",

    },
    texteArticle: {
        fontSize: 20,
        fontWeight: "bold",
        color: "white",

    },
    cancelContainer: {
        backgroundColor: "red",
        marginTop: 16,
        flexDirection: 'row',
        width: "40%",
        marginHorizontal: 8,
        justifyContent: 'center',
        borderRadius:5,
    },
    addArticleContainer: {
        backgroundColor: "blue",
        marginTop: 16,
        flexDirection: 'row',
        width: "40%",
        marginHorizontal: 8,
        justifyContent: 'center',
        borderRadius:5,
    },

})