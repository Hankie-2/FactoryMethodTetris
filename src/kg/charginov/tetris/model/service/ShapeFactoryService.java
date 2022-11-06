package kg.charginov.tetris.model.service;

import kg.charginov.tetris.model.factory.*;

import java.util.Random;

public class ShapeFactoryService {
    public static ShapeFactory createShapeFactory(){
        Random r = new Random();
        int shape = r.nextInt(7-1)+1;
        if(shape == 1){
            return new BlueRickyFactory();
        }else if(shape == 2){
            return new ClevelandFactory();
        }else if(shape == 3){
            return new HeroFactory();
        }else if(shape == 4){
            return new OrangeRickyFactory();
        }else if(shape == 5){
            return new RhodeIslandFactory();
        }else if(shape == 6){
            return new SmashBoyFactory();
        }else{
            return new TeeweeFactory();
        }
    }
}
