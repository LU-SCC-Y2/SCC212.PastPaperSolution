
## Question 3a. 
1. Need to define type in Java but not in Python/JavaScript
<br>
2. The OOP concept in Java is more organized as it supports multi files, but harder in Python/JavaScript
<br>
3. Java supports concurrency by using threads, but not JavaScript/Python 
<br>
4. Java supports abstract classes and interfaces which makes the code more safe and extendible
<br>
5. Java can support polymorphism easier, but harder in Python/JavaScript

## Question 3b. 
1. Declaring Variables 
```
JavaScript
let a = 5; // mutable 
const a = 5; // immutable 

Java
int a = 5; // type is specified and is mutable
final String a = "abc" // type is specified and is immutable
```
    
2. OOP 
```
Python
class Animal():
    def sound(self):
        print("animal's sound")

Java 
public class Animal{
    public void sound(){
        System.out.println("animal's sound");
    }
}
<!-- then other classes can easily extend this Java class, even in other files -->
```

3. concurrency 
```
JavaScript // uses aync
async function abc (){
    const reponse = await (console.log("hello word"));   
}

Java
public synchronized void abc(){
    System.out.println("hello world");
}
```
4. Error Handling 
```
Python 
    try(

    )catch(
)

Java
    try{

    } catch(Exception e){

    } // error could be more specific such as IOException
```
    5. 

    6. 

    

## Question 3c. 
I would join the Group A because it makes the code structure more organized by using multi files and packages throughout the development. It is also better in terms of team development as each team member can work on different files. 