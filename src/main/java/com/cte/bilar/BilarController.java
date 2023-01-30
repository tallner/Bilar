package com.cte.bilar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BilarController {
    @CrossOrigin()
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseEntity<?> health() throws Exception {
        try {
            return ResponseEntity.status(200).body("Ok");
        } catch (Exception e) {
            return (ResponseEntity<?>) ResponseEntity.internalServerError().body(e.getMessage());
        }
}

    @GetMapping(value = "/car")
    @CrossOrigin()
    public List<Bilar> getAll(){
        var l = new ArrayList<Bilar>();

        l.add(new Bilar("namn", "modell", "color", 1995,2));
        l.add(new Bilar("namn1", "modell1", "color1", 1996,4));
        l.add(new Bilar("namn2", "modell2", "color2", 1997,6));
        l.add(new Bilar("namn3", "modell3", "color3", 1998,8));
        return l;
    }

}
