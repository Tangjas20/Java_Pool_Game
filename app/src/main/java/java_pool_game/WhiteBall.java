package java_pool_game;

import javafx.scene.canvas.GraphicsContext;

public class WhiteBall extends Ball implements BallInterface{

    public String colour = "WHITE";


    public WhiteBall(Double x, Double y, Long radius, Double velocityX, Double velocityY, Double mass){
        super(x, y, radius, velocityX, velocityY, mass);
    }

    public String return_colour(){
        return this.colour;
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