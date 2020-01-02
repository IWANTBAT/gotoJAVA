/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 测验评分;


public class 测验评分 {

    
    public static void main(String[] args) {
        char [][] answers = {
            {'A','B','A','C','C','D','E','E','A','D'},
            {'D','B','A','B','C','A','E','E','A','D'},
            {'E','D','D','A','C','B','E','E','A','D'},
            {'C','B','A','E','D','C','E','E','A','D'},
            {'A','B','D','C','C','D','E','E','A','D'},
            {'B','B','E','C','C','D','E','E','A','D'},
            {'B','B','A','C','C','D','E','E','A','D'},
            {'E','B','E','C','C','D','E','E','A','D'}
        };
        char [] keys = {'D','B','D','C','C','D','A','E','A','D'};
        int[][] B = new int[2][10];
        for(int i = 0;i< answers.length;i++){
            int correctCount = 0;
            for(int j = 0;j<answers.length;j++)
                if(answers[i][j] == keys[j]){
                    correctCount++;
                }
            B[0][i] = i;
            B[1][i] = correctCount;
        }
        int s,t;
       for(int i=0;i<10;i++){
           s=i;
           for(int j=i+1;j<10;j++)
               if(B[1][s]>B[1][j])
                   s=j;
           if(s!=i){
               t=B[1][s];
               B[1][s]=B[1][i];
               B[1][i]=t;
           }
       }
       for(int y = 0;y<2;y++){
           for(int u = 0;u<10;u++)
                System.out.println (B[y][u]);
       }
    }
}
