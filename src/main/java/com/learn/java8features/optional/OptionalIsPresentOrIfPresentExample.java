package com.learn.java8features.optional;

import java.util.Optional;

public class OptionalIsPresentOrIfPresentExample {

    public static void main(String[] args) {
        Optional<String> optionalString = Optional.ofNullable(null);

        // Optional.isPresent()
        if(optionalString.isPresent()) System.out.println(optionalString.get());

        // Optional.ifPresent(Consumer c)
        optionalString.ifPresent(s -> System.out.println(s));
    }
}
