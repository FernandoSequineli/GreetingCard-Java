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
public abstract class CardTemplate {
    ArrayList<String> msgSalutation;
    ArrayList<String> msgVerses;
    ArrayList<String> msgClosing;
    protected String sender;
    protected String receiver;
   
    
    public abstract void peopleDetails(String sender, String receiver);
    public abstract void initialise();
    public abstract void salutation();
    public abstract void verse();
    public abstract void closing();
    
    
     //defines the order the methods will run in. Final and unchanging
    public final void genCard(String sender, String receiver){
        peopleDetails(sender, receiver);
        initialise();
        salutation();
        verse();
        closing();
    }
    
}
