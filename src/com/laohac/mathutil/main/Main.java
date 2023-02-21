/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laohac.mathutil.main;

import com.laohac.mathutil.core.MathUtility;

/**
 *
 * @author simnh
 */
public class Main {
    public static void main(String[] args) {
        
        // thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hay ko
        // ta phai dua ra cac tinh huong su dung trong thuc te
      
        //TEST CASE: la 1 tinh huong su dung, xai app hay xai ham bao gom:
        // INPUT
        // OUTPUT
        // Dua vao de xu ly
        // Ki vong : mong ham se tra ve 
        
        long expected = 120;
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        System.out.println("5! = 120 expected");
        System.out.println("5! = " + actual + "actual");
    }
    
}
