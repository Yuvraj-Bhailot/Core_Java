# Java Runtime Memory

## Overview

When a Java program is executed, the **JRE** requests memory from the system for program execution.

The main runtime memory areas covered here are:

1. Method Area
2. Static Area / Class Static Area
3. Stack Area
4. Heap Area

## Method Area

The Method Area stores information related to the methods of loaded classes.

It contains method blocks along with information such as their addresses or references.

## Static Area / Class Static Area

The Static Area, also called the **Class Static Area (CSA)**, stores static members of loaded classes.

Static members include:

- Static variables
- Static methods
- Static initializers

Static variables receive their default values when the class is loaded.

## Stack Area

The Stack Area is used during the execution of methods and blocks.

- A stack frame is created for a method or block that is being executed.
- The frame contains information required for that execution.
- Once execution is completed, the stack frame is removed automatically.

## Heap Area

The Heap Area is used to store objects created during runtime.

- Memory is allocated for objects in the heap.
- Each object has a reference or address.
- Non-static members are associated with objects.
- Each object has its own copy of non-static variables.

## Static vs Non-Static Memory

| Member Type | Associated With | Runtime Memory |
|---|---|---|
| Static Members | Class | Static Area / Class Static Area |
| Non-Static Members | Object | Heap Area |

## Simplified Java Runtime Memory Structure

```text
Java Runtime Memory
│
├── Method Area
├── Static Area / Class Static Area
├── Stack Area
└── Heap Area
```

## Key Points

- **Method Area** stores information related to class methods.
- **Static Area** stores static members of classes.
- **Stack Area** manages method and block execution.
- **Heap Area** stores objects and their non-static members.
