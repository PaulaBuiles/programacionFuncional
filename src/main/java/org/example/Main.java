package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Punto 1:

        List<Integer> listPunto1 = new ArrayList<>(CollectionUtils.punto1(() -> new Random().nextInt(10), 10));
        List<String>  punto1ConvertirString=new ArrayList<>(CollectionUtils.punto1(()->new Random().toString(),10)); //dado el caso de que quisieramos convertir a string la primer lista este seria el metodo que utilizariamos

        //Punto 2:

        List<Integer> listPunto2 = new ArrayList<>(CollectionUtils.punto2(listPunto1, value -> value * value));

        //Punto 3:

        CollectionUtils.punto3(List.of(1,2,3,4,5,6,7,8,9,10), System.out::println);

        //Punto 4:

        List<Integer> listPunto4 =new ArrayList<>(CollectionUtils.punto4(listPunto2,value->value>10));

        //Punto 5:

        Integer totalSuma = CollectionUtils.punto5(listPunto1,(number1,number2)->number1+number2);
    }
}