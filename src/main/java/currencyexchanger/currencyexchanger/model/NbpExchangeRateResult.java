package currencyexchanger.currencyexchanger.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class NbpExchangeRateResult {

    private boolean successStatus;
    private String errorMessage;
    private BigDecimal rate;

    public NbpExchangeRateResult(boolean successStatus, String errorMessage, BigDecimal rate) {
        this.successStatus = successStatus;
        this.errorMessage = errorMessage;
        this.rate = rate;
    }
}
