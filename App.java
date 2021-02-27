/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingcard;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        CardTemplate c = new Christmas();
        CardTemplate w = new Wedding();
        CardTemplate b = new Birthday();
        
        System.out.println("Enter a sender:");
        String sender = sc.next();
        System.out.println("Enter a receiver:");
        String receiver = sc.next();
        
        
        
        //w.genCard(sender, receiver);
        //c.genCard(sender, receiver);
        b.genCard(sender, receiver);
    }
    
}
