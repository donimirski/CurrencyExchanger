package currencyexchanger.currencyexchanger.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class NbpExchangeRateResult {

    private boolean successStatus;
    private String errorMessage;
    private BigDecimal rate;

    public boolean isSuccessStatus() {
        return successStatus;
    }

    public void setSuccessStatus(boolean successStatus) {
        this.successStatus = successStatus;
    }

    public String isErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public NbpExchangeRateResult(boolean successStatus, String errorMessage, BigDecimal rate) {
        this.successStatus = successStatus;
        this.errorMessage = errorMessage;
        this.rate = rate;

    }
}
