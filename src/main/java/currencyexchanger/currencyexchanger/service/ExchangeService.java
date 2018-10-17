package currencyexchanger.currencyexchanger.service;

import currencyexchanger.currencyexchanger.model.ExchangeResult;
import currencyexchanger.currencyexchanger.model.NbpCurrencyExchangeRate;
import currencyexchanger.currencyexchanger.model.NbpExchangeRateDownloader;
import currencyexchanger.currencyexchanger.model.NbpExchangeRateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
@Service
public class ExchangeService implements IExchangeService {
    private final NbpExchangeRateDownloader nbpExchangeRateDownloader;

    @Autowired
    public ExchangeService(NbpExchangeRateDownloader nbpExchangeRateDownloader) {
        this.nbpExchangeRateDownloader = nbpExchangeRateDownloader;
    }

    @Override
    public ExchangeResult calculate(NbpCurrencyExchangeRate nbpCurrencyExchangeRate) {
        NbpExchangeRateResult nbpExchangeRateResult = nbpExchangeRateDownloader.getRateInfoInJson(nbpCurrencyExchangeRate.getNo(), nbpCurrencyExchangeRate.getDate().toString());
        if (nbpExchangeRateResult.isSuccessStatus()) {
            BigDecimal result = nbpCurrencyExchangeRate.getMid().divide(nbpExchangeRateResult.getRate(), 2, RoundingMode.HALF_DOWN);
            return new ExchangeResult(result, HttpStatus.OK);
        }
        return new ExchangeResult(null,nbpExchangeRateResult.getErrorMessage(),HttpStatus.BAD_REQUEST);
    }
}
