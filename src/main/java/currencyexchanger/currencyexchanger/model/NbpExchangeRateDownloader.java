package currencyexchanger.currencyexchanger.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Component
public class NbpExchangeRateDownloader {

    private final static String BASE_URL = "http://api.nbp.pl/api/exchangerates/rates/A/{code}/{date}";

    private final RestTemplate restTemplate;

    @Autowired
    public NbpExchangeRateDownloader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public NbpExchangeRateResult getRateInfoInJson(String currency, String date) {
        Map<String, String> params = new HashMap<>();
        params.put("code", currency);
        params.put("date", date);

        ResponseEntity<NbpCurrencyExchangeSeries> series =
                restTemplate.getForEntity(BASE_URL, NbpCurrencyExchangeSeries.class, params);
        try {
            return new NbpExchangeRateResult(true, null, series.getBody().getRates().get(0).getMid());
        } catch (HttpClientErrorException e) {
            return new NbpExchangeRateResult(false, "UPS", null);
        }

    }
}
