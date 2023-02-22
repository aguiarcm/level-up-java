package org.example.advanced;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    static List noSafeMethod(Object[] objArray, List list) {
        for (Object object: objArray) {
            list.add(object);
        }
        return list;
    }

    static <T> List genericMethod(T [] objArray, List<T> list) {
        for (T object: objArray) {
            list.add(object);
        }
        return list;
    }

    static void print(List l) {
        l.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] arr =  {1, 2};

        List<Double> strings =  noSafeMethod(arr, new ArrayList());
        print(strings);

        List<Double> dList = genericMethod(arr, new ArrayList<>());
        print(dList);

       // List<String> stringList = genericMethod(arr, new ArrayList<String>());
        //print(stringList);



    }
}
