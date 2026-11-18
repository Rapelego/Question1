/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question1;
/**
 *
 * @author User
 */

public class Product implements Iproduct {
 //Single dimension array for product names
    private String[] productNames ={
        "Single Matress",
            "Double Matress",
    "Queen Matress"
    };
    //2-dimension array for monthly rates
    private int[][] sales={
        {20,25,30},
        {15,20,25},
        {30,35,40}
    };
    //calculate total products sold 
    @Override
    public int GetTotalProductSold() {
    int total =0;
    for (int i = 0; i <sales.length; i++){
        for (int j= 0; j <sales[i].length; j++){
        total+= sales[i][j];
        }
    }
        
     return total;   
    }
    //Calculate aver products sold per product
    @Override
    public double GetAvarageProductSold() {
    return(double) GetTotalProductSold() / productNames.length;
    }
    //Det most popular product
    @Override 
    public String GetMostPopularProduct(){
    int highestSales =0;
    int popularProductIndex =0;
    
    for (int i=0; i <sales.length; i++){
    int productTotal =0;
    for(int j=0; j <sales[i].length; j++){
    productTotal += sales[i][j];
    }
    if (productTotal> highestSales){
    highestSales = productTotal;
    popularProductIndex =i;}
    }
    return productNames[popularProductIndex];
    }
}
