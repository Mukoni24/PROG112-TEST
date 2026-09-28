/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
public class Number1Electronics {

     public static void main(String[] args) {

        // Declare and populate a 2D array
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        String[] headings= { "PS5", " XBOX" , " SWITCH" };
            
        // Nested loop to print rows and columns
        for (int row = 0; row < sales.length; row++) {

            for (int column = 0; column < sales[row].length; column++) {

                System.out.print(sales[row][column] + " "); 
                
                System.out.print(headings[0],headings[1],headings[2]);
            }
            
        // Nested loop to print rows and columns
        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            total = total + sales[i];
        }

        System.out.println("Total: " + total);
    }
}
