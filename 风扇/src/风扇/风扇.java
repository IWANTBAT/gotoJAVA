/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 风扇;
public class 风扇 {
    public static void main(String[] args) {
        Fun fun1 = new Fun();
        fun1.setspeed(Fun.fast);
        fun1.setradius(10);
        fun1.setcolor("yellow");
        fun1.seton(true);
        Fun fun2 = new Fun();
        fun2.setspeed(Fun.medium);
        fun2.setradius(5);
        fun2.getcolor();
        fun2.geton();
        fun1.tostring();
        fun2.tostring();  
    }
}
class Fun
{
    public static final int slow = 1;
    public static final int medium = 2;
    public static final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    String color = "blue";
    int getspeed(){
        return speed;
    }
    boolean geton(){
        return on;
    }
    double getradius(){
        return radius;
    }
    String getcolor(){
        return color;
    }
    void setspeed(int newspeed){
        speed = newspeed;
    }
    void seton(boolean newon){
        on = newon;
    }
    void setradius(double newradius){
        radius = newradius;
    }
    void setcolor(String newcolor){
        color = newcolor;
    }
    Fun(){
        
    }
    void tostring(){
        if(geton()){
            System.out.println("风扇速度，颜色和半径分别为："+ getspeed() +"\t"+ getcolor() +"\t"+ getradius());
        }
        else
            System.out.println("fan is off and 颜色和半径为："+ getcolor() +"\t"+ getradius());
    }      
}    