package com.cefalo.school;

import com.cefalo.school.instrument.*;
import com.cefalo.school.processor.PaymentProcessor;

public class Main {
    public  static  void main(String[] args) throws Exception {
        DebitCard card= new DebitCard("Ebl", "Customer 1", InstrumentType.Card);
        Cheque cheque = new Cheque("Brac", "Customer 2", InstrumentType.Cheque);
        Bkash bkash = new Bkash("BracBkash", "Customer 3", InstrumentType.MobilePayment);
        bkash.setPhoneNumber("01231312");

//        PaymentProcessor processor = new PaymentProcessor(card);
//        PaymentProcessor processor = new PaymentProcessor(cheque);
        PaymentProcessor processor = new PaymentProcessor(bkash);
        try {
            processor.process(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
