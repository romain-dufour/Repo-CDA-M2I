package org.example.function;

public class demoFunction {

    public static void getFunction() {

        int result = sum(1,2,3);
        System.out.println(result);
        result = sum(5,8);
        System.out.println(result);
    }


    public static Integer sum(int i1, int i2){

        return  i2+i1;
    }

    public static Integer sum(int i1, int i2,int i3){

        return  i1+i2+i3;
    }
}
