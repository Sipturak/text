/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author pc
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;
public class Sametext {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        String a = "";
        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\pc\\Desktop\\A.txt"))){
            String line = bf.readLine();
            while(line != null && !line.isEmpty()){
                a+=line + "\n";
                line = bf.readLine();
            }
        }
        catch(IOException ex){
            
        }
         Check c = new Check("C:\\Users\\pc\\Desktop\\B.txt", a);
         c.doCheck();
    }
    
   
    
}
