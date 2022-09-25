package java_pool_game;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Circle;

public class Balls {
    private int x;
    private int y;
    private char colour;
    private Circle circle;
    private int radius;

    public Balls(int x, int y, int radius, char colour){
        this.x = x;
        this.y = y;
        this.colour = colour;
        this.radius = radius;

    }
    public void initialiseBall(){
        Circle circle = new Circle(x, y, radius);


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