/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.business.infs2605.fxstarterkit;

import javafx.fxml.FXMLLoader;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anna
 */
public class DataHelper {
    
       public static ArrayList<ContactPerson> myContacts = new ArrayList<ContactPerson>();
       
       public static void preloadData(){
          ContactPerson example1 = new ContactPerson("Anna Liu", "08/12/2000", "Yes", "No");
          ContactPerson example2 = new ContactPerson("Blair Wang", "02/06/1907", "No", "Yes");
          ContactPerson example3 = new ContactPerson("Yolanda Wang", "10/10/2003", "Yes", "Yes");
        
          DataHelper.myContacts.add(example1);
          DataHelper.myContacts.add(example2);
          DataHelper.myContacts.add(example3);
        }
}
