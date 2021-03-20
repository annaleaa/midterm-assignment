/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.business.infs2605.fxstarterkit;

import static au.edu.unsw.business.infs2605.fxstarterkit.DataHelper.myContacts;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Anna
 */
public class EditContactController {
    
    ObservableList<String> personalReasonList = FXCollections.observableArrayList("Yes", "No");
    ObservableList<String> businessReasonList = FXCollections.observableArrayList("Yes", "No");
    
    
    @FXML
    private TextField etxtName;
    
    @FXML
    private TextField etxtDob;
    
    @FXML
    private ChoiceBox echoicePersonal;
    
    @FXML
    private ChoiceBox echoiceBusiness;
    
    @FXML 
    private Button ebtnUpdate;
    
    @FXML
    private Button ebtnCancel;
    
    @FXML
    public void initialize(){
        
     
  
    }
    
    
    @FXML
    public void updateContact(){
        String name = etxtName.getText();
        String dob = etxtDob.getText();
        String personalRsn = echoicePersonal.getSelectionModel().getSelectedItem().toString();
        String businessRsn = echoiceBusiness.getSelectionModel().getSelectedItem().toString();
        
        ContactPerson updatedPerson = new ContactPerson(name, dob, personalRsn, businessRsn);
            
        }
    
    
    @FXML
    private void userExitsScreen() throws IOException {
        App.setRoot("MasterDetail");
    }
}
