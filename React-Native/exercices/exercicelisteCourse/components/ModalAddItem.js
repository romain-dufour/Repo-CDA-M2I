import { useState } from "react";
import { Button, Image, Modal, StyleSheet, TextInput, View } from "react-native";


export default function ModalAddItem(props) {
    const [textInput, setTextInput] = useState('');

    function RecupInput(enterText) {
        setTextInput(enterText)
        console.log(enterText);
    }


    return (
        <Modal visible={props.visible} >
            <View style={styles.container}>
                <Image
                    width={200}
                    height={200}
                    source={{
                        uri: 'https://t3.ftcdn.net/jpg/00/21/44/52/360_F_21445202_f3a1iPfB4W84ONMXn0ARZi38fqWNKF9q.jpg'
                    }} />
                <TextInput onChangeText={RecupInput} value={textInput} style={styles.inputText} />
                <View style={styles.buttonContainer} >
                    <View style={styles.buttonStyle}>
                        <Button title="AJOUTER ARTICLE" onPress={() => props.addArticle(textInput)} style={styles.buttonAdd} />
                    </View>
                    <View style={styles.buttonStyle}>
                        <Button title="CANCEL" color="red" onPress={props.closeModal} />
                    </View>
                </View>
            </View>
        </Modal>
    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: "center"
    },
    inputText: {
        height: 40,
        width: 200,
        borderRadius: 10,
        margin: 5,
        borderWidth: 1,
        padding: 10,
    },
        
    buttonContainer: {
        flexDirection: 'row',
        height: 40,
  
    },
    buttonStyle: {
        justifyContent: 'space-around',
        height: 40,
        margin: 15,
        
    },
    buttonAdd: {

    },
})