package com.ttn.Bootcamp22project.entities.user;

import javax.persistence.*;

@Entity
public class Seller extends User {
    /*
    USER_ID
    GST
    COMPANY_CONTACT
    COMPANY_NAME
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;
    String gst;
    String companyContact;
    String companyName;

    @OneToOne(mappedBy = "customer")
    User user;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGst() {
        return gst;
    }

    public void setGst(String gst) {
        this.gst = gst;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
