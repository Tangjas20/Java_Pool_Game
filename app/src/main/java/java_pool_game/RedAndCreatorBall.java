package java_pool_game;

public class RedAndCreatorBall extends Ball implements BallBuilderAndCreator {

    public String colour = "RED";


    public RedAndCreatorBall(Double x, Double y, Long radius, Double velocityX, Double velocityY, Double mass){
        super(x, y, radius, velocityX, velocityY, mass);
        this.lives = 1;
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