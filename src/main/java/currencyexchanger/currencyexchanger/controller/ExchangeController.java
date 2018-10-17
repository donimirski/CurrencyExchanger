package currencyexchanger.currencyexchanger.controller;

import currencyexchanger.currencyexchanger.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ExchangeController {
    private final ExchangeService exchangeService;

    @Autowired
    public ExchangeController( ExchangeService exchangeService){
        this.exchangeService = exchangeService;
    }

}
