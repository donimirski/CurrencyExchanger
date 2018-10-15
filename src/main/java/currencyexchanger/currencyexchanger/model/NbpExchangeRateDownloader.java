package currencyexchanger.currencyexchanger.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class NbpExchangeRateDownloader {

    private final static String BASE_URL = "http://api.nbp.pl/api/exchangerates/rates/a/";

    private final RestTemplate restTemplate;

    @Autowired
    public NbpExchangeRateDownloader(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public String getRateInfoInJson(String currency, String date) {
        ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL + currency + "/" + date +
                "/?format=json", String.class);
        String res = response.toString();
        return res;
    }



}
