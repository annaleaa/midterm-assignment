/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.business.infs2605.fxstarterkit;

import java.util.List;

/**
 *
 * @author Anna
 */
public class ContactPerson {
    private String name;
    private String dob;
    private String personalRsn;
    private String businessRsn;
    private List<String> caseNotes;

    public ContactPerson(List<String> caseNotes) {
        this.caseNotes = caseNotes;
    }

    public ContactPerson(String name, String dob, String personalRsn, String businessRsn) {
        this.name = name;
        this.dob = dob;
        this.personalRsn = personalRsn;
        this.businessRsn = businessRsn;
    }
    
    

    public String getName() {
        return name;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the personalRsn
     */
    public String getPersonalRsn() {
        return personalRsn;
    }

    /**
     * @param personalRsn the personalRsn to set
     */
    public void setPersonalRsn(String personalRsn) {
        this.personalRsn = personalRsn;
    }

    /**
     * @return the businessRsn
     */
    public String getBusinessRsn() {
        return businessRsn;
    }

    /**
     * @param businessRsn the businessRsn to set
     */
    public void setBusinessRsn(String businessRsn) {
        this.businessRsn = businessRsn;
    }
    
    public String toString(){
        return this.getName();
    }

    /**
     * @return the caseNotes
     */
    public List<String> getCaseNotes() {
        return caseNotes;
    }

    /**
     * @param caseNotes the caseNotes to set
     */
    public void setCaseNotes(List<String> caseNotes) {
        this.caseNotes = caseNotes;
    }
    }
     
    

