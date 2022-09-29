package java_pool_game;

public interface BallBuilderAndCreator {
    public String return_colour();
    public Double getX();
    public Double getY();
    public void setVelocityX(Double velX);
    public void setVelocityY(Double velY);
    public Double getVelocityX();
    public Double getVelocityY();
    public void setX(Double x);
    public void setY(Double y);
    public Long getRadius();
    public Double getMass();
    public int getLife();
    public void loseLife();

}
