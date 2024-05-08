## Question 2a. 
i. Inheritance 
<br>
This means that a child class has inherit all the methods that the parent class has. A simple example for this is to define a parent and a child class 
```java
public class Animal{
    String name;
    public void makeSound(){
        System.out.println("This is " + this.name + "making a sound");
    }
}

public class Dog extends Animal{
}
```
then in the main class
```
Dog dog = new Dog();
dog.makeSound;
```

ii. Polymorphism
    <br>
    This means that two different classes are carrying out the same method in different ways. The method in this case will 
    be the method both of these classes have inherited from their parents, and have implemented the method in their 
    own classes. Usually @Override will be included to justify properly, even though it is not necessary.

iii. Reflection
    <br>
    This indicates that a program can view the structure of other classes, or its own structure. This can be done using 
    getClass() method. 

iv. Immutability
    <br>
    This indicates that the variables cannot be changed. This can be done using the final keyword, such as 
    private final String Immutable;


## Question 2b.
i. The definition of generic is to provide a type free syntax when creating classes, methods or interfaces.
The motivation of generics is to provide a reusable template for the future problems. Besides, this can be used to make 
sure that all of the classes in the future that are implementing the generic interface are going to implement the 
predefined signature within the generic interface. 

    Other motivations:
    1. Type Safety
    2. Improved readability:

ii. 
```
public interface Collection<E>{
    public void add(E element);
    public void remove(E element);
}
public class List<E> implements Collection<E> {
    public void add(E element){
        // implementation
    }
    public void remove(E element){
        // implementation
    }
}
```
then in the main class we can call something like 
```
List <Integer> array1 = new List<Integer>();
array1.add(1);
array1.add(2);
array1.remove(1);

List <String> array1 = new List<String>();
array1.add("hello");
array1.add("Hi");
array1.remove("hi");
```


