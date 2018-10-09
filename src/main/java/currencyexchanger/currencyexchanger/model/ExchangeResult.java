package currencyexchanger.currencyexchanger.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ExchangeResult {

    private BigDecimal returnedPrice;
    private String errorMessage;
    private String httpCodeStatus;

}
