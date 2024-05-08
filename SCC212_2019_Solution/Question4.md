## Question 4a. 
This is because all the declared variables in Erlang are immutable. 

## Question 4b. 
i)
```
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
```
```
console.log( JSON.stringify(result) );
Then the code above returns "[4, 6, 8, 10]"
```


ii) This is called currying, which is a function that returns a function. This is good because the programmer doesn't
need to know what the previous function does, thus it is more flexible. 


## Question 4c. 
```javaScript
const result1 = nba_teams.filter(nba_teams => nba_teams.city === "New YorK");

const result2 = (nba_teams.filter(team => team.division === "Atlantic")).length;

const result3 = nba_teams.reduce(
    (acc, elem) => {
            return acc + Object.values(elem).reduce((elemAcc, string) =>{
                return elemAcc + string.length
            }, 0)
    }, 0);
```
