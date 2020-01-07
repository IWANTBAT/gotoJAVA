/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 写读数据;   
import java.util.Arrays;
import java.util.Scanner;
public class 写读数据 {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("Exercise12_15.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
            for(int i = 0;i<100;i++){
                output.print((int)(Math.random()*100)+" ");       
            }
        }
        int B[] = new int[100];
        try (Scanner input = new Scanner(file)) {
            for(int i = 0;i<100;i++){
                B[i] = input.nextInt();
            }
             Arrays.sort(B);
                System.out.print(Arrays.toString(B));
        }
    }
}
    

