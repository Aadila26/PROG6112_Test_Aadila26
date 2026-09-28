/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_test;

import java.util.Arrays;

/**
 *
 * @author emeris
 */
public class Q1 {

    public static void main(String[] args) {
   int sales [] [] ={
       
       //Cape Town
       {1000,2000,3000},
       //Port Elizabeth
       {2000,3000,4000},
       //Pretoria 
       {1500,1100,1200},
   };
    String [] cities =
    {"Cape Town" , "Port Elizabeth" , "Pretoria "};
    
    int [][] citiesData = new int[3][3];
       int [] totals = new int [3];
       int highestTotal = 0;
       String highestCity = "";
       
  //  int [] totals = new int [cities.length];
    
    System.out.println("-------------------");
    System.out.println("GAMING  CONSOLE REPORT");
    System.out.println("-------------------");
    System.out.println("        PS5  XBOX  SWITCH");
    
      for(int i = 0;i<sales.length;i++){
          int [] oneDarray = sales[i]; 
      
      System.out.println(cities[i]+" "+Arrays.toString(oneDarray));
       int PS5 = sales [i][0];
      
       int XBOX = sales [i] [1];
        
       int SWITCH = sales [i] [2];
      
       

          int total = PS5 + XBOX + SWITCH;
       totals[i] = total;
        }
        System.out.println("====CONSOLE SALE TOTALS====");
       for(int i = 0;i<totals.length;i++){
           System.out.print(cities[i]+" "+totals[i]);
         
           System.out.println("");
       }
    }
      
     
      
}

