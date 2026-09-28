/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.iconsoles;

/**
 *
 * @author Student
 */
public class ConsoleSales implements IConsoles {

    }
    
     // Constructor
    public ConsoleSales() {
    }
    
    //Methhod 
    void.getConsoleType();
    void.getStore();
    void.getTotalSales();
    
    // Override Method
    @Override
    public String getConsoleType() {
      System.out.println("CONSOLE TYPE:" + getConsoleType);
    }

    @Override
    public String getStore() {
        System.out.println("STORE:" + getStore);
    }
        
    @Override
    public int getTotalSales() {
        System.out.println("TOTAL SALES: " + getTotalSales);
    }
    
}