/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import stack.StackWord;

public class ReadFileText {
    
   //instance varibles;
   private BufferedReader read;
   private String output;
   private StackWord stack;
   
   //Constructgo
   public ReadFileText(String path) {
       try {
           read = new BufferedReader(new FileReader(path));
           setFileText();
           read.close();
       } catch (FileNotFoundException ex) {
           System.out.println("File is not found on that path");
       } catch (IOException ex) {
       }
       
   }
   /**
    * Read text from some file path on your computer
    * @return output of file in string representation
    * @throws IOException 
    */
   private void setFileText() throws IOException{
       StringBuilder build = new StringBuilder();
       
       String line = read.readLine();
       while(line != null && !line.isEmpty()){
           build.append(line + "\n");
           line = read.readLine();
       }
       output = build.toString();
   }

   public void onStack(){
       
       StringTokenizer st = new StringTokenizer(output);
       stack = new StackWord(st.countTokens());
       while(st.hasMoreTokens()){
           stack.push(st.nextToken());
       }
   }
   
    /**
    * 
    * @return 
    */
   public String getText(){
       return output;
   }
   /**
    * 
    * @return 
    */
   public StackWord getStack(){
       return stack;
   }
    
    
    
    
    
}
