# Object Loading Process

## Overview

The **Object Loading Process** is the process through which an object is created and initialized in the heap area.

## Steps in Object Loading

1. The `new` keyword creates an object in the **Heap Area**.
2. The constructor is invoked.
3. During constructor execution:
   - Non-static members are loaded into the newly created object.
   - Non-static initializers are executed from **top to bottom**.
   - Programmer-written instructions in the constructor are executed.
4. After the constructor execution is completed, the object initialization process is finished.
5. The `new` keyword returns the reference of the newly created object.
6. The object is now successfully created and can be accessed using its reference.

## Object Loading Flow

```text
new Keyword
      ↓
Object Created in Heap
      ↓
Constructor Invoked
      ↓
Non-Static Members Loaded
      ↓
Non-Static Initializers Execute
      ↓
Constructor Instructions Execute
      ↓
Object Reference Returned
      ↓
Object Created Successfully
```

## Key Point

The object loading process is performed **once for every object created**.

Each time a new object is created, the object loading process is repeated for that object.
