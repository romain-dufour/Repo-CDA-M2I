package org.example;

import org.example.array.Array;
import org.example.array.ArrayMatrix;
import org.example.function.demoFunction;
import org.example.operator.operator;
import org.example.poo.Product;
import org.example.poo.statics.User;
import org.example.readFromConsole.ReadFromConsole;
import org.example.string.ChaineCharactere;
import org.example.structure.Structure;
import org.example.structure.Structure2;
import org.example.variable.Variable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Variable.getVariable();
//        operator.getOperator();
//        operator.getExpression();
//        operator.getOperatorAndComparaison();
       // Structure.getSwitch();
//        ReadFromConsole.getReadWrite();
//        Structure2.getBoucleFor();
//        Structure2.getWhile();
//        Structure2.getBreakAndContinue();
 //       Array.getArray();
  //      ChaineCharactere.getMethodeString();
   //     ChaineCharactere.getComparaisonString();
 //       ChaineCharactere.getFormatString();
      //  ArrayMatrix.getMatrix();
        //ArrayMatrix.getMatrix2();
       // demoFunction.getFunction();

        Product p = new Product();
        p.setId(10);
        p.setName("Iphone");
        System.out.println(p);
        Product p2 = new Product(10,"Table");
        System.out.println(p2);
        System.out.println(p2.getName());
        p2.setId(15);
        System.out.println(p2);
        p2.quiSuisJe();
        Product.getBonjour();


    }
}