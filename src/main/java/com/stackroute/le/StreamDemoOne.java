package com.stackroute.le;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoOne {
        public static void main(String args[]) {
            List<String> places=new ArrayList<>();
            places.add("Nepal, Kathmandu");
            places.add("Nepal, Pokhara");
            places.add("India, Delhi");
            places.add("USA, New York");
            places.add("Africa, Nigeria");

            Stream<String> stream ;
            stream= places.stream();
            stream.filter(place -> place.startsWith("Nepal, ") ).forEach(System.out::println);
            System.out.println();

        }

    }

