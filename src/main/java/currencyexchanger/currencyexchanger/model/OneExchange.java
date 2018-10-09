package currencyexchanger.currencyexchanger.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class OneExchange {

    //obiekt, który powstaje po każdym przeliczeniu. Trafia do DB
    //żeby tworzyć historię przeliczeń

    private String inputCurrency;
    private String resultCurrency;
    private BigDecimal inputPrice;
    private BigDecimal resultPrice;

    public OneExchange(String inputCurrency, String resultCurrency, BigDecimal inputPrice, BigDecimal resultPrice) {
        this.inputCurrency = inputCurrency;
        this.resultCurrency = resultCurrency;
        this.inputPrice = inputPrice;
        this.resultPrice = resultPrice;
    }

    public OneExchange() {}
}
