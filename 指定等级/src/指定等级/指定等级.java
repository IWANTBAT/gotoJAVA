/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 指定等级;
import java.util.Scanner;
public class 指定等级 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of students:");
       int student = input.nextInt();
       System.out.print("Enter"+ student+"scores");
       double[] S = new double[student];
       for(int i = 0;i<S.length;i++)
           S[i]=input.nextDouble();
        double best = S[0];
        for(int i=0;i<S.length;i++)
            if(S[i]>best)       
                best = S[i];
        for(int i=0;i< S.length;i++){
            if(S[i]>=best-10)
                System.out.println("Student"+ i +"is " + S[i]+"and grade is A");
            else if(S[i]>=best-20)
                 System.out.println("Student"+ i +"is  " + S[i] +"and grade is B");
            else if(S[i]>=best-30)
                 System.out.println("Student"+ i +"is " + S[i]+"and grade is C");
            else if(S[i]>=best-40)
                 System.out.println("Student"+ i +"is " + S[i]+"and grade is D");
            else
                System.out.println("student"+ i +"is" + S[i]+"and grade is F");
              }
    }  
}
 
    
    

