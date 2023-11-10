import { FlatList, Image, StyleSheet, Text, View } from 'react-native'
import React from 'react'

export default function AboutTheMeal() {
    const image = route.params.imageUrl
    const title = route.params.title
    const duration = route.params.duration
    const complexity = route.params.complexity
    const affordability = route.params.affordability
    const ingredients = route.params.ingredients
    const steps = route.params.steps


    return (
        <View>
            <Image
                //   style= {}
                source={image}
            ></Image>
            <Text>{title}</Text>
            <Text>{duration}</Text>
            <Text>{complexity}</Text>
            <Text>{affordability}</Text>
            <Text>Ingredients</Text>
            <FlatList></FlatList>
            <Text>Steps</Text>
            <FlatList></FlatList>
        </View>
    )
}

const styles = StyleSheet.create({})