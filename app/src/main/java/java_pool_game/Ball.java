package java_pool_game;

import javafx.scene.canvas.GraphicsContext;

public class Ball {
    public Double posX;
    public Double posY;
    public Long radius;
    public Double velocityX;
    public Double velocityY;
    public Double initialX;
    public Double initialY;
    public String colour;

    public Ball(Double x, Double y, Long radius, Double velocityX, Double velocityY){
        this.posX = x;
        this.posY = y;
        this.radius = radius;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.initialX = x;
        this.initialY = y;
    }

    public String return_colour(){
        return this.colour;
    }

    public Double getX(){
        return this.posX;
    }

    public Double getY(){
        return this.posY;
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