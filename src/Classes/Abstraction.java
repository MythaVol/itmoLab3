package Classes;

import Enums.Emotions;

public class Abstraction {
    private String name;
    private Emotions emotion;
    private int emotionalStrength;

    public Abstraction(String name, Emotions emotion, int emotionalStrength) {
        this.name = name;
        this.emotion=emotion;
        this.emotionalStrength=emotionalStrength;
    }

    public int getEmotionalStrength() {
        return emotionalStrength;
    }

    public Emotions getEmotion() {
        return emotion;
    }

    public void setEmotionalStrength(int emotionalStrength) {
        this.emotionalStrength = emotionalStrength;
    }
}
