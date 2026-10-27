# OOPs in Java

## 1. What is OOP?

Object-Oriented Programming (OOP) organizes code using classes and objects.

**Advantages:**
- Code reusability
- Easy maintenance and debugging
- Clean, organized code

## 2. Class

A class is a **blueprint** that defines the attributes (variables) and behaviours (methods) of its objects.

## 3. Object

An object is an **instance of a class**.

**Creating an object:**
```java
Student s1 = new Student();
```
- `Student` → Class
- `s1` → Reference variable
- `new Student()` → Creates an object

## 4. Constructor

A constructor initializes an object. It has the same name as the class and no return type.

**Types:**

1. **Default Constructor:** Automatically provided by the compiler if no constructor is declared.
2. **No-Argument Constructor:** Takes no parameters.
   ```java
   MyClass() {}
   ```
3. **Parameterized Constructor:** Takes parameters to initialize an object.
   ```java
   MyClass(int x, int y) {}
   ```
4. **Copy Constructor:** A programmer-defined constructor that initializes an object using another object of the same class.
   ```java
   MyClass(MyClass obj) {}
   ```
   *Note: Java does not provide a built-in copy constructor.*


## 5. Access Modifiers

Access modifiers control the visibility of classes, fields, constructors, and methods.

| Modifier | Same Class | Same Package | Subclass (Different Package) | Other Class (Different Package) |
|---|---|---|---|---|
| `private` | Yes | No | No | No |
| Default | Yes | Yes | No | No |
| `protected` | Yes | Yes | Yes* | No |
| `public` | Yes | Yes | Yes | Yes |

*`protected` access in another package is subject to Java's subclass access rules.*

**Remember:**
- `private` → Same class only
- Default → Same package
- `protected` → Same package + qualifying subclasses in other packages
- `public` → Everywhere the class is accessible

## 6. Four Pillars of OOP

1. **Encapsulation:** Bundling data and methods in a class and controlling access to data.
2. **Inheritance:** Acquiring accessible fields and methods from a parent class.
3. **Polymorphism:** One interface or method name can have different behaviours.
4. **Abstraction:** Hiding implementation details and exposing essential features.

## A. Encapsulation

Encapsulation means **bundling data and methods into a class and restricting direct access to data**.

**How to achieve it:**
- Declare fields as `private`.
- Use public or protected getters and setters when controlled access is needed.
- Validate data before modifying it.

**Example:**
```java
class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
```

**Advantages:**
- Data protection
- Controlled access
- Better maintainability

## B. Inheritance

Inheritance is an OOP concept in which a child class (subclass) inherits accessible fields and methods from a parent class (superclass).

**Advantages:** Code reusability, maintainability, and extensibility.

### Private and Protected Members
- **Private:** Cannot be accessed directly in the child class.
- **Protected:** Accessible within the same package and by qualifying subclasses in other packages.
- **Getter/Setter:** Can provide controlled access to private fields.

### Types of Inheritance

1. **Single:** One child inherits from one parent.
2. **Multilevel:** A chain of inheritance (`Animal → Dog → Puppy`).
3. **Hierarchical:** Multiple children inherit from one parent.
4. **Multiple:** One child inherits from multiple parents. Java does not support this through classes, but interfaces can be used.
5. **Hybrid:** A combination of inheritance types; certain structures are possible using interfaces.