package Java_playground.java_test.Lab1.MPDiceLab;
import java.util.Random;

public class Die {
    int currentValue;
    int maxDiceValue;
    private Random rand = new Random();

    Die(int maxDiceValue) { // constructor.
        this.maxDiceValue = maxDiceValue;
    }

    public void roll() { // Rolls dice method. 1-6. When called updates currentvalue variable to a new random value.
        this.currentValue = rand.nextInt(this.maxDiceValue) + 1;
    }

    public int getMaxDie() { //getter of the max sides a dice can have. ((IS THIS NEEDED?))
        return maxDiceValue;
    }
    public int getCurrentValue() { // returns current value of dice roll when called.
        return currentValue;
    }

}