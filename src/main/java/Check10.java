import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class Check10 {

    public static void main(String[] args) {

        //Immutable List
        var list = List.of(1, 2, 3, 4, 5);
        System.out.println("Advanced For LOOP = ");
        for (var number : list) {
            System.out.println(number);
        }
        System.out.println("BASIC FOR LOOP");
        for (var i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Locale france = Locale.FRANCE;
        Locale nu = Locale.forLanguageTag("nu");
        System.out.println(nu.getCountry());


/*
        list.add(23);
        System.out.println(list);*/


/*        //Immutable list
        List<Integer> list1 = List.copyOf(list);
        list1.add(6);
        System.out.println(list1);*/

        /*Optional<String> str = Optional.ofNullable("");
        System.out.println(str.orElseThrow());

        List<Integer> unModifiedList = list.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(unModifiedList);
        unModifiedList.add(122);*/

        List<Integer> niranjan = new java.util.ArrayList<>(List.of(1, 2, 4));
        niranjan.add(234);
        System.out.println(niranjan);


    }
}
