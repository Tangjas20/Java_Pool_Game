package java_pool_game;

import java.util.ArrayList;

public class GeneratePockets {


    public static ArrayList<Pockets> GeneratePocketList(Long boardX, Long boardY, Long radius){
        ArrayList<Pockets> GeneratedPocketList = new ArrayList<>();
        //Find coordinates of each corner
        //Bottom Right + margin
        Pockets pocketBottomRight = new Pockets(boardX-radius, boardY-radius, radius);
        GeneratedPocketList.add(pocketBottomRight);
        //Top Right
        //System.out.println("BoardX = " + boardX);
        Pockets pocketTopRight = new Pockets(boardX-radius, 0L+ radius, radius);
        GeneratedPocketList.add(pocketTopRight);

        //Top Left
        Pockets pocketTopLeft = new Pockets(0L+radius, 0L+radius, radius);
        GeneratedPocketList.add(pocketTopLeft);

        //BottomLeft
        Pockets pocketBottomLeft = new Pockets(0L+radius, boardY-radius, radius);
        GeneratedPocketList.add(pocketBottomLeft);

        //Top Middle
        Pockets pocketTopMiddle = new Pockets(boardX/2+radius/2, 0L+radius, radius);
        GeneratedPocketList.add(pocketTopMiddle);

        //Bottom Middle
        Pockets pocketBottomMiddle = new Pockets(boardX/2+radius/2, boardY-radius, radius);
        GeneratedPocketList.add(pocketBottomMiddle);

        return GeneratedPocketList;
    }

    public static void main(String[] args){

    }


}

