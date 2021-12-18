package com.aprender;

import java.util.Scanner;


public class Soma {

public static void main(String[] args)
{
  int a, b, c = 0; 
  Scanner s = new Scanner(System.in);
  System.out.println("Introduza dois números: ");
  a = s.nextInt();
  b = s.nextInt();
  c = a + b;
  System.out.println("A soma de a e b é: " + c);
  }
}
