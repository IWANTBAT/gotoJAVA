/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;
public class testtv {
    public static void main(String[] args) {
       tv tv1 = new tv();
       tv1.turnon();
       tv1.setChannel(30);
       tv1.setVolume(3);
       
       tv tv2 = new tv();
       tv2.turnon();
       tv2.channelup();
       tv2.channelup();
       tv2.volumeup();
       
       System.out.println("tv1 's channel is " + tv1.channel +"and volume level is" + tv1.volumel);
       System.out.println("tv2 's channel is" + tv2.channel + "and volume level is" + tv2.volumel);  
    }   
}
 class tv{
    int channel = 1;
    int volumel = 1;
    boolean on = false;
     tv(){
    }
     void turnon(){
        on = true;
    }
     void turnoff(){
        on = false;
    }
     void setChannel( int newChannel){
        if(on && newChannel >= 1&&newChannel <=120)
            channel = newChannel;
    }
     void setVolume(int newVolume){
        if(on && newVolume>=1&&newVolume<=7)
            volumel = newVolume;
    }
     void channelup(){
        if(on && channel < 120)
            channel++;
    }
     void channeldown(){
        if(on && channel >1)
            channel--;
    }
     void volumeup(){
        if(on && volumel <7)
            volumel++;
    }
     void volumedown(){
        if(on && volumel >1)
            volumel--;
    }
}
