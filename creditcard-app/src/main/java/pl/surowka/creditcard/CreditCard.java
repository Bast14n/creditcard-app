package pl.surowka.creditcard;

class CreditCard{
    private double balance; 
    private double cardLimit;
    
    public void assignLimit(double money){
    this.balance=money;
    this.cardLimit=money;
        
    }
    
    public double getLimit(){
        
        return 2000;
    }
    
    public void withdraw(double money){
        this.balance-=money;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
}