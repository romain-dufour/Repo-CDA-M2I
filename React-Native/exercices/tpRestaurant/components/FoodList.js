import { StyleSheet, Text, View, Pressable } from 'react-native'
import React from 'react'

export default function FoodList(props, { navigation }) {

    ;
    return (
        <Pressable onPress={() => navigation.navigate("MealsOverView")} style={styles.container}>
            <View style={styles.container}>
                <Text>{props.item.title}</Text>
            </View>
        </Pressable>
    )
}

const styles = StyleSheet.create({
    container: {
        width: 100,
        height: 100,
        margin: 10,
        justifyContent: "space-around",

    },

})