/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.blist.TugasAray;

import java.util.Scanner;

/**
 *
 * @author BAYU K PUTRA
 */
public class ArrayIQBAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input  = new Scanner(System.in);
        String[] nama  = new String[5];
        int[] npm = new int[5];
        
        for(int i= 0;i<5; i++){
        System.out.println("In nama ke"+(i+1)+":");
        nama[i] = input.nextLine();
        }
        for(int i= 0;i<5; i++){
        System.out.println("In npm ke"+(i+1)+":");
        npm[i] = input.nextInt();
        } 
        for(int i=0; i<5;i++){
            System.out.println("Npm ke"+(i+1)+":"+npm[i]);
        }
         for(int i=0; i<5;i++){
            System.out.println("Nama ke"+(i+1)+":"+nama[i]);
        }
    }
    
}
