import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { removeId } from './store/redux/data'

export default function MyID() {

    const myId = useSelector((state) => state.data.ids)
    const dispatch = useDispatch()


    return (
        <View>
            <Text >MyID</Text>
            {myId.map((ids,i) => <Pressable key={i} onPress={() => dispatch(removeId({id : ids}))}>
                <Text style={{fontSize : 30}}>{ids}</Text>
            </Pressable>)}
        </View>
    )
}

const styles = StyleSheet.create({

})