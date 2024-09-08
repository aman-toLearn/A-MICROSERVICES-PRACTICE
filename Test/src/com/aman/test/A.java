package com.aman.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A implements Comparable {

    public static void main(String[] args) throws IOException {

        //File file = new File("E//2024employee_data.txt");

        FileReader fileReader = new FileReader("E:\\2024/employee_data.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        Stream<String> lines = bufferedReader.lines();

        System.out.println(lines);
//collecting the data from the file in a list
        List<String> collect = lines.collect(Collectors.toList());

        System.out.println(collect);




        

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(123, "Alice", "Wonderland", 28, 55000L));

        System.out.println(employees);


    }

//    @Override
//    public int compare(Object o1, Object o2) {
//
//        return 0;
//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
}


