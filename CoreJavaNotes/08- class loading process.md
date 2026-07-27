# Class Loading Process

## Overview

The **Class Loading Process** is the process through which a Java class is loaded and prepared for execution.

## Steps in Class Loading

1. A dedicated memory area is created for the class in the **Class Static Area (CSA)**. This area is associated with the class name.
2. The methods and class-related information are loaded into the **Method Area** with their respective addresses.
3. Static members such as static methods and static initializers are associated with the **Class Static Area**.
4. Static variables are loaded into the Class Static Area and are assigned their default values.
5. Static initializers are executed automatically from **top to bottom**.
6. After the class loading process is completed, the JVM invokes the `main()` method for program execution.

## Class Loading Flow

```text
Class Loading
      ↓
Class Static Area Created
      ↓
Class and Method Information Loaded
      ↓
Static Members Loaded
      ↓
Static Variables Get Default Values
      ↓
Static Initializers Execute
      ↓
JVM Invokes main()
```

## Key Point

The class loading process happens before the execution of the `main()` method.
