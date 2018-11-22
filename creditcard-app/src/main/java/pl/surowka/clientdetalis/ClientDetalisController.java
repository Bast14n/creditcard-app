package pl.surowka.clientdetalis;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/clients")
public class ClientDetalisController {
    
    @Autowired
    ClientDetalisRepository repo;
    
    
    @RequestMapping("/all")
    public List<ClientDetalis> getAll(){
        
        
        return repo.get();
    }
    
    @PostMapping("/add")
    public void create(@RequestBody ClientDetalis client){
        repo.put(client);
        
        
    }
    
    
    
}