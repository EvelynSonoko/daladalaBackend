package com.daladala.daladala.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping(path="receipt")
public class ReceiptNo {

    @RequestMapping(path="receiptNo",method = RequestMethod.GET)
    public int generatereceipt(){
       int receiptno= (int)(Math.random()*(50000-10000)+2);
       return receiptno;
    }
}
