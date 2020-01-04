/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 距离最近的两个点;
import java.util.Scanner;
public class 距离最近的两个点 {
    public static void main(String[] args) {
        System.out.print("输入点的个数：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[][] A = new double[n][3];
        for(int i = 0;i< n;i++){
            for(int j = 0;j<3;j++)
                A[i][j] = input.nextDouble();
        }
        int p1 = 0,p2 = 1;
        double sdistance = distance(A[p1][0],A[p1][1],A[p1][2],A[p2][0],A[p2][1],A[p2][2]);
        double distance ;
        for(int i =0;i<n;i++){
            for( int j = i+1;j<n;j++){
                distance = distance(A[i][0],A[i][1],A[i][2],A[j][0],A[j][1],A[j][2]);
            if(sdistance >distance){
                p1 = i;
                p2 = j; 
                sdistance = distance;
            }
            }
        }
        System.out.println("The closest two point are"+"("+A[p1][0]+","+A[p1][1]+","+A[p1][2]+") and ("+A[p2][0]+","+A[p2][1]+","+A[p2][2]+")");
    }
    public static double distance(double x1,double y1,double z1,double x2,double y2,double z2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1));
    }
}
