package java_pool_game;

import java.util.ArrayList;
import java.util.List;

public class OperationRemoveBalls implements Strategy {
    @Override
    public List<Ball> doOperation(List<Ball> ballList){
        List<Ball> ball2 = new ArrayList<>();
        for (Ball ballTemp : ballList){
            if (!(ballTemp.getLife() == 0)){
                ball2.add(ballTemp);
            }
        }
        return ball2;
    }
}
