package pl.surowka.clientdetalis;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDetalisRepository{
    
    private List<ClientDetalis> repo = new ArrayList<>();
        
        
    
    public List<ClientDetalis> get(){
        
        return repo;
        
    }
    
    
    public void put(ClientDetalis client){
        repo.add(client);
        
        
    }
    
    
    
}