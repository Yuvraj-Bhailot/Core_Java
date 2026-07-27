# Non-Static Members

## What is a Non-Static Member?

A class member that is not declared with the `static` keyword is called a **non-static member**.

Non-static members belong to an **object** or **instance** of a class. Therefore, they are also called **instance members**.

## Types of Non-Static Members

1. Non-Static Variables
2. Non-Static Methods
3. Non-Static Initializers
4. Constructors

## Non-Static Variable

A variable declared inside a class without the `static` keyword is called a non-static variable.

### Characteristics

- Non-static variables belong to objects.
- Each object gets its own copy of non-static variables.
- They receive default values during object creation.
- They are accessed using an object reference.
- An object must be created to access them from a static context.

## Non-Static Method

A method declared inside a class without the `static` keyword is called a non-static method.

### Characteristics

- Non-static methods belong to objects.
- They are accessed using an object reference.
- An object must be created to access a non-static method from a static context.
- They cannot be accessed directly by name from a static context.

## Non-Static Initializer

Non-static initializers are used to perform initialization instructions for objects.

They execute during the object creation process and run once for every object created.

Types:

1. Single-Line Non-Static Initializer (SLNSI)
2. Multi-Line Non-Static Initializer (MLNSI)

### Single-Line Non-Static Initializer

Syntax:

```text
datatype variableName = value;
```

### Multi-Line Non-Static Initializer

Syntax:

```text
{
    // statements
}
```

## Non-Static Context

A non-static context is a block that belongs to a non-static method or a multi-line non-static initializer.

### Important Points

- Static members can be accessed directly by name.
- Non-static members can also be accessed directly by name.
- A non-static context can access both static and non-static members of the class.
