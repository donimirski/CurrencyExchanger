package currencyexchanger.currencyexchanger.service;

import currencyexchanger.currencyexchanger.model.ExchangeRequest;
import currencyexchanger.currencyexchanger.model.ExchangeResult;
import currencyexchanger.currencyexchanger.model.NbpCurrencyExchangeRate;
import currencyexchanger.currencyexchanger.model.NbpExchangeRateResult;

public interface IExchangeService {
    ExchangeResult calculate (ExchangeRequest exchangeRequest);
    ExchangeResult compereCurrency(ExchangeRequest exchangeRequest);
}
