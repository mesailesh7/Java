import java.util.Random;
public class ArithemeticOperators {
    public static void main(String[] args) {
        Random rand = new Random();

        boolean isHeads;

        isHeads = rand.nextBoolean();

        if(isHeads){
            System.out.println("Heads you won");
        }
        else {
            System.out.println("Tails you lost");
        }
    }
}
