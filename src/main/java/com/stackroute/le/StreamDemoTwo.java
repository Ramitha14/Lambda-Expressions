package com.stackroute.le;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemoTwo {
    public static void main(String args[]) {
        StreamDemoTwo streamDemoTwo = new StreamDemoTwo();
        streamDemoTwo.member();
        streamDemoTwo.numberoperation();
    }
    public void member()
    {
        List<String> memberNames=new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("ahana");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        Stream<String> stream ;
        stream= memberNames.stream();
        stream.filter(memberName -> memberName.startsWith("A") ).forEach(System.out::println); ;
        System.out.println();

        stream= memberNames.stream();
        stream.map( memberName -> memberName.toUpperCase() ).forEach(System.out::println);
        System.out.println();

        stream= memberNames.stream();
        stream.filter(memberName -> memberName.endsWith("A") ).map( memberName -> memberName.toUpperCase() ).forEach(System.out::println);
        System.out.println();

        stream= memberNames.stream();
        stream.filter(memberName -> memberName.endsWith("h") ).forEach(System.out::println);
        System.out.println();

        stream= memberNames.stream();
        stream.filter(memberName -> memberName.startsWith("S") ).forEach(System.out::println);
        System.out.println();
    }
    public void numberoperation()
    {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(4);
        Stream<Integer> stream ;
        stream= numbers.stream();
        stream.filter(number->number%2==0).forEach(System.out::println); ;
        System.out.println();


    }

}
