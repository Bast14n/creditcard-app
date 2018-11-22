package pl.surowka.creditcard;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

@RestController
@RequestMapping("/api/cards")
class CreditCardController {
    
    
   // CreditCardApi api;
    /*
    
    @Autowired
    public CreditCardController(CreditCardApi api){
        this.api = api;
    }*/
    
    @RequestMapping("/{number}")
    public String cardBallance(@PathVariable String number){
        return String.format("Card with number %s : %s",number,"200 zł");
    }
    
    /*
    @PostMapping("/{number}/{money}")
    public void withdraw(@PathVariable String number, @PathVariable double money){
        
        api.withdraw(number,money);
        
    }
    */
}