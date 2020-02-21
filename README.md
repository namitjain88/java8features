# java8-features
Sample project to understand and learn some of java8 key features.

# Optional
Use of Optional helps avoid NullPointerException and unnecessary null checks. It also lets you call methods even though there is no object present.
* Optional.ofNullable(T): Use where null value of an object is expected e.g. Optional<String> stringOptional = Optional.ofNullable("Hello"). Takes any object type as an input and returns Optional.empty() if input is null else Optional<T>. Use Optional<T>.get() to retrieve object.
* Use Optional.of(T) method when a null value of an object is NOT expected
* Use Optional.empty() method when an empty object instead of null needs to be returned
* Optional.orElse(Default T) method to return default value T if input T is null
* Optional.orElseGet(Supplier s) to return default value if null; it takes supplier as an input
* Optional.orElseThrow(Supplier s) to throw a RuntimeException if null; it takes supplier as an input
* Optional.isPresent() returns true if Optional object is not empty/null, false otherwise
* Optional.ifPresent(Consumer c) to perform operations if Optional is not empty.
* Optional.filter(Predicate p) to filter optional object using given predicate and return either Optional of object or Optional.empty
* Optional.map(Function f) to perform operations on Optional<Object> and return it
