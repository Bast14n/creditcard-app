package pl.surowka.creditcard;

class CreditCard{
    
    private boolean status;
    
    public void assignLimit(double money){
        
    }
    
    public double getLimit(){
        
        return 2000;
    }
    
    public void block(){
        this.status = true;
        
        
    }
    
    public boolean isBlocked(){
        return this.status;
        
        
    }
    
}