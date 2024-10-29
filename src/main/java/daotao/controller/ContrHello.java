package daotao.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContrHello {
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public ResponseEntity<String> getContent(){
        return new ResponseEntity<>("Hello sơn đẹp zai", HttpStatus.OK);
    }


}
