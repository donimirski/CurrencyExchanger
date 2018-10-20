package currencyexchanger.currencyexchanger.service;

import currencyexchanger.currencyexchanger.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Date;

@Service
public class ExchangeService implements IExchangeService {
    LocalDate today;
    private final NbpExchangeRateDownloader nbpExchangeRateDownloader;

    @Autowired
    public ExchangeService(NbpExchangeRateDownloader nbpExchangeRateDownloader) {
        this.nbpExchangeRateDownloader = nbpExchangeRateDownloader;
    }

    @Override
    public ExchangeResult calculate(ExchangeRequest exchangeRequest) {
        NbpExchangeRateResult nbpExchangeRateResult = nbpExchangeRateDownloader.getRateInfoInJson(exchangeRequest.getCurrency(), exchangeRequest.getExchangeDate().toString());
        if (nbpExchangeRateResult.isSuccessStatus()) {
            BigDecimal result = exchangeRequest.getValue().divide(nbpExchangeRateResult.getRate(), 2, RoundingMode.HALF_DOWN);
            return new ExchangeResult(result, HttpStatus.OK);
        }
        return new ExchangeResult(null,nbpExchangeRateResult.getErrorMessage(),HttpStatus.BAD_REQUEST);
    }

    @Override
    public ExchangeResult compereCurrency(ExchangeRequest exchangeRequest) {
        NbpExchangeRateResult nbpExchangeRateResult = nbpExchangeRateDownloader.getRateInfoInJson(exchangeRequest.getCurrency(),exchangeRequest.getExchangeDate().toString());
        if(nbpExchangeRateResult.isSuccessStatus()){
            BigDecimal amountAfterExchange = exchangeRequest.getValue();
            return new ExchangeResult(amountAfterExchange, HttpStatus.OK);
        }
        return new ExchangeResult(nbpExchangeRateResult.getErrorMessage(),HttpStatus.BAD_REQUEST);
    }
}
