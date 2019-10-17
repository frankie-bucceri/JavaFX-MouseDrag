//JavaFXKeyMouseDrag.java
// how to key pressed event to drag a circle to javaFX using mouse events

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class JavaFXMouseDragBall extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage pStage)
   {
   //Scene size constants
      final double SWIDTH = 200.0;
      final double SHEIGHT = 200.0;
   // Circle constants
      final double STARTX = 100.0;
      final double STARTY = 40.0;
      final double RADIUS = 40.0;
      final double STEP = 10.0;
   
   // Create the circle
      Circle ball = new Circle(STARTX, STARTY, RADIUS);
      ball.setFill(Color.RED); 
   // Register an event handler for the mouse dragged event
      ball.setOnMouseDragged(
         event ->
         {
            //get the mosue cursor coordinates
            double x = event.getSceneX();
            double y = event.getSceneY();
            //Move the circle
            ball.setCenterX(x);
            ball.setCenterY(y);
         }); //end event handler
         
         // Add the cirlce to the pane, create the scene and display it
      Pane pane = new Pane(ball);
      Scene scene = new Scene(pane, SWIDTH, SHEIGHT);
      pStage.setScene(scene);
      pStage.setTitle("Moving a Circle with Mouse Dragged Event");
      pStage.show();
   
   } //endstart
} //end class