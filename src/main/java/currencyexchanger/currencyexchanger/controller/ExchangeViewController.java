package currencyexchanger.currencyexchanger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExchangeViewController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

}
