# JDK, JRE, JVM and JIT Compiler

## Overview

Java uses several important components to develop and execute Java applications:

* JDK
* JRE
* JVM
* JIT Compiler

These components work together to compile and run Java programs.

## JDK

JDK stands for **Java Development Kit**.

* JDK is used to develop and execute Java applications.
* It contains development tools required for Java programming.
* JDK includes the Java compiler and JRE.

### Main Purpose

**JDK = Development + Execution**

## JRE

JRE stands for **Java Runtime Environment**.

* JRE provides the environment required to run Java applications.
* It contains the JVM and required runtime libraries.
* JRE is used for execution, not for developing Java source code.

### Main Purpose

**JRE = Execution Environment**

## JVM

JVM stands for **Java Virtual Machine**.

* JVM is responsible for executing Java bytecode.
* It provides the runtime environment for Java programs.
* JVM loads and executes the required Java classes.
* JVM includes components such as the Class Loader and JIT Compiler.

### Main Purpose

**JVM = Executes Bytecode**

## JIT Compiler

JIT stands for **Just-In-Time Compiler**.

* JIT is a component of the JVM.
* It converts frequently executed bytecode into machine-level instructions during program execution.
* This helps improve the performance of Java applications.

### Main Purpose

**JIT Compiler = Converts Bytecode into Machine-Level Instructions at Runtime**

## Relationship Between JDK, JRE and JVM

The relationship can be understood as:

```text
JDK
 └── JRE
      └── JVM
           └── JIT Compiler
```

* **JDK** is used to develop and run Java applications.
* **JRE** provides the environment to run Java applications.
* **JVM** executes Java bytecode.
* **JIT Compiler** helps the JVM improve execution performance.

## Java Execution Flow

The basic flow of a Java program is:

```text
Java Source File (.java)
        ↓
Java Compiler (javac)
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
JIT Compiler
        ↓
Machine-Level Instructions
        ↓
Program Execution
```

## Platform Independence

Java follows the principle of **Write Once, Run Anywhere**.

The Java compiler converts source code into bytecode. The bytecode can be executed on different operating systems using a compatible JVM.

Therefore:

* Java bytecode is platform-independent.
* JVM is platform-dependent because a different JVM implementation is required for different operating systems.

This is the main reason Java applications can run across different platforms.

## Key Difference

| Component    | Main Purpose                                                   |
| ------------ | -------------------------------------------------------------- |
| JDK          | Develop and execute Java applications                          |
| JRE          | Provide the environment to execute Java applications           |
| JVM          | Execute Java bytecode                                          |
| JIT Compiler | Improve execution performance by compiling bytecode at runtime |
