## Question 2a. 
i. Inheritance 
This means that a child class has inherit all the methods that the parent class has. A simple example for this is to define 
1) A parent class 2) A child class
`
public class Animal{
    String name;
    public void makeSound(){
        System.out.println("This is " + this.name + "making a sound");
    }
}

public class Dog extends Animal{
}
`
then in the main class
`
Dog dog = new Dog();
dog.makeSound;
`

ii. Polymorphism
    This means that two different classes are carrying out the same method in different ways. The method in this case will 
    be the method both of these classes have inherited from their parents, and have implemented the method in their 
    own classes. Usually @Override will be included to justify properly, even though it is not necessary.

iii. Reflection
    This indicates that a program can view the structure of other classes, or its own structure. This can be done using 
    getClass() method. 

iv. Immutability
    This indicates that the variables cannot be changed. This can be done using the final keyword, such as 
    private final String Immutable;

<hr/>

## Question 2b.
i. The definition of generic is to provide a type free syntax when creating classes, methods or interfaces.
The motivation of generics is to provide a reusable template for the future problems. Besides, this can be used to make 
sure that all of the classes in the future that are implementing the generic interface are going to implement the 
predefined signature within the generic interface. 

    Other motivations:
    1. Type Safety
    2. Improved readability:

ii. 
`
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
`
then in the main class we can call something like 
`
List <Integer> array1 = new List<Integer>();
array1.add(1);
array1.add(2);
array1.remove(1);

List <String> array1 = new List<String>();
array1.add("hello");
array1.add("Hi");
array1.remove("hi");
`

Question 3
3a. Constant literal that evaluates themselves.
    Starts with small letter or is within the ''. It is usually used for pattern matching.

3b. == and ===. 1 == 1.0 returns true, while 1 === 1.0 returns false because integer is not === float. 

3c. 
i)
line 1 defines a termination case, or a base case when the N is more than 15. 
line 2 checks if N is fully divisible by 3 and 5 or not, if yes, add "FizzBuzz" to Res, in this case, [].
line 3 checks if N is fully divisible by 3 or not, if yes, add "Fizz" to Res, in this case, [].
line 4 checks if N is fully divisible by 5 or not, if yes, add "Buzz" to Res, in this case, [].
line 5 increments N and add N into Res, in this case, []. 
line 7 starts the function with N = 1 and an empty array, which means it will starts repeating from 1 to 15,
and within 1 - 15, it will start the checking as shwon from line 2 to 5. 

ii) [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]


Question 4
4a. This is because all the declared variables in Erlang are immutable. 

4b. i)
const f = x => y => x + (y * 2); // This defines a function x, which returns function y = x + (y * 2)
const data = [ 1, 2, 3, 4 ]; // This initiates a immutable array as a const. 
const result = data.map( f(2) ); 
// It passes in 2 into the function x, which then returns y=> 2 + (y * 2).
// Then since the map is called, it will start performing the function to all the element in the data
// For instance, 
1. 2 + (1 * 2), 
2. 2 + (2 * 2), 
3. 2 + (3 * 2), 
...

console.log( JSON.stringify(result) );
Then the code above returns "[4, 6, 8, 10]"


4b. ii) This is called currying, which is a function that returns a function. This is good because the programmer doesn't
need to know what the previous function does, thus it is more flexible. 


4c. i) const result = nba_teams.filter(nba_teams => nba_teams.city === "New YorK");
    ii) const result = (nba_teams.filter(team => team.division === "Atlantic")).length;
    iii)
const result = 
nba_teams.reduce(
    (acc, elem) => {
            return acc + elem.reduce((elemAcc, string) =>{
                return elemAcc + string.length
            }, 0)
    }, 0);
