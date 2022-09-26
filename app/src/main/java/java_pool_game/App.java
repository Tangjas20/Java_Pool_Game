/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_pool_game;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.util.Duration;

import java.util.ArrayList;


public class App extends Application{
    private static final double KEY_FRAME_DURATION = 0.017;
    private ArrayList<Balls> ball_array = new ArrayList<>();
    public App(){

    }
    @Override
    public void start(Stage primaryStage){
        ConfigReader config = new ConfigReader("config.json");
        config.parse();

        Group root = new Group();
        Scene scene = new Scene(root);
        scene.setFill(Paint.valueOf(config.returnBoardColour()));

        primaryStage.setTitle("Assignment_2_Pool_game");
        Canvas canvas = new Canvas(config.boardX(), config.boardY());
        ArrayList<Circle> circ = test();


//https://mkyong.com/javafx/javafx-animated-ball-example/
        //http://www.java2s.com/Code/Java/JavaFX/KeyFrameandTimelinebasedanimation.htm
        primaryStage.setScene(scene);
        root.getChildren().add(canvas);
        root.getChildren().addAll(circ);
        primaryStage.show();

        Bounds bounds = canvas.getBoundsInLocal();
        Timeline animationLoop = new Timeline();
        animationLoop.setCycleCount(Timeline.INDEFINITE);
        KeyFrame frame = new KeyFrame(Duration.seconds(KEY_FRAME_DURATION),
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        int dx = 1;
                        int dy = 1;
                        Circle circle = circ.get(0);
                        Double xMin = circle.getBoundsInParent().getMinX();
                        Double yMin = circle.getBoundsInParent().getMinY();
                        Double xMax = circle.getBoundsInParent().getMaxX();
                        Double yMax = circle.getBoundsInParent().getMaxY();
                        if (xMin < 0 || xMax > scene.getWidth()) {
                            dx = dx * -1;
                        }
                        if (yMin < 0 || yMax > scene.getHeight()) {
                            dy = dy * -1;
                        }

                        circle.setTranslateX(circle.getTranslateX() + dx);
                        circle.setTranslateY(circle.getTranslateY() + dy);

                    }
                });
        animationLoop.getKeyFrames().add(frame);
        animationLoop.play();



    }
    public static void main(String[] args){
        launch(args);

    }

    public static ArrayList<Circle> test(){
        ArrayList<Circle> circles = new ArrayList<Circle>();
        Circle circle = new Circle(60, 60, 5);
        circles.add(circle);
        Circle circle1 = new Circle(50, 50, 20);
        circles.add(circle1);
        return circles;
    }

}
