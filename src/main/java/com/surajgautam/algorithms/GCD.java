package com.surajgautam.algorithms;

/**
 * Created by Suraj Gautam.
 */
public class GCD {

    public int calculateWithNaiveSolution(int firstNumber, int secondNumber){
        int result = 0;
        for (int i = 2; i < firstNumber + secondNumber ; i++) {
            if((firstNumber%i==0) && (secondNumber%i==0)){
                result = i;
            }
        }
        return result;
    }

    public int calculateWithEuclideanAlgorithm(int a, int b){
       // GCD(a,b) = GCD(a', b) = GCD(b, a')
        if(b == 0){
            return a;
        }

        int prime = a % b;
        return calculateWithEuclideanAlgorithm(b,prime);
    }

}
