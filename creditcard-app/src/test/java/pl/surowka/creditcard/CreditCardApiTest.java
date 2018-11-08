package pl.surowka.creditcard;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardApiTest{
    private final static double initialCredit=200;
    private final static String cardNumber= "123456789";
    private CreditCardApi api;
    private CreditCardPool creditCardPool;

    
    @Test
    public void handleWithDraw(){
        thereIsCreditCardPool();
        thereIsCreditCardApi();
        thereIsCardWithNumber();
        
        api.withdraw(cardNumber, 20);
        
        saldoOfCreditCardWithIdEquals(cardNumber, 180);
    }
    
    private void thereIsCreditCardApi(){
        this.api = new CreditCardApi();
    }
    
    private void thereIsCardWithNumber(){
        CreditCard card = creditCardPool.find(cardNumber);
        card.assignLimit(initialCredit);
        
    }
    
    private void saldoOfCreditCardWithIdEquals(String cardNumber, double expectedBalance){
        Assert.assertTrue(
            card.getBalance() ==expectedBalance
            
            );
    }
    
    private void thereIsCreditCardPool(){
        this.creditCardPool = new CreditCardPool ();
    }
    
}