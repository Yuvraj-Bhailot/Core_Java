# Java Tokens, Variables and Data Types

## Tokens

Tokens are the smallest individual units of a programming language used to form instructions.

In Java, important types of tokens include:

1. Keywords
2. Identifiers
3. Literals

## Keywords

Keywords are predefined words in Java that have a specific meaning and purpose.

* Java compiler understands keywords.
* Keywords cannot be used as identifiers.
* Java keywords are written in lowercase.
* Examples: `class`, `public`, `static`, `void`

## Identifiers

An identifier is the name given to a component of a Java program.

Identifiers can be used for:

* Classes
* Methods
* Variables
* Interfaces
* Packages

## Rules for Identifiers

1. An identifier must not start with a number.
2. Special characters are not allowed, except `$` and `_`.
3. Spaces are not allowed.
4. Keywords cannot be used as identifiers.
5. Operators cannot be used as identifiers.

If these rules are not followed, the compiler reports an error.

## Identifier Naming Conventions

Naming conventions are standard practices followed by programmers when naming program components.

### Class and Interface Names

For a single word:

* Start with an uppercase letter.
* Remaining letters are lowercase.

Example:

```text
Demo
Square
```

For multiple words:

* Start each word with an uppercase letter.

Example:

```text
SquareRoot
PowerOfDigit
```

### Variable, Method and Package Names

For a single word:

* Use lowercase letters.

Example:

```text
demo
square
```

For multiple words:

* Start with a lowercase letter.
* Start each following word with an uppercase letter.

Example:

```text
squareRoot
powerOfDigit
sumOfTwoNumber
```

Naming conventions are not enforced by the compiler, but following them improves code readability and maintains coding standards.

## Literals

A literal is a fixed data value used in a Java program.

Literals are broadly classified into:

1. Primitive Literals
2. Non-Primitive Literals

## Primitive Literals

Primitive literals represent single values.

They include:

### Number

Numbers are mainly classified as:

* Integer numbers
* Decimal numbers

Examples:

```text
20
-1
3.14
-3.21
```

### Character

A character is a single value enclosed within single quotes.

Examples:

```text
'a'
'A'
'7'
'$'
```

### Boolean

Boolean values represent one of two possible states:

* `true`
* `false`

## Non-Primitive Literals

Non-primitive literals represent data that can contain multiple values or more complex data.

Examples include:

* String
* Object

### String

A String is a sequence of characters enclosed within double quotes.

Examples:

```text
"Hello"
"Java"
"123"
```

# Variables

A variable is a named memory location used to store a value or data.

### Definition

A variable can be considered a named block of memory used to store data.

## Advantages of Variables

* Data can be stored and accessed using a name.
* Data can be modified or reassigned easily.

## Characteristics of Variables

* A variable has a name.
* A variable stores a value.
* A variable can store one value at a time.
* Data stored in a variable may have a limited lifespan.
* The visibility of a variable depends on its scope.

## Creating a Variable

### Syntax

```text
Datatype Identifier;
```

Multiple variables can be declared in one statement.

### Syntax

```text
Datatype Identifier1, Identifier2, Identifier3;
```

# Data Types

A data type defines the type of data that a variable can store.

Data types are classified into:

1. Primitive Data Types
2. Non-Primitive Data Types

## Primitive Data Types

Primitive data types are used to store single values.

Java has eight primitive data types:

| Data Type |          Size |
| --------- | ------------: |
| `byte`    |        1 byte |
| `short`   |       2 bytes |
| `int`     |       4 bytes |
| `long`    |       8 bytes |
| `float`   |       4 bytes |
| `double`  |       8 bytes |
| `char`    |       2 bytes |
| `boolean` | JVM-dependent |

All primitive data types are Java keywords.

### Numeric Data Type Capacity

The general order of numeric data types is:

```text
byte < short < int < long < float < double
```

## Non-Primitive Data Types

Non-primitive data types are used to store references to objects.

Examples include:

* String
* Classes
* Arrays
* Interfaces

All class types in Java are considered non-primitive data types.

## Primitive Variable

A primitive variable stores a primitive value such as a number, character, or boolean value.

### Syntax

```text
Datatype VariableName = value;
```

## Non-Primitive Variable

A non-primitive variable stores a reference to an object.

### Syntax

```text
Datatype VariableName = value;
```

## Default Values

Default values are assigned to instance and static variables when no explicit value is provided.

| Data Type       | Default Value |
| --------------- | ------------- |
| `byte`          | `0`           |
| `short`         | `0`           |
| `int`           | `0`           |
| `long`          | `0L`          |
| `float`         | `0.0F`        |
| `double`        | `0.0D`        |
| `char`          | `\u0000`      |
| `boolean`       | `false`       |
| Reference types | `null`        |

> **Note:** Local variables do not receive default values automatically. They must be assigned a value before use.

# Scope of a Variable

The scope of a variable refers to the part of a program where the variable is visible and can be accessed.

Variables are commonly classified based on their scope and lifetime as:

1. Local Variables
2. Static Variables
3. Non-Static Variables

## Local Variable

A variable declared inside a method, constructor, or block is called a local variable.

### Rules of Local Variables

1. A local variable must be assigned a value before it is used.
2. Local variables do not receive default values automatically.
3. A local variable can be accessed only within the method or block where it is declared.
4. A local variable cannot be accessed outside its scope.
5. Two local variables with the same name cannot be declared within the same scope.

### Syntax

```text
Datatype VariableName = value;
```
