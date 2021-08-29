## Definition:
###What is abstraction, abstract class?
- is a process of showing the essential features (functionalities) and **hiding the background details**. User does not what are the implementation behind the functionality
- 


### How to create the abstract class
- abstract class must be declared with an abstract keyword
- when there is 1 abstract method, then the class is the abstract class
- it can have both abstract and non-abstract methods (0 to 100% abstraction)
- it can't be instantiated
- it can have constructor**s**. **If you don't provide constructor, the compiler adds default constructor**

### How to use the created abstract class in the derived class
- after created abstract class, it has to be used in the **sub-classes**(INHERITANCE by using the **extends** keyword)
- provide the implementation to the abstract methods of the super abstract class



Questions:
Why we need constructor inside an abstract class?

Ans:
In abstract class,you have instance variable, abstract and non-abstract methods
We need to initialize the non-abstract methods and instance variables, therefore abstract classes have a constructor 

Reference:
https://www.geeksforgeeks.org/why-java-interfaces-cannot-have-constructor-but-abstract-classes-can-have/
