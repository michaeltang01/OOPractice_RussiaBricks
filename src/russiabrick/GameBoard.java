package russiabrick;
import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.paint.*;
//import javafx.scene.canvas.*;
import javafx.scene.*;
import javafx.scene.input.KeyCode;  
import javafx.scene.input.KeyEvent;
import javafx.event.*;

public class GameBoard extends Application {

	@Override
    public void start(Stage primaryStage) {
		
		// Add 2 rectangles for demo
        Rectangle block_demo = new Rectangle();
        block_demo.setX(50);
        block_demo.setY(50);
        block_demo.setWidth(30);
        block_demo.setHeight(30);
        block_demo.setFill(Color.WHITE);
        block_demo.setStroke(Color.BLACK);

        Rectangle block_demo1 = new Rectangle();
        block_demo1.setX(80);
        block_demo1.setY(50);
        block_demo1.setWidth(30);
        block_demo1.setHeight(30);
        block_demo1.setFill(Color.BLACK);
        block_demo1.setStroke(Color.BLACK);
        
        Group root = new Group();
        root.getChildren().add(block_demo);
        root.getChildren().add(block_demo1);

        // Add event handler for key pressed in scene
        Scene scene = new Scene(root, 300, 400);
        scene.setOnKeyReleased(new EventHandler<KeyEvent> () {
			@Override
			public void handle(KeyEvent event) {
				System.out.println(" Key Released!" + event.getCode());  
				if (event.getCode() == KeyCode.UP) {  
					System.out.println("    You pressed UP!");  
				}
			}
        }); 


        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
