package currencyexchanger.currencyexchanger.controller;

import currencyexchanger.currencyexchanger.model.ExchangeRequest;
import currencyexchanger.currencyexchanger.model.ExchangeResult;
import currencyexchanger.currencyexchanger.service.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExchangeController {
    private final ExchangeService exchangeService;

    @Autowired
    public ExchangeController( ExchangeService exchangeService){
        this.exchangeService = exchangeService;
    }

    @PostMapping("/exchange")
    public ResponseEntity<ExchangeResult> calculate(@RequestBody ExchangeRequest exchangeRequest) {
        ExchangeResult exchangeResult =  exchangeService.calculate(exchangeRequest);
        return new ResponseEntity<>(exchangeResult,exchangeResult.getHttpCodeStatus());
    }

}
