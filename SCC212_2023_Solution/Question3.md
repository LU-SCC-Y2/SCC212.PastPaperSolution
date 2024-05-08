## Question 3a
i. "Advanced Programming"
<br>
ii. -10

## Question 3b
```javaScript
function rotate(Array, K){
    part1 = Array.slice(-K);
    part2 = Array.slice(0, -K);
    res = part1.concat(part2);
    console.log(res);
}
array = [0, 1, 2, 3, 4, 5];
rotate(array, 2)'
```

## Question 3c
```erlang
-module(question3c).
-export([rotate/2]).
    rotate(List, K) ->
        {Part1, Part2} = lists:split(length(List) - K, List),
        Rotated = Part1 ++ Part2,
        io:format("~p~n", [Rotated]).
```
## Question 3d
```erlang
-module(question3d).
-export([sumLists/1]).

sumLists([]) ->
    ok;

sumLists([Head | Tail]) ->
    [sumList(0, Head) | sumLists(Tail)].

sumList(Acc, []) ->
    Acc;

sumList(Acc, [Head | Tail]) ->
    sumList(Acc + Head, Tail).
```