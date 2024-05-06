-module(question3c).
-export([rotateList/2]).

rotateList(List, K) when K > 0 ->
    {Prefix, Suffix} = lists:split(length(List) - K, List),
    Rotated = Suffix ++ Prefix,
    io:format("Rotated List ~p ", [Rotated]);

rotateList(List, _) ->
    List.

