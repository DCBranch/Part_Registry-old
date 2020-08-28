/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Main.Part_Registry;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Toggle;
import javafx.scene.Node;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class for main window
 *
 * @author Dawson C. Branch
 * @version 1.3.0
 * @since 1.2.0
 */
public class MainWindowController implements Initializable {

    @FXML
    private Pane pne_NewEntry;
    @FXML
    private Label lbl_NewEntry_Name;
    @FXML
    private TextField txt_NewEntry_Name;
    @FXML
    private Label lbl_NewEntry_Number;
    @FXML
    private TextField txt_NewEntry_Number;
    @FXML
    private Label lbl_NewEntry_Ncage;
    @FXML
    private TextField txt_NewEntry_Ncage;
    @FXML
    private Label lbl_NewEntry_Id;
    @FXML
    private TextField txt_NewEntry_Id;
    @FXML
    private Label lbl_NewEntry_FailureRate;
    @FXML
    private TextField txt_NewEntry_FailureRate;
    @FXML
    private Label lbl_NewEntry_LeadTime;
    @FXML
    private TextField txt_NewEntry_LeadTime;
    @FXML
    private Label lbl_NewEntry_ToolsRequired;
    @FXML
    private TextField txt_NewEntry_ToolsRequired;
    @FXML
    private Label lbl_NewEntry_ReplacementCost;
    @FXML
    private TextField txt_NewEntry_ReplacementCost;
    @FXML
    private Label lbl_NewEntry_UsesLeft;
    @FXML
    private TextField txt_NewEntry_UsesLeft;
    @FXML
    private Button btn_NewEntry_Enter;
    @FXML
    private Button btn_NewEntry_Cancel;
    @FXML
    private HBox hbx_Name;
    @FXML
    private HBox hbx_Number;
    @FXML
    private HBox hbx_Ncage;
    @FXML
    private HBox hbx_Id;
    @FXML
    private HBox hbx_FailureRate;
    @FXML
    private HBox hbx_LeadTime;
    @FXML
    private HBox hbx_ToolsRequired;
    @FXML
    private HBox hbx_ReplacementCost;
    @FXML
    private HBox hbx_UsesLeft;
    
    
    
    
    @FXML
    private RadioButton rad_NewEntry_Expendable;
    
    
    @FXML
    private RadioButton rad_NewEntry_Consumable;

    
    /**
     * Initializes the controller class.
     */
    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        ToggleGroup partTypeGroup = new ToggleGroup();
        rad_NewEntry_Consumable.setToggleGroup(partTypeGroup);
        rad_NewEntry_Expendable.setToggleGroup(partTypeGroup);
        System.out.println("init test");
        
        partTypeGroup.selectedToggleProperty().addListener((observable, t, t1) -> entryTab_TypeToggle());  
    }    
    
      @FXML
    void confirmDelete(ActionEvent event) {

    }

    @FXML
    void editPart(ActionEvent event) {

    }

    
    @FXML
    void enterPart(ActionEvent event) {
        
    }

    @FXML
    void exit(ActionEvent event) {

    }

    @FXML
    void searchListing(ActionEvent event) {

    }
    
    /**
     * entryTab_ConsumableSelected - Enables consumable part GUI sections
     */
    private void entryTab_ConsumableSelected() 
    {
        //Enabling consumable part controls
        Part_Registry.turnOnNode(hbx_ReplacementCost);
        Part_Registry.turnOnNode(hbx_UsesLeft);
    }
    
    /**
     * entryTab_ExpendableSelected - Enables expendable part GUI sections
     */
    private void entryTab_ExpendableSelected() 
    {
        //Enabling expendable part controls
        Part_Registry.turnOnNode(hbx_FailureRate);
        Part_Registry.turnOnNode(hbx_LeadTime);
        Part_Registry.turnOnNode(hbx_ToolsRequired);
    }

    /**
     * entryTab_ConsumableSelected - Disabling expendable part GUI sections
     */
    private void entryTab_ExpendableDeselected() 
    {
        //Disabling expendable part controls
        Part_Registry.turnOffNode(hbx_FailureRate);
        Part_Registry.turnOffNode(hbx_LeadTime);
        Part_Registry.turnOffNode(hbx_ToolsRequired);
    }
    
    /**
     * entryTab_ExpendableSelected - Disabling expendable part GUI sections
     */
    private void entryTab_ConsumableDeselected() 
    {
        //Disabling consumable part controls
        Part_Registry.turnOffNode(hbx_ReplacementCost);
        Part_Registry.turnOffNode(hbx_UsesLeft);
    }
    
    /**
     * entryTab_TypeToggle - Enables expendable parts' UI elements and disables 
     * consumable parts' UI elements when the expendable parts radio button is 
     * selected and visa versa when the consumable parts radio button is 
     * selected
     */
    private void entryTab_TypeToggle()
    {
        if(rad_NewEntry_Consumable.isSelected())
        {
            entryTab_ConsumableSelected();
            entryTab_ExpendableDeselected();
        }
        else
        {
            entryTab_ExpendableSelected();
            entryTab_ConsumableDeselected();
        }
    }
}
