package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

/**
 * Part_Registry - Launches the standalone application Part Registry using the 
 * FXMLLoader to load the Main Window FXML document. Application allows for the 
 * entry, searching, and deletion of Part items, including expendables 
 * and consumables. Based upon James Noyes(professor)' PartTest class.
 * 
 * @author Dawson C. Branch
 * @version 2.0.1
 * @since 1.0.0
 * 
 * Possible updates:
 * 
 *  Part Editing (IN-PROGRESS)
 * 
 *  Add a real-time iteration aspect of the program to simulate a
 *  system using and replacing part. One possible method of doing this is having 
 *  the program iterate in real-time and, during each iteration, each consumable 
 *  part gets their number of uses decremented and expendable parts are randomly 
 *  determined to pass the iteration or fail during the iteration, resulting in a
 *  part failure. The replacements, if any, could be handled automatically with 
 *  a message left behind for the part or via a another pop-up interface giving 
 *  users the option to decommission the part and continue or put in a order for a 
 *  replacement, note the cost, and continue running.
 * 
 *  Add start dates and times for all parts
 * 
 *  Add failure dates and times for all expendable parts
 * 
 *  Consolidate methods by extracting broadly applicable methods or processes 
 *  placing them in the main class
 *   exit(ActionEvent event)
 * 
 *  Update toString() methods in parts
 *   Possibly usable in part editing as a method of storing and converting data 
 *   in a consistent manner
 * 
 */
public class Part_Registry extends Application {
    
    /**
     * Start - Entry point for JavaFX applications
     * 
     * @param stage - Main stage scene
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Part Registry");
        stage.resizableProperty().setValue(Boolean.FALSE);
        stage.show();
        
    }
    
    /**
     * main - Launches the standalone application Part_Registry. Returns upon 
     * app's closure.
     * 
     * @param args - inputted arguments from command line
     */
    public static void main(String [] args)
    {
        launch(args);
    }
    
    /**
     * turnOffGUI - Disables and turns off the visibility of select part of a 
     * GUI, a control
     * 
     * @param gui_Name - Control, piece of GUI, to be turned off
     */
    public static void turnOffNode(Node gui_Name) {
        gui_Name.setDisable(true);
        gui_Name.setVisible(false);
    }
    
    /**
     * turnOffGUI - Enables and turns on the visibility of select part of a GUI, 
     * a control
     * 
     * @param gui_Name - Control, piece of GUI, to be turned on
     */
    public static void turnOnNode(Node gui_Name) {
        gui_Name.setDisable(false);
        gui_Name.setVisible(true);
    }
}