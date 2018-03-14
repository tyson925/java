package com.company.javapractice;

import java.util.*;

public class Stack {

    public String[] stackArray;
    public int stackCounter;

    public Stack(int n) {
        this.stackArray = new String[n];
        this.stackCounter = 0;
    }

    public void pushToStack(String element) throws Exception {
        if (stackCounter == stackArray.length) {
            throw new ExceptionStackMax("There is no more space in the stack!");
        }
        stackArray[stackCounter] = element;
        stackCounter++;
    }

    public String popFromStack() throws Exception {
        if (stackCounter == 0) {
            throw new ExceptionStackMin("There is nothing to remove from the stack!");
        }
        stackCounter--;
        return stackArray[stackCounter + 1];
    }

    @Override
    public String toString() {
        for (int i = 0; i < stackArray.length; i++) {
            if (stackArray[i] != null) {
                String str = stackArray[i];
                System.out.println(str);
            }
        }

        return "This stack contains " +
                "the following element: " + Arrays.toString(stackArray) +
                ", and the number of elements are " + stackCounter  + ". ";
    }
}
