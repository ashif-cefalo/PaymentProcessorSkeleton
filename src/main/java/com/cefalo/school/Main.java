package com.cefalo.school;

import com.cefalo.school.instrument.Cheque;
import com.cefalo.school.instrument.DebitCard;
import com.cefalo.school.instrument.Instrument;
import com.cefalo.school.processor.PaymentProcessor;

public class Main {
    public  static  void main(String[] args){
        Instrument card= new DebitCard();
        Instrument cheque = new Cheque();



        try{
            card.getPaymentProcessor().process(card, 100);
            cheque.getPaymentProcessor().process(cheque, 200);
        }catch (Exception ex){

        }

    }
}
