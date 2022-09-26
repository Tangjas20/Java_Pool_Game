package java_pool_game;

import javafx.scene.canvas.GraphicsContext;

public class BlueBall extends Ball implements BallInterface{

    public String colour = "BLUE";

    public int lives = 1;

    public BlueBall(Double x, Double y, Long radius, Double velocityX, Double velocityY){
        super(x, y, radius, velocityX, velocityY);
    }

    public String return_colour(){
        return this.colour;
    }

    public void loseBallLife(){
        this.lives += -1;
        this.posX = initialX;
        this.posY = initialY;
    }


}

/*
Circle circle = new Circle(50, 50, 10);
        GraphicsContext cir = canvas.getGraphicsContext2D();
        cir.setFill(Color.BLUE); //Any fill function will use this colour
        cir.fillOval(circle.getCenterX() - circle.getRadius(),
                circle.getCenterY() - circle.getRadius(),
                circle.getRadius() * 2,
                circle.getRadius() * 2);
 */