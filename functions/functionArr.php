<?php

function createRandomArr(){
    $arr = [];
    $size = rand(5, 10);
    for($i=0; $i < $size; $i++){
        $arr[$i] = rand(0, 100);
    }
    return $arr;
}

function takeSmaller($arr){
    $small = $arr[0];
    for($i=0; $i < count($arr); $i++){
        if($arr[$i] < $small){
            $small = $arr[$i];
        }
    }
    return $small;
}


$arr = createRandomArr();
print_r($arr);
print(takeSmaller($arr));










?>