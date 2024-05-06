function rotate(Arr, k) {
    array1 = Arr.slice(0, -k);
    array2 = Arr.slice(-k);
    console.log(array2.concat(array1))

}

Array = [0, 1, 2, 3, 4, 5];
rotate(Array, 2)