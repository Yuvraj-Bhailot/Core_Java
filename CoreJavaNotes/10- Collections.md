# Java Collection Framework

## 1. Collection Framework

The **Java Collection Framework** is a group of **interfaces and classes** that provide a standard mechanism for storing and managing a group of objects.

Using collections, we can perform operations such as:

* Add/create elements
* Store elements
* Remove/delete elements
* Search elements
* Update elements
* Access elements

---

## 2. Collection Hierarchy

```text
Iterable<I>
    │
    └── Collection<I>
          │
          ├── List<I>
          │     ├── ArrayList<C>
          │     └── LinkedList<C>
          │
          ├── Set<I>
          │     ├── HashSet<C>
          │     └── TreeSet<C>
          │
          └── Queue<I>
                └── PriorityQueue<C>
```

> `I` = Interface
> `C` = Class

---

## 3. Collection Interface

* `Collection` is an **interface** present in the `java.util` package.
* It provides a standard mechanism to store and manage a group of objects.
* Elements stored in a collection are treated as **objects**.
* It provides methods for common operations such as:

  * Adding elements
  * Removing elements
  * Searching elements
  * Accessing elements

---

# 4. List Interface

`List` is an interface present in the `java.util` package.

### Characteristics of List

* List is an **ordered collection**.
* It follows the **insertion order**.
* Elements can be accessed using an **index**.
* Elements can be added, removed, or accessed using their index.
* **Duplicate elements are allowed.**
* **Multiple `null` values are allowed.**

---

# 5. Set Interface

`Set` is an interface present in the `java.util` package.

* It inherits the methods provided by the `Collection` interface.
* Set represents a collection of **unique elements**.

### Characteristics of Set

* Duplicate elements are **not allowed**.
* A traditional `Set` does not provide index-based access.
* Elements cannot be accessed using an index like a `List`.
* Elements can be traversed using:

  * `Iterator`
  * Enhanced `for` loop
* The `get()` method is not available because Set does not support index-based access.
* `HashSet` does not maintain insertion order.
* `TreeSet` maintains elements in sorted order.
* A `HashSet` can contain one `null` value.
* `TreeSet` generally does not permit `null` with natural ordering.

---

# 6. Queue Interface

`Queue` is an interface present in the `java.util` package.

* `Queue` extends the `Collection` interface.
* It is used to hold elements before they are processed.
* It inherits methods from the `Collection` interface.
* It also provides queue-specific operations.
* `PriorityQueue` is a common implementation of the `Queue` interface.

---

## Quick Comparison

| Feature                | List                      | Set                       | Queue                     |
| ---------------------- | ------------------------- | ------------------------- | ------------------------- |
| Order                  | Insertion order           | Depends on implementation | Depends on implementation |
| Duplicate elements     | Allowed                   | Not allowed               | Generally allowed         |
| Index-based access     | Yes                       | No                        | No                        |
| `get()` method         | Available                 | Not available             | Not available             |
| Common implementations | `ArrayList`, `LinkedList` | `HashSet`, `TreeSet`      | `PriorityQueue`           |
| Package                | `java.util`               | `java.util`               | `java.util`               |

---

## Key Takeaways

* **Collection Framework** → Provides interfaces and classes for storing and manipulating groups of objects.
* **List** → Ordered, index-based, duplicates allowed.
* **Set** → Unique elements, no index-based access.
* **Queue** → Used to hold elements for processing.
* **ArrayList / LinkedList** → Implement `List`.
* **HashSet / TreeSet** → Implement `Set`.
* **PriorityQueue** → Implements `Queue`.
