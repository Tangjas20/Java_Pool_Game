package java_pool_game;

public class WhiteAndCreatorBall extends Ball implements BallBuilderAndCreator {
    public String colour = "WHITE";

    public WhiteAndCreatorBall(Double x, Double y, Long radius, Double velocityX, Double velocityY, Double mass){
        super(x, y, radius, velocityX, velocityY, mass);
        this.lives = 1;
    }
    public String return_colour(){
        return this.colour;
    }

}
