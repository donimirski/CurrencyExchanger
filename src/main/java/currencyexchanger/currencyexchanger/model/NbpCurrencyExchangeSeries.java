package currencyexchanger.currencyexchanger.model;

import java.util.ArrayList;
import java.util.List;

public class NbpCurrencyExchangeSeries {
     private String currency;
     private String code;
     private List<NbpCurrencyExchangeRate> rates;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<NbpCurrencyExchangeRate> getRates() {
        return rates;
    }

    public void setRates(List<NbpCurrencyExchangeRate> rates) {
        this.rates = rates;
    }
}
