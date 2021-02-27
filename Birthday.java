import java.util.ArrayList;

public class Birthday extends CardTemplate {
     
    @Override
    public void peopleDetails(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;
        
    }

    @Override
    public void initialise() {
        msgSalutation = new ArrayList <String>();
        msgSalutation.add("Happy, happy birthday!");
        msgSalutation.add("Warmest wishes for a happy birthday");
        msgSalutation.add("Happy Birthday");
        
        msgVerses = new ArrayList<String>();
        msgVerses.add("May your birthday bring\n" +
                      "You as much happiness\n" +
                      "As you give to everyone\n" +
                       "Who knows you");
        
        msgVerses.add("A greeting on your birthday\n" +
                       "For a very happy day\n" +
                       "And then a year\n" +
                       "That brings the best\n" +
                       "Of everything your way\n" +
                       "Enjoy your special day!");
        
        msgVerses.add("Hope lovely surprises\n" +
                        "Are coming your way,\n" +
                        "To make your\n" +
                        "Birthday a\n" +
                        "Wonderful day.");

        msgClosing = new ArrayList<String>();
        msgClosing.add("Best wishes!,");
        msgClosing.add("Gratefully,");
        msgClosing.add("With love,");
        
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
