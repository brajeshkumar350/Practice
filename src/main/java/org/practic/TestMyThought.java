package org.practic;

import java.util.*;
import java.util.stream.Collectors;

public class TestMyThought {
    public static void main(String[] args) {
        Student studentOne = new Student("Balaji", "Kumar", 28, "14-06-1992", 85, "Shinoj", Arrays.asList("FootBall", "Drawing"));
        Student studentTwo = new Student("Arun", "Patel", 26, "14-08-1994", 100, "Kumar", Arrays.asList("Cooking", "Judo"));
        Student studentThree = new Student("Somu", "Teja", 28, "14-05-1988", 62, "Aruna", Arrays.asList("FootBall"));
        Student studentFour = new Student("Karthick", "Bobby", 30, "14-06-1990", 85, "Vinoth", Arrays.asList("Softball", "VolleyBall"));
        Student studentFive = new Student("Castro", "Paul", 16, "14-05-1988", 100, "Shinoj", Arrays.asList("Singing", "Softball"));
        Student studentSix = new Student("Vimal", "Peeter", 9, "14-10-2011", 56, "Teja", Arrays.asList("FootBall", "Drawing"));
        Student studentSeven = new Student("Deepak", "Kumar", 21, "14-06-1999", 23, "Aarthy", Arrays.asList("Cooking"));
        Student studentEight = new Student("Kannan", "Sharma", 28, "14-08-1992", 12, "Mokana", Arrays.asList("Softball", "VolleyBall"));
        Student studentNine = new Student("Roja", "Kumar", 42, "14-05-1988", 92, "Anbu", null);
        Student studentTen = new Student("Ajit", "Kumar", 22, "14-06-1998", 98, "Vinoth", Arrays.asList("FootBall", "VolleyBall"));

        List<Student> studentList = Arrays.asList(studentOne, studentTwo, studentThree, studentFour, studentFive, studentSix, studentSeven, studentEight, studentNine, studentTen);
        List<Student> sortedList = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getAge).thenComparing(Comparator.comparing(Student::getFirstName)))
                .collect(Collectors.toList());

        sortedList.stream().map(student -> student.getFirstName()).forEach(System.out::println);


        System.out.println("---------------------");
        Map<String,String> map=new HashMap<>();
        sortedList.forEach(stu->{
            if(map.containsKey(stu.getSupervisorName())){
                System.out.println(stu.getSupervisorName());
            }
            map.put(stu.getSupervisorName(), stu.getFirstName());


        });
    }
}
