package pl.surowka.creditcard;

import org.springframework.context.annotation.*;


@Configuration
class CreditCardConfig{

    @Bean
    public void creditCardApi(){
        
        CreditCardPool pool = new CreditCardPool();
        
        CreditCard c1 = new CreditCard("123");
        
        pool.add(c1);
        
        //CreditCardApi api = new CreditCardApi(pool);
        
        //return api;
        
    }    
    
}