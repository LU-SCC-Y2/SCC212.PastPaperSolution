## Question 2a
 <br>
i. Polymorphism  <br>
Definition: Two different classes performing the same method in different ways <br>
Benefits: It makes the code more reusable and more elegant <br>
Concept: Define a parent class and let the other classes to inherit it <br>

```java
public class Animal{
    public void makeSound(){
        System.out.println("make sound");
    }
}
public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
}
public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}
```

ii. Reflection
<br>
Definition: An API that allows one to see the structure of other classes, or invoke the methods within the other classes. 
<br>
Benifits: It allows us to extend the capabilites of the software during runtime.
<br>
Concept: It utilizes the Java's `java.lang.reflect.*` library to introspect the classes. 
<br>
```java
if (Person instanceof Human){
    System.out.println("true");
}
Method method = Person.getMethod("walk");
method.invoke();
```

iii. Generics
<br>
Definiton: It means parameterized types.
<br>
Benifits: It makes the code more reusable and safer
<br>
Concept: Define a generic type for classes or interfaces that need to be created so that the created classes or interfaces can be used by all types. 
<br>
```java
public interface List<E>{
    public void add(E elem);
    public void remove(E elem);
}
public class IntegerList extends List<Integer>{
    public void add(int elem){
        //implementation
    }
    public void remove(int elem){
        //implementation
    }
}

//main class
IntegerList integerList = new IntegerList();
integerList.add(1);
```

## Question 2b
```java
public class MagicalFactory{
    private int totalSold = 0;
    private int eggsHatch = 0;

    public void calculateEgg(int chickenCount){
        if (chickenCount * 10 >= totalSold){
            return;
        }
        for (int i = 0; i < chickenCount * 10; i ++){
            totalSold += 1;
            eggsHatch += 1;

            if(Math.random() <= 0.1){
                totalSold -= 1;
                calculateEgg(chickenCount + 1);
            }

        }
    }
    public int getTotalSold(){
        return this.totalSold;
    }
}

//main class
MagicalFactory factory = new MagicalFactory;
factory.calculateEgg(1);
factory.getTotalSold();
```

## Question 2c
It is tail recursive, because the recursion happens at the end of the method