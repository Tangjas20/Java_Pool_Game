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
    public Double mass;
    protected int lives;

    public Ball(Double x, Double y, Long radius, Double velocityX, Double velocityY, Double mass){
        this.posX = x;
        this.posY = y;
        this.radius = radius;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.initialX = x;
        this.initialY = y;
        this.mass = mass;
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

    public void setVelocityX(Double velX){
        this.velocityX = velX;
    }

    public void setVelocityY(Double velY){
        this.velocityY = velY;
    }
    public Double getVelocityX(){
        return this.velocityX;
    }

    public Double getVelocityY(){
        return this.velocityY;
    }

    public Double setX(Double x){
        return this.posX = x;
    }

    public Double setY(Double y){
        return this.posY = y;
    }

    public Long getRadius(){
        return this.radius;
    }
    public Double getMass(){
        return this.mass;
    }

    public int getLife(){
        return this.lives;
    }

    public void loseLife(){
        this.lives -= 1;
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