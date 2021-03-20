package au.edu.unsw.business.infs2605.fxstarterkit;

import java.io.IOException;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class CreateNewController {
    
    ObservableList<String> personalReasonList = FXCollections.observableArrayList("Yes", "No");
    ObservableList<String> businessReasonList = FXCollections.observableArrayList("Yes", "No");
    
    
    @FXML
    private TextField txtName;
    
    @FXML
    private TextField txtDob;
    
    @FXML
    private Button btnCreateNew;
    
    @FXML
    private Button btnCancel;
    
    @FXML
    private ChoiceBox choicePersonal;
    
    @FXML 
    private ChoiceBox choiceBusiness;
    
    @FXML
    private void initialize(){
        choicePersonal.setValue("");
        choicePersonal.setItems(personalReasonList);
        
        choiceBusiness.setValue("");
        choiceBusiness.setItems(businessReasonList);
    }
    @FXML
    private void userDidCreatePerson() throws IOException {
        String name = txtName.getText();
        String dob = txtDob.getText();
        String personalRsn = choicePersonal.getSelectionModel().getSelectedItem().toString();
        String businessRsn = choiceBusiness.getSelectionModel().getSelectedItem().toString();
        
        ContactPerson newPerson = new ContactPerson(name, dob, personalRsn, businessRsn);
        DataHelper.myContacts.add(newPerson);
        
        Alert a = new Alert(AlertType.NONE);
        
        EventHandler<ActionEvent> event1 = new
                EventHandler<ActionEvent>(){
        public void handle(ActionEvent e) {
            a.setAlertType(AlertType.INFORMATION);
            a.setContentText("Successfully added contact!");
            a.show();
                       }
                   };
         btnCancel.setOnAction(event1);
        App.setRoot("MasterDetail");
    }
    
    @FXML
    private void userExitsWindow() throws IOException {
        App.setRoot("MasterDetail");
    }
}