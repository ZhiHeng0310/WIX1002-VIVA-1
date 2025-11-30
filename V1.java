/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package v1;
import java.util.*;

public class V1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input(number of inquires)
        System.out.print("Enter total number of inquires:");
        int q = input.nextInt();
        //(User enter again if q>=500 until q<500)
        while (q>=500){
            System.out.print("Enter total number of inquires:");
            q = input.nextInt();
        }
        // Create a 2D array to store sequences
        int[][] sequences = new int[q][];
        // Input a,b,n for q times
        for (int i = 0 ; i<q ; i++){
            System.out.print("Enter initial value:");
            int a = input.nextInt();
            //(User enter again if a>=50 or a<0 until 0<=a<50)
            while (a>=50 || a<0){
                System.out.print("Enter initial value:");
                a = input.nextInt();
            }
            System.out.print("Enter multiplier seed:");
            int b = input.nextInt();
            //(User enter again if b>=50 or b<0 until 0<=b<50)
            while (b>=50 || b<0){
                System.out.print("Enter multiplier seed:");
                b = input.nextInt();
            }
            System.out.print("Enter charm length:");
            int n = input.nextInt();
            //(User enter again if n>15 or n<1 until 1<=n<=15)
            while (n>15 || n<1){
                System.out.print("Enter charm length:");
                n = input.nextInt();
            }
            
            //Process:Store the sequence in an array
            sequences[i] = new int[n];
            for (int j = 0; j < n; j++) {
                sequences[i][j] = a + b * (int)Math.pow(2,j);
            }
            
        }
        
        //Output
        for (int i=0;i<q;i++){
            for (int j=0;j<sequences[i].length;j++){
                System.out.print(sequences[i][j]+" ");
            }
            //Seperate one line
            System.out.println();
        }
        
    }
    
}
