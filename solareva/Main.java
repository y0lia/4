package com.solareva;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) throws IOException {
    	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	 
    	 System.out.print("Введіть кіл-ть школярів: ");
    	 String a= reader.readLine();
    	 int x = Integer.parseInt(a);
    	 System.out.print("Введіть кіл-ть яблук : ");
    	 String b= reader.readLine();
    	 int y = Integer.parseInt(b);

    	
         
    	 System.out.print("У кошику залишається: ");
       
    	 int z;
         z = y%x;
        
        System.out.println(z);
     }
   
     }
  

