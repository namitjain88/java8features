package com.learn.java8features.optional;

import com.learn.java8features.data.Bike;
import com.learn.java8features.data.Student;
import com.learn.java8features.data.StudentDataBase;

import java.util.Optional;

public class OptionalFilterMapFlatMapExample {

    /* Optional.filter(Predicate p) to filter Optional object and return it else Optional.empty is returned */
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(student -> student.getGpa() >= 3.6)
                .ifPresent(student -> System.out.println(student));
    }

    /* Optional.map(Function f) to perform operations */
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.6)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    /* Optional.flatMap(Function f) to perform operations on Optional<Bike> present in Optional<Student> */
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.6)
                    .flatMap(Student::getBike)
                    .map(Bike::getName);
            System.out.println(stringOptional.get());
        }
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
