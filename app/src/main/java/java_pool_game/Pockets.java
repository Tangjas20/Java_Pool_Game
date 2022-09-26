package java_pool_game;

public class Pockets {
    private Long posX;
    private Long posY;
    private Long radius;

    public Pockets(Long x, Long y, Long radius){
        this.posX = x;
        this.posY = y;
        this.radius = radius;
    }

    public Long getX(){
        return this.posX;
    }

    public Long getY(){
        return this.posY;
    }

    public Long getRadius(){
        return this.radius;
    }
}
