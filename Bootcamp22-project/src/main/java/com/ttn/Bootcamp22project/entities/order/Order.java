package com.ttn.Bootcamp22project.entities.order;

import com.ttn.Bootcamp22project.entities.user.Address;
import com.ttn.Bootcamp22project.enums.Status;

import java.util.Date;

public class Order {

    /*

        ID
        CUSTOMER_USER_ID
        AMOUNT_PAID
        DATE_CREATED
        PAYMENT_METHOD
        CUSTOMER_ADDRESS_CITY
        CUSTOMER_ADDRESS_STATE
        CUSTOMER_ADDRESS_COUNTRY
        CUSTOMER_ADDRESS_ADDRESS_LINE
        CUSTOMER_ADDRESS_ZIP_CODE
        CUSTOMER_ADDRESS_LABEL (Ex. office/home)

     */

    int id;
    int customerUserId;
    long amountPaid;
    Date dateCreated;
    Status paymentMethod;
    Address customerAddress;


}
