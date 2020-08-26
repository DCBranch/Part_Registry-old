/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part_Registry.FXMLDocumentControllers;

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

/**
 * FXML Controller class for main window
 *
 * @author DCoreB
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
    private TextField txt_NewEntry_Replacement;
    @FXML
    private Label lbl_NewEntry_UsesLeft;
    @FXML
    private TextField txt_NewEntry_UsesLeft;
    @FXML
    private Button btn_NewEntry_Enter;
    @FXML
    private Button btn_NewEntry_Cancel;
    @FXML
    private RadioButton rad_NewEntry_Expendable;
    @FXML
    private RadioButton rad_NewEntry_Consumable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
