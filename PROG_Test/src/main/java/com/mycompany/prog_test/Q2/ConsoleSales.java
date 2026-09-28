/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog_test.Q2;

/**
 *
 * @author emeris
 */
public class ConsoleSales extends Console{
     public ConsoleSales (String consoleType,String store , 
          int totalSales  ){
        super (consoleType, store, totalSales);
    }
    public  void printReport(){
        
        
        
        System.out.println( "Console Type: " + super.getConsoleType());
        System.out.println("Store Name : " + super.getStore());
        System.out.println("Total Amount of Sales:" + super.getTotalSales());
        
    }

    void printConsoleSales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


