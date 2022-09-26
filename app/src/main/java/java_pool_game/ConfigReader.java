package java_pool_game;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConfigReader {
    //Read board configuration, create text based board, return matrix array.
    //Read x and y coordinates, colour of board, friction value
    private Long tableY;
    private Long tableX;
    private String tableColour;
    private double friction_value;
    private String path;
    private ArrayList<Ball> ball_array = new ArrayList<>();
    private Long radius;
    public ConfigReader(){
        this.path = System.getProperty("user.dir") + "/src/main/resources/config.json";
    }
    public ConfigReader(String path){
        this.path = System.getProperty("user.dir") + "/src/main/resources/" + path;
    }

    public void parse(){
        JSONParser parser = new JSONParser();

        try{
            Object object = parser.parse(new FileReader(path));

            // convert Object to JSONObject
            JSONObject jsonObject = (JSONObject) object;

            // reading the Table section:
            JSONObject jsonTable = (JSONObject) jsonObject.get("Table");

            // reading a value from the table section
            tableColour = (String) jsonTable.get("colour");
            tableX = (Long) ((JSONObject) jsonTable.get("size")).get("x");
            tableY = (Long) ((JSONObject) jsonTable.get("size")).get("y");
            System.out.println(tableX);
            if (tableX > tableY){
                radius = tableX/40;
            }
            else {
                radius = tableY/40;
            }
            // getting the friction level.
            // This is a double which should affect the rate at which the balls slow down
            Double tableFriction = (Double) jsonTable.get("friction");
            System.out.println("Table colour: " + tableColour + ", x: " + tableX + ", y: " + tableY + ", friction: " + tableFriction);
            // reading the "Balls" section:
            JSONObject jsonBalls = (JSONObject) jsonObject.get("Balls");

            // reading the "Balls: ball" array:
            JSONArray jsonBallsBall = (JSONArray) jsonBalls.get("ball");

            // reading from the array:
            for (Object obj : jsonBallsBall) {
                JSONObject jsonBall = (JSONObject) obj;

                // the ball colour is a String
                String colour= (String) jsonBall.get("colour");
                // the ball position, velocity, mass are all doubles
                Double positionX = (Double) ((JSONObject) jsonBall.get("position")).get("x");
                Double positionY = (Double) ((JSONObject) jsonBall.get("position")).get("y");
                Double velocityX = (Double) ((JSONObject) jsonBall.get("velocity")).get("x");
                Double velocityY = (Double) ((JSONObject) jsonBall.get("velocity")).get("y");

                Double mass = (Double) jsonBall.get("mass");
                if (colour.toUpperCase().equals("BLUE")) {
                    BlueBall ball = new BlueBall(positionX, positionY, radius, velocityX, velocityY);
                    ball_array.add(ball);
                }
                else if (colour.toUpperCase().equals("RED")) {
                    RedBall ball = new RedBall(positionX, positionY, radius, velocityX, velocityY);
                    ball_array.add(ball);
                }
                else if (colour.toUpperCase().equals("WHITE")){
                    WhiteBall ball = new WhiteBall(positionX, positionY, radius, velocityX, velocityY);
                    ball_array.add(ball);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    public ArrayList<Ball> returnBalls(){
        return ball_array;
    }

    public Long boardX(){
        return tableX;
    }

    public Long boardY(){
        return tableY;
    }

    public String returnBoardColour(){
        return this.tableColour.toUpperCase();
    }



    public static void main(String[] args) {
    }
}
