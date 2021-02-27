import java.util.ArrayList;

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
