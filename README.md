

## What is a Functional Interface?

A Functional Interface in Java is an interface that contains exactly one abstract method. 
These interfaces are the foundation for lambda expressions and method references.

### some Functional Interface Signature:

A custom functional interface can look like this:

@FunctionalInterface
public interface MyFunctionalInterface {
    void myMethod();
}

Predicate<T> is a functional interface used to evaluate a condition on an object of type T. It returns a boolean value.

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

Consumer<T> is a functional interface that accepts an object of type T and performs an action on it. It doesn't return any result

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

Function<T, R> is a functional interface used for transforming an object of type T into another object of type R.

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

if you more clear on this just refer in this repo have own class each
