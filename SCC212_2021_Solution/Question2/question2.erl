-module(question2).
-export([pre_amble/0, finish/0, post_hole/0, setFeedRate/1, drillhole/4, millCircles/3, makeSafe/0]).

makeSafe() ->
    ok.

pre_amble() -> 
    io:format("G17"),
    makeSafe(),
    io:format("M3 S1000"),
    setFeedRate(ply).

finish() -> 
    makeSafe(),
    io:format("M5"),
    io:format("G0 X0 Y0").

post_hole() ->
    makeSafe().

setFeedRate(steel) ->
    io:format("G1 F2");
setFeedRate(aluminium) ->
    io:format("G1 F20");
setFeedRate(ply) ->
    io:format("G1 F200");
setFeedRate(hardwood) ->
    io:format("G1 F100");
setFeedRate(perspex) ->
    io:format("G1 F100");
setFeedRate(foam) ->
    io:format("G1 F500");
setFeedRate(_) ->
    ok.

drillhole(X, Y, R, D) ->
    io:format("G0 X" + X + " Y" + Y),
    Z = - 2,
    drillhole_loop(X, Y, R, D, Z).

drillhole_loop(_, _, _, D, Z) when Z < -D ->
    ok;

drillhole_loop(X, Y, R, D, Z) ->
    io:format("G1 Z" + Z),
    millCircles(X, Y, R),
    io:format("G1 X" + X + " Y" + Y),
    drillhole_loop(X, Y, R, D, Z - 2).


millCircles(X, Y, R) ->
    DX = 0,
    O = 1,
    millCircle_loop (X, Y, R, DX, O).

millCircle_loop(_, _, R, _, O) when O > R - 0.75 ->
    ok;

millCircle_loop (X, Y, R, _, O) ->
    DX1 = X - O,
    io:format("G1 X" +DX1 + " Y" + Y),
    io:format("G2 X" + DX1 + " Y" + Y + " I" + O + " J0"),
    millCircle_loop(X, Y, R, DX1, O + 1).




