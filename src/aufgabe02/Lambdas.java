package aufgabe02;

import java.util.*;

public class Lambdas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList
                ("Hello", "Curve ball", "No", "Swoosh", "Please apply pressure",
                "Bananarama", "Keks", "Fthaghn", "On a scale of 1-10 - how bad is it?", "Party hard!")
        );

        // Original list
        System.out.println("# Original list #");
        System.out.println(list);

        // Sort by string length
        System.out.println();
        System.out.println("# Sorted by length #");
        list.sort((String s1, String s2) -> s1.length() - s2.length());
        System.out.println(list);


        // Sort by first character, ignoring casing
        System.out.println();
        System.out.println("# Sorted by first character #");
        list.sort((String s1, String s2) -> s2.toLowerCase().charAt(0) - s1.toLowerCase().charAt(0));
        System.out.println(list);


        // Mirror all strings in the list and print each element individually
        System.out.println();
        System.out.println("# Reversed all strings #");
        list.forEach((String s) -> {System.out.println(new StringBuilder(s).reverse().toString());});

    }
}
