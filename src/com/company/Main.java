package com.company;

import com.company.arrays.Array;
import com.company.arrays.Test;

public class Main {

    public static void main(String[] args) {
        int [] a = {2,1,4,5};
        Array object2 = new Array(a);
        System.out.println("Max element: " + object2.findMaxElement());
        int [] a2 = {2,14,5, -100};
        object2.setArray(a2);
        System.out.println("Max element: " + object2.findMaxElement());

        Test test1 = new Test();
    }
}
