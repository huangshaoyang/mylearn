package com.hsy.learn;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hsy on 2018/12/9 4:17 PM
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("hello");
        String[] atp = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer","Roger Federer",
                "Andy Murray","Tomas Berdych",
                "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        players.forEach((player) -> System.out.print(player + "; "));
        players.forEach(System.out::println);
    }


}
