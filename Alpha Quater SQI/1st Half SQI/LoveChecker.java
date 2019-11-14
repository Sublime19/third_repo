/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package SimpleCalculator;

/**
 *
 // @author User
 */
import java.io.*;
import java.util.*;
import java.lang.*;


public class LoveChecker 
{
  static double yourName    = Math.random();
  static double loversName  = Math.random();
	public static void main(String[] args)
	{
            Scanner sca = new Scanner(System.in);
            System.out.println("Enter yourName:  ");
		System.out.println(sca.nextLine());

		System.out.println("Enter loversName:  ");
		System.out.println(sca.nextLine());

		System.out. println("Welcome" + yourName + loversName);

		Math.random();



		if (yourName >= 0.5){ 
		 System.out.println("Marrige is certain");
		 	}
		if (loversName < 0.5){
		  System.out.println("Breakup immiment");
				}
		

	}
}

