package java_pool_game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Circle;

import java.util.List;

public class Balls implements ShapeCreator{
    public Double posX;
    public Double posY;
    public String colour;
    public Long radius;
    public Double velocityX;
    public Double velocityY;

    public Balls(Double x, Double y, Long radius, String colour, Double velocityX, Double velocityY){
        this.posX = x;
        this.posY = y;
        this.colour = colour;
        this.radius = radius;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    @Override
    public void draw(GraphicsContext gc) {

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