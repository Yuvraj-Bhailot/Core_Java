# Static Members

## What is `static`?

`static` is a Java keyword and modifier.

When a class member is declared using the `static` keyword, it becomes a **static member** of the class.

Static members belong to the **class** rather than individual objects. Therefore, they are also called **class members**.

## Types of Static Members

1. Static Variables
2. Static Methods
3. Static Initializers

## Static Variable

A variable declared with the `static` keyword is called a static variable.

### Characteristics

- Static variables belong to the class.
- They are associated with the class rather than individual objects.
- They receive default values automatically.
- They can be accessed using the class name.
- Within the same class, they can be accessed directly by name.

## Static Method

A method declared with the `static` keyword is called a static method.

### Characteristics

- Static methods belong to the class.
- They can be accessed using the class name.
- Within the same class, they can be accessed directly by name.
- They can be accessed without creating an object.

## Static Initializer

A static initializer is declared using the `static` keyword and is used to perform startup instructions during class loading.

Types:

1. Single-Line Static Initializer (SLSI)
2. Multi-Line Static Initializer (MLSI)

### Single-Line Static Initializer

Syntax:

```text
static datatype variableName = value;
```

### Multi-Line Static Initializer

Syntax:

```text
static
{
    // statements
}
```

### Characteristics

- Static initializers execute automatically during class loading.
- A class can have multiple static initializers.
- They execute from top to bottom.
- They execute before the `main()` method.

## Static Context

A static context is a block that belongs to a static method or a multi-line static initializer.

### Important Points

- Static members of the same class can be accessed directly by name.
- Non-static members cannot be accessed directly by name in a static context.
- Non-static members can be accessed from a static context using an object reference.
- The `this` keyword cannot be used directly in a static context.
