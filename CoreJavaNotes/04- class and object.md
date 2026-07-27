# Class and Object

## Class

A class is a blueprint or template used to create objects.

It defines the structure and behaviour of objects.

A class can contain members such as:

- Variables
- Methods
- Initializers
- Constructors

### Syntax

```text
class ClassName
{
    // class members
}
```

## Object

An object is an entity with real-world existence.

In Java, an object is a block of memory created at runtime inside the **heap area**.

An object has:

- **State** — represented by non-static variables
- **Behaviour** — represented by non-static methods

## Relationship Between Class and Object

- A class provides the blueprint for creating objects.
- Objects are instances of a class.
- An object cannot be created without a class.
- Multiple objects can be created from a single class.
- Each object has its own identity and state.

## Object and Non-Static Members

Non-static members belong to objects.

When an object is created:

- Memory is allocated for the object's non-static members.
- Each object gets its own copy of non-static variables.
- Non-static members are accessed using an object reference.

## Class as a Non-Primitive Data Type

Class names are considered non-primitive data types in Java.

They can be used to create non-primitive or reference variables that hold references to objects.
