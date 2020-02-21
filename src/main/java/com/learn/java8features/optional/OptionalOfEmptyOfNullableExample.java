package com.learn.java8features.optional;

import java.util.Optional;

public class OptionalOfEmptyOfNullableExample {

    /* Use ofNullable when a null value of an object is expected */
    public static Optional<String> ofNullable() {
        Optional<String> stringOptional = Optional.ofNullable("Hello"); // Try passing null as an input
        return stringOptional;
    }

    /* Use Optional.of() method when a null value of an object is NOT expected */
    public static Optional<String> of() {
        Optional<String> stringOptional = Optional.of("Hello"); // Try passing null as an input
        return stringOptional;
    }

    /* Use Optional.empty() method when an empty object instead of null needs to be returned */
    public static Optional<String> empty() {
        return Optional.empty();
    }

    public static void main(String[] args) {

        /* Use Optional.ofNullable(T), Optional.isPresent() and Optional.get() to retrieve object. */
        Optional<String> stringOptional = ofNullable();
        if (stringOptional.isPresent()) System.out.println("ofNullable = " + stringOptional.get());

        /* Use Optional.of(T) and Optional.get() to retrieve object. */
        System.out.println("of = " + of().get());

        /* Use Optional.empty(). */
        System.out.println("empty = " + empty());
    }
}
