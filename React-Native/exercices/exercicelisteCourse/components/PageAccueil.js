import { useState } from "react";
import { Button, FlatList, Text, Modal, View, StyleSheet, Pressable } from "react-native";
import ModalAddItem from "./ModalAddItem";


export default function PageAccueil() {
    const [modalVisible, setModalVisible] = useState(false)
    const [articles, setArticles] = useState([])

    function closeModal() {
        setModalVisible(false)
    }
    function OpenModal() {
        setModalVisible(true)
    }
    function addArticle(article) {
        setArticles(articlesCurrent => [
            ...articlesCurrent,
            { text: article, id: Math.random().toString() }
        ])
        console.log(articles)
        setModalVisible(false)
    }
    function deleteArticle(id) {
        console.log(id);
        setArticles((articlesCurrent) => {
            return (
                articlesCurrent.filter(article => article.id != id))
        })
    }


    return (
        <View style={styles.container}>
            <Button title="Ajouter un article" onPress={OpenModal} style={styles.button} />
            <ModalAddItem visible={modalVisible} closeModal={closeModal} addArticle={addArticle}></ModalAddItem>
            <View style={styles.articleList}>
                <FlatList data={articles} renderItem={(itemData) => {
                    return (
                        <Pressable onPress={() => { deleteArticle(itemData.item.id) }}>
                            <View>
                                <Text style={styles.article}>{itemData.item.text} </Text>
                            </View>
                        </Pressable>

                    )
                }} keyExtractor={(item, index) => {
                    return index
                    //item.id marche aussi 
                }}
                />
            </View>

        </View>
    )
}

const styles = StyleSheet.create({

    container: {
        margin: 20,
    },
    articleList: {
        padding: 10
    },
    article: {
        backgroundColor: "#9b59b6",
        marginTop: 15,
        borderRadius: 10,
        height: 40,
        textAlignVertical: 'center',
        padding: 10,
        fontSize: 15,
        fontWeight: 'bold',
        textAlign: 'center',
    }


})