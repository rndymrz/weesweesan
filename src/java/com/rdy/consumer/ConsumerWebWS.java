
package com.rdy.consumer;

import com.rdy.model.Staff;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("consumer")
public class ConsumerWebWS {
    
    @RequestMapping(value="/person")
    public String getPerson(Model model) {
        
        String url = "http://localhost:8084/producerWS/api/aperson.json?uuid=352f029e81df44349019e19e959494e6";
        RestTemplate rt = new RestTemplate();
        Staff staff = rt.getForObject(url, Staff.class);
        model.addAttribute("staff", staff);
        
        return "person";
        
    }
    
}
