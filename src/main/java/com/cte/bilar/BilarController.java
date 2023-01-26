package com.cte.bilar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BilarController {
    @GetMapping(value = "/car")
    @CrossOrigin()
    public List<Bilar> getAll(){
        var l = new ArrayList<Bilar>();

        l.add(new Bilar("namn", "modell", "color", 1995));
        l.add(new Bilar("namn1", "modell1", "color1", 1996));
        l.add(new Bilar("namn2", "modell2", "color2", 1997));
        return l;
    }

}
