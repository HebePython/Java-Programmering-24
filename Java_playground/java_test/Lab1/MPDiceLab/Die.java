package Java_playground.java_test.Lab1.MPDiceLab;

public class Die {
    private int currentValue;
    private int maxDiceValue;
    private java.util.Random rand = new java.util.Random();

    Die(int maxDiceValue) {
        this.maxDiceValue = maxDiceValue;
    }

    public void roll() {
        this.currentValue = rand.nextInt(this.maxDiceValue) + 1;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    
}
