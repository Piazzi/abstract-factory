<div align="center">
  <h1> ABSTRACT FACTORY  </h1>
</div>

# Code

Simple project representing the abstract factory design pattern. 
<br></br>


# Resume


Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

![image](https://user-images.githubusercontent.com/40416044/144907880-278fdf4f-20e9-4139-80d9-a8bb5ab95ea9.png)
# Definition

The prototype pattern is a creational design pattern in software development. It is used when the type of objects to create is determined by a prototypical instance, which is cloned to produce new objects. This pattern is used to avoid subclasses of an object creator in the client application, like the factory method pattern does and to avoid the inherent cost of creating a new object in the standard way (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.

To implement the pattern, declare an abstract base class that specifies a pure virtual clone() method. Any class that needs a "polymorphic constructor" capability derives itself from the abstract base class, and implements the clone() operation.

The client, instead of writing code that invokes the "new" operator on a hard-coded class name, calls the clone() method on the prototype, calls a factory method with a parameter designating the particular concrete derived class desired, or invokes the clone() method through some mechanism provided by another design pattern.

The mitotic division of a cell — resulting in two identical cells — is an example of a prototype that plays an active role in copying itself and thus, demonstrates the Prototype pattern. When a cell splits, two cells of identical genotype result. In other words, the cell clones itself.

Source: <a href="https://en.wikipedia.org/wiki/Abstract_factory_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/pt-br/design-patterns/abstract-factory"> Refactoring Guru </a>
