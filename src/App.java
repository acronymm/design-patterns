import fabricMethod.*;
import java.util.Scanner;
public class App {

    public static void useFabricMethod() {
        Scanner sn = new Scanner(System.in);

        System.out.println("How would you like to deliver?");
        String input = sn.next();

        switch(input) {
            case "ship":
                new SeaLogistics().planDelivery();
                break;
            case "truck":
                new RoadLogistics().planDelivery();
                break;

            default:
                System.out.println("Unknown delivery type!");
        }
    }

    public static void main(String[] args) throws Exception {
        useFabricMethod();
    }
}
