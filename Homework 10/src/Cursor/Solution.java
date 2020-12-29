package Cursor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write down one of the numbers: ");
        int numb = scan.nextInt();


        switch (numb) {
            case 0, 1, 2, 3, 4 -> System.out.println("Very Bad");
            case 5 -> System.out.println("Bad");
            case 6 -> System.out.println("Acceptable");
            case 7, 8 -> System.out.println("Good");
            case 9, 10 -> System.out.println("Well");
            default -> System.out.println("You get out from range ");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write down one of the numbers: ");
        String setOfValues = scan.nextLine();
        String[] massive = setOfValues.split(",");

        List<Integer> numbs = new ArrayList<>();
        for (String numbers : massive) {
            numbs.add(Integer.parseInt(numbers));
        }

        var end = numbs.stream().collect(Collectors.teeing(Collectors.counting(),(Collectors.toSet()), (values, set) -> (set.size() * 100 / values + " %")));
        System.out.println(end);

        }
    }



