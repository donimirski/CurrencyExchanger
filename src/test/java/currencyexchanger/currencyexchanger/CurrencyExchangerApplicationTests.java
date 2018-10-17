package currencyexchanger.currencyexchanger;

import currencyexchanger.currencyexchanger.model.NbpExchangeRateDownloader;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyExchangerApplicationTests {

    @Test
    public void contextLoads() {
    }



    @Test
    public void someshit() {
        NbpExchangeRateDownloader downloader = new NbpExchangeRateDownloader(new RestTemplate());
        downloader.getRateInfoInJson("gbp", "2019-01-02");
    }
}
