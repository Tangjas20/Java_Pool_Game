package java_pool_game;

public class BlueAndCreatorBall extends Ball implements BallBuilderAndCreator {

    public String colour = "BLUE";

    public BlueAndCreatorBall(Double x, Double y, Long radius, Double velocityX, Double velocityY, Double mass){
        super(x, y, radius, velocityX, velocityY, mass);
        this.lives = 2;
    }

    public String return_colour(){
        return this.colour;
    }

    public void loseBallLife(){
        this.lives += -1;
        this.posX = initialX;
        this.posY = initialY;
    }

    public int getLives(){
        return this.lives;
    }


}