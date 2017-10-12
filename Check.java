/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.StringTokenizer;
import readfile.ReadFileText;
import stack.StackWord;

public class Check {
    
     //instance variables
     private ReadFileText file;
     private StackWord stack;
     private StackWord stackFile;
     private String input;
     
     //Constructor
     public Check(String path,String i){
         this.input = i;
         file = new ReadFileText(path);
         file.onStack();
         stack = new StackWord(input.length());
         stackFile = file.getStack();
         

     }
     /**
      * This method check if all word in two separate text are the same in way
      * that is first push on two stack and compare every element one with other
      */
     public void doCheck(){
        getInputText();
         boolean same = false;
         while(!stack.isEmpty() && !stackFile.isEmpty()){
             if(stack.pop().equals(stackFile.pop())){
                 same = true;
             }
             else{
                 same = false;
                 break;
             }
         }
         if(same){
             System.out.println("Yea all word in text are the same");
         }
         else{
             System.out.println("That is not true . Two text are diffrent");
         }
     }
     /**
      * Get the every token of input string and push on stack
      */
     private void getInputText(){
         StringTokenizer st = new StringTokenizer(input);
         stack = new StackWord(st.countTokens());
         while(st.hasMoreTokens()){
             stack.push(st.nextToken());
         }
     }
    
    
}
