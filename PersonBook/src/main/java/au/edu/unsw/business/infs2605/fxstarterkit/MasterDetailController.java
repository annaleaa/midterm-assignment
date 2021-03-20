package au.edu.unsw.business.infs2605.fxstarterkit;


import static au.edu.unsw.business.infs2605.fxstarterkit.DataHelper.myContacts;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MasterDetailController{


    
    @FXML
    public ListView<ContactPerson> masterListView;
    
    @FXML 
    private Button btnAdd;
    
    @FXML 
    private Label lblFullName;
    
    @FXML
    private Button btnEdit;
    
    @FXML
    private Label lblDob;
    
    @FXML
    private Label lblPersonal;
    
    @FXML
    private Label lblBusiness;

    
    @FXML 
    private void initialize(){
        if (DataHelper.myContacts.size() > 0 ){
           
            for (ContactPerson thisPerson: myContacts){
            masterListView.getItems().add(thisPerson);
          }
        
        }
        lblFullName.setText("Anna Liu");
        lblDob.setText("08/12/2000");
        lblPersonal.setText("Yes");
        lblBusiness.setText("No");
    }


    @FXML
    public void userClicksList(){
       ContactPerson selectedPerson = masterListView.getSelectionModel().getSelectedItem();
       lblFullName.setText(selectedPerson.getName());
       lblDob.setText(selectedPerson.getDob());
       lblPersonal.setText(selectedPerson.getPersonalRsn());
       lblBusiness.setText(selectedPerson.getBusinessRsn());
       
    }
    
    @FXML
    public void userClicksAdd() throws IOException{
        App.setRoot("CreateNew");
       
    }
    @FXML
    public void userClicksEdit() throws IOException{
        
        App.setRoot("EditContact");
        
    }
    
}
