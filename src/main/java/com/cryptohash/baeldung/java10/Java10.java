package com.cryptohash.baeldung.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java10 {

    //    public var e = "heello";
    public static void main(String[] args) {
        /**
         * Local Variable Inference only for methods
         */
        var str = "New way to initialize the java";
        System.out.println(str);
        /**
         * can't change the data type after intialize
         */
//        str=10;

        /**
         * array directly we cannot put var arr = {1,2,3}; directly
         */

        var arr = new int[]{1, 2, 3};
        System.out.println(arr[0] + "  " + arr[1] + "  " + arr[2]);

        List<Integer> list = List.of(1, 3);
//        list.add(12);
        System.out.println(list);

        List<Integer> collect = list.stream().collect(Collectors.toUnmodifiableList());
//        collect.add(3);
        System.out.println(collect);

        Optional<Integer> first = list.stream().filter(i -> i % 2 == 0).findFirst();
        Integer integer = first.orElseThrow();
        System.out.println(first);
        System.out.println(integer);


    }

/*    public var method(int s) {
        var r=5;
            return r;
    }*/
}
