package currencyexchanger.currencyexchanger.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ExchangeRequest {
    private BigDecimal value;
    private LocalDate exchangeDate;
    private String currency;

}
