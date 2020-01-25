package com.surajgautam.algorithms.checkbrackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CheckBrackets {

    public static void main(String[] args) throws IOException {

        //first priority-> find unmatched closing bracket which doesn't have it's opening bracket
        //second priority->

        // }() => 1
        // {[}
        // (()) => Success
        // {[}   => 3
        // {}{}] => 5
        // [](() => 3
        String text;
        do{
            InputStreamReader input_stream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input_stream);
            text = reader.readLine();
            int pos = 0;
            boolean isValid = false;

            Stack<Bracket> openingBrackets = new Stack<Bracket>();
            for (int position = 0; position < text.length(); ++position) {
                char next = text.charAt(position);

                if (next == '(' || next == '[' || next == '{') {
                    Bracket bracket = new Bracket(next, position);
                    openingBrackets.push(bracket);
                }

                if (next == ')' || next == ']' || next == '}') {
                    if(!openingBrackets.isEmpty()){
                        Bracket poppedValue = openingBrackets.pop();
                        if(!poppedValue.match(next)) {
                            isValid = false;
                            pos = position;
                            break;
                        }else{
                            isValid = true;
                        }
                    }else {
                        isValid = false;
                        pos = position;
                        break;
                    }
                }
                //incase loop runs till last and if stack is not empty the error is in last position
                pos = position;
            }
            if(isValid && openingBrackets.isEmpty()){
                System.out.println("Success");
            }else if(isValid && (!openingBrackets.isEmpty())){
                //for (() condition
                System.out.println(openingBrackets.peek().getPosition()+1);
            }else{
                System.out.println(pos+1);
            }
        }while(!text.equals("no"));

    }
}
