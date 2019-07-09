package com.stackroute.le;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {
    List<Employee> result = new ArrayList<>();
    Employee employee1 = new Employee(23, "gowtham", "bessi");
    Employee employee2 = new Employee(22, "swetha", "priya");
    Employee employee3 = new Employee(20, "prabha", "cherry");

    public static void main(String args[]) {

        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.sortinput();
    }

    public void sortinput(){
        result.add(employee1);
        result.add(employee2);
        result.add(employee3);
        //sorting the name by using comparator interface
        Collections.sort(result,(e1, e2) -> {return e1.getLastname().compareTo(e2.getLastname());});
        System.out.println("Name\tLast name\tAge");
        for (Employee li: result)
        {
            System.out.println(li.getName() + "\t" + li.getLastname() + "\t\t" + li.getAge());
        }

        System.out.println("\nEmployee whose last name starts with C");
        result.stream().filter(list -> list.getLastname().startsWith("c") || list.getLastname().startsWith("C")).forEach(this::process);

    }
    private void process(Employee employee) {
        System.out.println(employee.getName()+"\t"+employee.getLastname()+"\t\t"+employee.getAge());

    }
}


