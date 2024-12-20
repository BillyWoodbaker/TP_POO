package utils;

import java.util.Random;

public class DiceRoller {
    private static final Random RANDOM = new Random();

    public static int rollD20() {
        return RANDOM.nextInt(20) + 1;
    }
}
