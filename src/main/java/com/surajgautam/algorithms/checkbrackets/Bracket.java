package com.surajgautam.algorithms.checkbrackets;

public class Bracket {
    private char type;
    private int position;

    public Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    public int getPosition() {
        return position;
    }

    public char getType() {
        return type;
    }
}
