package com.learn.java8features.optional;

import com.learn.java8features.data.Student;

import java.util.Optional;

public class OptionalExample {

    /* Get student name the legacy way */
    public static String getStudentName() {
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    /* Get student name using Optional */
    public static Optional<String> getStudentNameOptional() {
        //Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null); // Returns Optional.empty()
        if (studentOptional.isPresent()) {
            studentOptional.get(); // Returns Student object
            return studentOptional.map(Student::getName); //Optional<String>
        }
        return Optional.empty(); // Represents an optional object with no value
    }

    public static void main(String[] args) {
        /* Print student name's length */
        /*String name = getStudentName();
        if(name!=null)
            System.out.println("Length of the student Name : " + name.length());
        else
            System.out.println("Name not found");*/

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) { // Checking if String object exists
            System.out.println("Length of the student Name : " +
                    stringOptional.get().length()); //String which is Student Name
        } else {
            System.out.println("Name not found");
        }
    }
}
