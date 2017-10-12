/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author pc
 */
public class StackWord {
    
    //instanice variables;
    private String [] array;
    private int top;
    private int maxSize;
    
    //constructor
    public StackWord(int s){
        maxSize = s;
        top = -1;
        array = new String[maxSize];
    }
    /**
     * Push element on top of stack
     * @param word of input string     
     */
    public void push(String word){
        try{
            if(!isFull()){
                array[++top] = word;
            }
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Stack is full");
        }
    }
    /**
     * Get the last element insert on stack and remove it
     * @return removed element
     */
    public String pop(){
        if(isEmpty()){
           return null;
        }
        else{
            return array[top--];
        }
    }
    /**
     * Peek on current element on stack
     * @return last element on stack
     */
    public String peek(){
        return array[top];
    }
    /**
     * Check is stack is empty
     * @return true if is empty
     */
    public boolean isEmpty(){
        return (top == -1);
    }
    /**
     * Check stack if is full
     * @return true if stack full
     */
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    
}
