package com.aprender;

import java.util.Scanner;

public class NumParOuImpar{


 public static void main(String[] args){
   
   Scanner in = new Scanner(System.in);
   int numero;
   
   System.out.println("Digite o valor do número: ");
   numero = in.nextInt();
   in.nextLine();
   
   
   if(numero%2==0)
     
     System.out.println("\nO número é par");
      
   else
   
    System.out.println("\nO número é ímpar");
   
  }

}
