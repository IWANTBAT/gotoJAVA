/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 求矩阵对角线元素之和;
import java.util.Scanner;
public class 求矩阵对角线元素之和 {
    public static void main(String[] args) {
      System.out.print("输入数组长度：");
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      double[][] A = new double[n][n];
      System.out.print("Enter "+n+"-by-"+n+" matrix by row:");
      for(int i =0;i<n;i++){
          for(int j = 0;j<n;j++)
              A[i][j] = input.nextDouble();
      }
      System.out.println("sum of the elemennts in the major digonal is"+sumMajorDigonal(A));
    }
    public static double sumMajorDigonal(double[][] m)
    {
        double sum = 0;
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[i].length;j++)
                if(i==j)
                    sum = sum +m[i][j];
        }
        return sum;
    }
}
