/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog_test.Q2;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter Console Typr : ");
        String consoleType = scanner.nextLine();
        
        System.out.println("Enter store name: ");
        String store = scanner.nextLine();
        
        System.out.println("Enter Total sales : ");
        int totalSales = scanner.nextInt();
        scanner.nextLine();
        
        
       ConsoleSales cs = new ConsoleSales (consoleType, store ,
        totalSales);
       cs.printConsoleSales();
        
       
        
    }
}
   
    
    

    
    

