package com.surajgautam.algorithms;

/**
 * Created by Suraj Gautam.
 */
public class GCD {

    private int firstNumber;
    private int secondNumber;

    public GCD(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int calculateWithNaiveSolution(){
        int result = 0;
        for (int i = 0; i < this.firstNumber + this.secondNumber ; i++) {
            if((this.firstNumber%i==0) && (this.secondNumber==0)){
                result = i;
            }
        }
        return result;
    }


    public int calculateWithEuclideanAlgorithm(){
        return 0;
    }

}
