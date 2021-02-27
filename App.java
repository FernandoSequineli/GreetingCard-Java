
public class App {
    public static void main(String[] args) {

        
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
