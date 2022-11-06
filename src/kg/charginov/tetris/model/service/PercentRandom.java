package kg.charginov.tetris.model.service;

import java.util.Random;

public class PercentRandom {
    public static int getRandomPercent(){
        Random r = new Random();
        return r.nextInt(100);
    }
}
