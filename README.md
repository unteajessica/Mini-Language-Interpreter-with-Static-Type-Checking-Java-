# Mini Language Interpreter with Static Type Checking (Java)

A Java-based implementation of a small **statically typed** programming language, built to explore how
**type systems** and **interpreters** work. The project focuses on catching invalid programs
*before execution* via a dedicated **type checking phase**, followed by runtime interpretation.
The GUI improves accessibility by visualizing the program’s runtime state (e.g., symbol table / heap), 
making the interpreter easier to understand and debug.

---

## Highlights
- ✅ **Static type checker** that validates programs before execution
- ✅ Interpreter runtime that evaluates statements/expressions and manages program state
- ✅ Clear separation between **type checking** and **execution**
- ✅ Execution/debug logs and sample input for validation
- ✅ GUI that visualizes runtime memory/state (symbol table / heap)

---

## Core Concepts Implemented

### Type System
The language uses an explicit static type system, including:
- `IntType` – integer values
- `BoolType` – boolean values
- `StringType` – string values
- `RefType` – reference types for heap-allocated values

All expressions and statements are validated against these types during the **type checking phase**, preventing invalid programs from executing.

### Abstract Data Types (ADT)
Custom data structures were implemented to model the language runtime:
- `MyDictionary<K, V>` – used for symbol tables and type environments
- `MyHeap<V>` – simulates heap-like memory for reference values
- `MyStack<T>` – execution stack for program statements
- `MyList<T>` – output collection
- `MyFileTable` – manages file-related runtime state

Each ADT has a clear interface/implementation separation to improve modularity and testability.

### Program Structure
- **Expressions** – arithmetic, logical, relational, and heap-related expressions
- **Statements** – variable declarations, assignments, control flow, heap operations, and file operations
- **Values** – runtime representations corresponding to the static types

The interpreter enforces a strict separation between **type checking** and **execution**, mirroring real-world language processing pipelines.

---

## What I learned by building this
- How static type checking prevents runtime errors (type safety)
- Designing a **type environment** (symbol/type tables) and validating expressions/statements
- How an interpreter manages **state** (variables, heap-like memory, execution flow)
- Building a maintainable OOP architecture for language components (statements, expressions, types)
- Debugging complex evaluation logic using logs and repeatable test inputs

---

## Repository structure
- `src/` – main Java source code
- `test.in` – sample input used for testing
- `log*.txt` – execution/debug logs from different runs
- `src_zip.zip` – archived source snapshot

---

## How to run (IntelliJ IDEA)
1. Clone the repository:
   ```bash
   git clone https://github.com/unteajessica/MAP_Assignments.git
