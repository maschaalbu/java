import java.util.Random;

public class RollGame {

    public static void main(String args[]) {

        int rolls = 5;
        int spaces = 20;
        int spaceSum = 0;

        Random random = new Random();

        for (int i = 1; i <= rolls; i++) {

            int die = random.nextInt(6) + 1;

            spaceSum += die;
            int toGo = spaces - die;
            spaces = toGo;

            if (spaceSum < 20 && i < 5) {

                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + spaceSum
                        + " and have " + toGo + " more to go.");
            } else if (spaceSum == 20 && i == 5) {

                System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are now on space " + 20
                        + ". Congrats, you win!");

            } else {
                System.out.println("Roll #" + i + ": You've rolled a " + die + ". Sorry, you lose.");
            }

        }

    }
}
