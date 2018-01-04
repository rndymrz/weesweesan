package com.rdy;

import com.rdy.model.Address;
import com.rdy.model.Family;
import com.rdy.model.MathResult;
import com.rdy.model.Person;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PersonRestController {
    
    @RequestMapping(value="/aperson.json")
    public Person getPerson(@RequestParam("uuid") String uuid) {
        System.out.println("UUID = "+uuid);
        Person p = new Person();
        p.setName("Roberto");
        p.setJob("Coach");
        p.setDob(new Date());
        return p;
    }
    
    @RequestMapping(value="/envelopedperson.json")
    public ResponseEntity<Person> getEnvelopedPerson (@RequestParam(value="uuid") String uuid){
        System.out.println("UUID = "+uuid);
        
        Person p = new Person();
        p.setName("Roberto");
        p.setJob("Coach/Manager");
        p.setDob(new Date());
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Company", "Iglooo");
        return new ResponseEntity<Person>(p, responseHeaders, HttpStatus.IM_USED);
        
    }
            
    
    @RequestMapping(value="/allperson.json")
    public List<Person> getAllPerson() {
        List<Person> all = new ArrayList<>();
        all.add(new Person("Jacky", "Actor", new Date()));
        all.add(new Person("Madonna", "Singer", new Date()));
        all.add(new Person("Trump", "President", new Date()));
        return all;
    }
    
    @RequestMapping(value="/allpersonwithaddress.json")
    public List<Person> getAllPersonWithAddress() {
        List<Person> all = new ArrayList<>();
        Address address = new Address("Daan Mogot","Jakarta");
        all.add(new Person("Jacky", "Actor", new Date(), address));
        all.add(new Person("Madonna", "Singer", new Date(), address));
        all.add(new Person("Trump", "President", new Date(), address));
        return all;
    }
    
    @RequestMapping(value="/family.json")
    public Family getFamily() {
        List<Person> all = new ArrayList<>();
        Address address = new Address("Daan Mogot","Jakarta");
        all.add(new Person("Jacky", "Actor", new Date(), address));
        all.add(new Person("Madonna", "Singer", new Date(), address));
        all.add(new Person("Trump", "President", new Date(), address));
        Family family = new Family("Simanjuntak", all);
        return family;
    
    }
    
    @RequestMapping(value="/basasunda.json")
    public  Map<Integer, String> getSundanese() {
        Map<Integer, String> kamus = new HashMap<>();
        kamus.put(1, "Hiji");
        kamus.put(2, "Dua");
        kamus.put(3, "Tilu");
        kamus.put(4, "Papat");
        
        return kamus;
    }
    
    @RequestMapping(value="/rendy")
    public String getMaster() {
        return "Rendy Ganteng";
    }
    
    @RequestMapping(value="/operasi/{number1}/{number2}")
    public MathResult getResult(@PathVariable double number1, @PathVariable double number2) {
        Double result = number1* number2;
        MathResult mr = new MathResult("Multiplication", result);
        return mr;
    }
    
}
