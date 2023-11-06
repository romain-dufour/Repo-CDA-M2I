import { useState } from "react";
import { Button, FlatList, Text, Modal, View, StyleSheet } from "react-native";
import ModalAddItem from "./ModalAddItem";


export default function PageAccueil() {
    const [modalVisible, setModalVisible] = useState(false)
    const [tab, setTab] = useState([])

    function closeModal() {
        setModalVisible(false)
    }
    function OpenModal() {
        setModalVisible(true)
    }
    function addArticle() {
        setTab(...tab[setTextInput])
        tab.push(props.setTextInput())
        setModalVisible(false)
    }



    // const tab = [
    //     { text: "toto", id: 1 },
    //     { text: "tata", id: 2 },
    //     { text: "tutu", id: 3 },

    // ]

    return (
        <View style={styles.container}>
            <Button title="Ajouter un article" onPress={OpenModal} style={styles.button} />
            <ModalAddItem visible={modalVisible} closeModal={closeModal}></ModalAddItem>
            <View style={styles.articleList}>
                <FlatList data={addArticle.tab} renderItem={(itemData) => {
                    return (
                        <View>
                            <Text style={styles.article}>{itemData.item.text} {itemData.item.id}</Text>
                        </View>
                    )
                }} keyExtractor={(item, index) => {
                    return index
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
        padding:10
    },
    article:{
    backgroundColor: "#9b59b6",
    marginTop:15,
    borderRadius:10,
    height:40,
    textAlignVertical:'center',
    padding:10,
    fontSize:15,
    fontWeight:'bold'
}

    
})