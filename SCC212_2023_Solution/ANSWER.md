Question 2a
i. Polymorphism
Definition: This means that two different classes are doing the same thing in different ways. 
Benifits: It makes the code more elegant
Concept: Basically create a parent class, and then let the children extending the parent class to
@Override the methods in the parent class.
Sample:
    public class Animal{
        public void sound{
            System.out.println("animal");
        }
    }

    public class Dog extends Animal{
        @Override
        public void sound{
            System.out.println("woof");
        }
    }
    public class Cat extends Animal{
        @Override
        public void sound{
            System.out.println("mew");
        }
    }

ii. Reflection
Definition: This allows the class to see the structure or call the functions of other classes.
Benifits: It can be used to invoke the methods in the inspected classes, thus it makes the program more automatic.
Concept: It utilizes the java.lang.reflect to get the information of the class such as the Class, Methods, Contructor and more.

Sample:
    Method method = class.getMethod("getLength");
    int length = method.invoke();

iii. Generics
Definition: It defines a very generic type for the classes and interfaces
Benefit: Provides general and reusable general interfaces
Concept: When writing a class and methods, we define a generic type
Sample: 
    public interface Collection<E>{
        public void add(E elem);
        public void remove(E elem);
    }

    public class ArrayList<E> implements Collection{
        
    }

    public main{
        ArrayList <Person> = new ArrayList<Person>();
    }



Question 2b

public class MagicalFactory{
    int eggCount = 0;
    int totalSold = 0;

    public void calculateEggs(int chickenCount){
        if (eggCount > chickenCount * 10){
            return ;
        }

        for (int i = 0; i < chickenCount; i++){
            eggCount ++;
            totalSold ++;

            if (Math.random() <= 0.1){
                totalSold --; 
                calculateEggs(chickenCount + 1);
            }
        }
    }

    public int getTotalSold(){
        return this.totalSold;
    }
}

public class Main {
    public static void main(String[] args) {
        MagicalFactory magicalFactory = new MagicalFactory();
        magicalFactory.calculateEggs(1);
        System.out.println("Total Eggs Sold: " + magicalFactory.getTotalSold());
    }
}


Question 2c
tail recursive, because the recursion happens in the end of the method.

Question 3a
i. Advanced Programming
ii. -10 

Question 3b
function rotate(array, k) {
    newArray1 = array.slice(array.length - k);
    newArray2 = array.slice(0, array.length - k);
    return newArray1.concat(newArray2);
}

array = [0, 1, 2, 3, 4, 5]
console.log(rotate(array, 2));

Question 3c

Question 3d


