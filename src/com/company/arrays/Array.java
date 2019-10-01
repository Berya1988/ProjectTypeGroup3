package com.company.arrays;

public class Array {
   private int [] array;
   private int max;

    public Array() {
    }

    public Array(int[] array) {
        this.array = array;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }


    public int findMaxElement(){
        max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
