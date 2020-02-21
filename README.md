# java8-features
Sample project to understand and learn some of java8 key features.

# Optional
Use of Optional helps avoid NullPointerException and unnecessary null checks. It also lets you call methods even though there is no object present.
* Optional.ofNullable(T): Use where null value of an object is expected e.g. Optional<String> stringOptional = Optional.ofNullable("Hello"). Takes any object type as an input and returns Optional.empty() if input is null else Optional<T>. Use Optional<T>.get() to retrieve object.
* Use Optional.of(T) method when a null value of an object is NOT expected
* Use Optional.empty() method when an empty object instead of null needs to be returned
