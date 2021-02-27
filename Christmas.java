/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingcard;

import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Christmas extends CardTemplate {
     
    
    @Override
    public void peopleDetails(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        
    }

    @Override
    public void initialise() {
        msgSalutation = new ArrayList <String>();
        msgSalutation.add("Merry Christmas and a Happy New Year!");
        msgSalutation.add("Wishing you a very Merry Christmas.");
        msgSalutation.add("Merry Christmas");
        
        msgVerses = new ArrayList<String>();
        msgVerses.add("Faith makes all things possible, Hope makes all things work, \nLove makes all things beautiful,/nMay you have all the three for this Christmas.");
        msgVerses.add("Sharing with you the Glory, the Wonder, the Miracle of this Holy Season.\nHave a blessed Christmas and New Year.");
        msgVerses.add("Christmas, a special time of worshipping our King. \nMay the blessing of knowing Christ enrich your life in the year 2021");

        msgClosing = new ArrayList<String>();
        msgClosing.add("Have your best Christmas ever!");
        msgClosing.add("Merry Christmas with lots of love");
        msgClosing.add("I hope your holiday season is full of good things");
        
    }

    @Override
    public void salutation() {
       
       String s = msgSalutation.get((int)Math.floor(Math.random()*msgSalutation.size()));
        System.out.println("\n\n\n- - - - - - - - - - - - - - - - ");
        System.out.println(s +"\n\nFor " +this.receiver);
        System.out.println("- - - - - - - - - - - - - - - - ");
    }

    @Override
    public void verse() {
        String v = msgVerses.get((int)Math.floor(Math.random()*msgVerses.size()));
        System.out.println("\n"+v);
        System.out.println("\n- - - - - - - - - - - - - - - - ");
    }

    @Override
    public void closing() {
       String c = msgClosing.get((int)Math.floor(Math.random()*msgClosing.size()));
        System.out.println(c +"\n\nFrom: "+sender);
    }
    
}
