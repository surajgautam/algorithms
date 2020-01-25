package com.surajgautam.algorithms.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackWithMax {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    // Push value to stack
    // Push maximum value to maximumStack
    //When popping, pop from both stacks
    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        int queries = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maximumValues = new Stack<>();
        for (int qi = 0; qi < queries; ++qi) {
            String operation = scanner.next();
            if ("push".equals(operation)) {
                int value = scanner.nextInt();
                if((!maximumValues.isEmpty()) && maximumValues.peek()>=value){
                    maximumValues.push(maximumValues.peek());
                }else{
                    maximumValues.push(value);
                }
                stack.push(value);
            } else if ("pop".equals(operation)) {
                if(!stack.isEmpty()){
                    stack.pop();
                }
                if(!maximumValues.isEmpty()){
                    maximumValues.pop();
                }
            } else if ("max".equals(operation)) {
                if(!maximumValues.isEmpty()){
                    System.out.println(maximumValues.peek());
                }
            }
        }
    }

    static public void main(String[] args) throws IOException {
        new StackWithMax().solve();
    }
}
