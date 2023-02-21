/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laohac.mathutil.core;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author simnh
 */
public class MathUtility {
    
    //trong class nay cung cap cho ai do nhieu ham xu li toan hoc
        //clone class Math cua JDK
        //ham thu vien xai chung cho ai do, ko can luu lai trang thai/gia tri
      
        // ham tinh giai thua
    
    public static long getFactorial(int n){
        
        List<String> list = Arrays.asList("one", "two", "three");
        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
            
            if (n<0 || n>20)
                throw new IllegalArgumentException("Invalid argument, N must be between 0..20");
            if (n==0 || n==1)
                return 1;
            long product = 1; // make it true
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    
}
