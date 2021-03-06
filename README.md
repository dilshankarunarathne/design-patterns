# Design Patterns
**_The Art of Designing Object-Oriented Software_**

### What are design patterns ?
They are an elegant solution to a repeating problem in software design.  
How to structure our classes - and how these classes should talk to each other.  

### Reference book
Design Patterns  
Elements of Reusable Object-Oriented Software (1994)  
by the Gang-of-Four  
Erich Gamma, Richard Helm, John Vlissides, Ralph Johnson  

This book contains 23 popular design patterns, which are formerly known as 
**Gang-of-Four patterns**. These patterns are divided into three categories.  
* Creational  
  Different ways to create objects
* Structural  
  Relationships between objects
* Behavioural   
  Interaction & communication between objects

These three categories or those _**Gang-of-Four patterns**_ don't represent 
all the design patterns in the world. There are other undocumented or less 
popular design patterns.  

### Benefits of learning design patterns

These design patterns help us communicate with other developers in a more 
abstract level. Sometimes we can just use the name of the pattern to 
communicate an idea or an improvement.  

Understanding design patterns helps us create **reusable**, **extensible** and 
**maintainable** software, no matter what programming language we use or 
what kind of application we build.  

These design patterns are extensively used in frameworks and libraries. 
So, even though they might have different syntax, the patterns are 
just the same. They make it easier to understand new concepts of programming.  

### Coupling and Interfaces
Coupling in OOP refers to, how much a class is dependent on another class. 
Think of a time, where we have a class named X. And we instantiate an X
object in another class called Y. So, the Y class depends on X class. 
If we make a change in X, both X and Y might have to be changed, and re-compiled.  

For an example, think of a car. If we get a flat tire, we would only have to 
change the tire that has a flat. We don't need to change all the other tires, or
any other parts of the car.  
So, the car is a **_loosely-coupled_** system.  

Our applications should be the same way. **Interfaces** can be used to build 
loosely-coupled classes.  

An interface is a contract that specifies the capabilities that a class should provide. 

