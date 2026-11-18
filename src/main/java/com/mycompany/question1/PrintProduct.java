/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;

/**
 *
 * @author User
 */
public class PrintProduct {
    // print tolal products sold 
    public void PrintTotalProductSales(Product product){
    System.out.println("Total products Sold: " + product.GetTotalProductSold());
    }
    //print ave products sold 
    public void PrintAverageProductSales(Product product) {
    System.out.println("Average Products Sold Per Product: " + product.GetAvarageProductSold());
    }
    //print popular products 
    public void PrintMostPopularProductSale(Product product) {
    System.out.println("Most popular Product: " + product.GetMostPopularProduct());
    }
    
    //print sales report
    public void PrintSalesReport(){
    System.out.println("====================");
    System.out.println("MATRESS SALES REPORT");
    System.out.println("====================");
        Product product = null;
    
    PrintTotalProductSales(product);
    PrintAverageProductSales(product);
    PrintMostPopularProductSale(product);
    
    System.out.println("================");
    }
}
