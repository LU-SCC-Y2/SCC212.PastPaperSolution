-module(question3d).
-export([sum_lists/1]).

sum_lists([]) ->
    [];

sum_lists([Head | Tail]) ->
    % my answer
    % sum_list(Head),
    % sum_lists(Tail).
    [sum_list(Head) | sum_lists(Tail)].
    
sum_list(List) ->
    sum_list(List, 0).

sum_list([], Acc) ->
    Acc;

sum_list([Head | Tail], Acc) ->
    sum_list(Tail, Acc + Head).


