package com.learn.java8features.optional;

import com.learn.java8features.data.Student;
import com.learn.java8features.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    /* Optional.orElse to return default value if null */
    public static String optionalOrElse() {
        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        /* Simulating case where optionStudent is Optional.empty() */
        //Optional<Student> optionalStudent = Optional.ofNullable(null);

        return optionalStudent.map(Student::getName).orElse("default");
    }

    /* Optional.orElseGet to return default value if null; it takes supplier as an input */
    public static String optionalOrElseGet() {
        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        /* Simulating case where optionStudent is Optional.empty() */
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        return optionalStudent.map(Student::getName).orElseGet(() -> "Default");
    }

    /* Optional.orElseThrow to throw a RuntimeException if null; it takes supplier as an input */
    public static String optionalOrElseGetThrow() {
        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        /* Simulating case where optionStudent is Optional.empty() */
        Optional<Student> optionalStudent = Optional.ofNullable(null);

        return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("Data not found."));
    }

    public static void main(String[] args) {
        System.out.println("orElse: " + optionalOrElse());
        System.out.println("orElseGet: " + optionalOrElseGet());
        System.out.println("orElseThrow: " + optionalOrElseGetThrow());
    }
}
