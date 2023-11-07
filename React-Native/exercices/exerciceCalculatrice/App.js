import { SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import ButtonCalc from './components/ButtonCalc'

export default function App() {
  const [calcul, setCalcul] = useState([''])
  const [valeur,setValeur]=useState()
//récupérer au clique la valeur de chaque bouton et insérer dans le textInput

 function calculate(enteredCalcul) {
    if (enteredCalcul== '='){

    } else if (enteredCalcul == 'Del'){   
        let calcultemp=calcul
        
        setCalcul(calcultemp.pop())
        console.log(calcul);
    } else if (enteredCalcul == 'AC'){
        setCalcul('')
    }
    else {
        setCalcul(currentValue => currentValue + enteredCalcul)
    }


}




    return (
        <SafeAreaView style={styles.container}>
            <View >
                <Text style={styles.calculator}>Calculator</Text>
            </View>
            <View style={styles.textInput}>
                <TextInput style={styles.texte} value={calcul}  ></TextInput>
            </View>
            <View style={styles.touches}>
                <View >
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "AC", id: 12 }} calculate={() => calculate("AC")} ></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "7", id: 7 }} isNumber calculate={() => calculate("7")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "4", id: 4 }} isNumber calculate={() => calculate("4")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "1", id: 1 }} isNumber calculate={() => calculate("1")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: ".", id: 10 }} isNumber calculate={() => calculate(".")}></ButtonCalc>
                    </View>
                </View>
                <View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "^", id: 13 }} calculate={() => calculate("^")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "8", id: 8 }} isNumber calculate={() => calculate("8")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "5", id: 5 }} isNumber calculate={() => calculate("5")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "2", id: 2 }} isNumber calculate={() => calculate("2")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "0", id: 0 }} isNumber calculate={() => calculate("0")}></ButtonCalc>
                    </View>
                </View>
                <View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "%", id: 14 }} calculate={() => calculate("%")} ></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "9", id: 9 }} isNumber calculate={() => calculate("9")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "6", id: 6 }} isNumber calculate={() => calculate("6")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "3", id: 3 }} isNumber calculate={() => calculate("3")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "Del", id: 11 }} isNumber calculate={() => calculate("Del")}></ButtonCalc>
                    </View>
                </View>
                <View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "/", id: 15 }} calculate={() => calculate("/")} ></ButtonCalc>
                    </View >
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "X", id: 16 }} calculate={() => calculate("x")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "-", id: 17 }} calculate={() => calculate("-")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "+", id: 18 }} calculate={() => calculate("+")}></ButtonCalc>
                    </View>
                    <View style={styles.vertical}>
                        <ButtonCalc item={{ text: "=", id: 19 }} calculate={() => calculate("=")}></ButtonCalc>
                    </View>
                </View>
            </View>

        </SafeAreaView>

    )
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "black",
    },
    touches: {
        height: 500,
        flexDirection: "row",
        alignItems: 'center',
        justifyContent: 'space-around',


    },
    calculator: {
        color: "white",
        fontSize: 20,
        fontWeight: "bold",
    },
    textInput: {
        height: 200,
        alignItems: 'flex-end',
        justifyContent: 'flex-end',
        backgroundColor:"#3498db"

    },
    texte: {
        color: "black",
        fontSize: 40,

    },
    vertical: {
        marginBottom: 30,
    }


})