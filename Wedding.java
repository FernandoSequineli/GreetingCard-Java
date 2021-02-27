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
public class Wedding extends CardTemplate {

    @Override
    public void peopleDetails(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        
    }

    @Override
    public void initialise() {
        msgSalutation = new ArrayList <String>();
        msgSalutation.add("Congratulations to the wonderful two of you!");
        msgSalutation.add("Congratulations!");
        msgSalutation.add("Congratulations on tying the knot");
        
        msgVerses = new ArrayList<String>();
        msgVerses.add("Above all, love each other deeply, because love covers over a multitude of sins.");
        msgVerses.add("Love must be sincere. Hate what is evil; cling to what is good");
        msgVerses.add("And now these three remain: faith, hope and love. But the greatest of these is love");

        msgClosing = new ArrayList<String>();
        msgClosing.add("Congratulations to the wonderful two of you!");
        msgClosing.add("So happy for you!");
        msgClosing.add("Congratulations! Love you both!");
        
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
