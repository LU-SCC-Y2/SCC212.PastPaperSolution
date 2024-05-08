## Question 3a. 
Constant literal that evaluates themselves.
    Starts with small letter or is within the ''. It is usually used for pattern matching.

## Question 3b. 
=== and ===. 1 == 1.0 returns true, while 1 === 1.0 returns false because integer is not === float. 

## Question 3c. 
i.
line 1 defines a termination case, or a base case when the N is more than 15. 
<br>
line 2 checks if N is fully divisible by 3 and 5 or not, if yes, add "FizzBuzz" to Res, in this case, [].
<br>
line 3 checks if N is fully divisible by 3 or not, if yes, add "Fizz" to Res, in this case, [].
<br>
line 4 checks if N is fully divisible by 5 or not, if yes, add "Buzz" to Res, in this case, [].
<br>
line 5 increments N and add N into Res, in this case, []. 
<br>
line 7 starts the function with N = 1 and an empty array, which means it will starts repeating from 1 to 15,
and within 1 - 15, it will start the checking as shwon from line 2 to 5. 

ii) 
```
[1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
```