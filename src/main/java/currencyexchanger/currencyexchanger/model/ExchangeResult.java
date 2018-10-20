package currencyexchanger.currencyexchanger.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class ExchangeResult {

    private BigDecimal returnedPrice;
    private String errorMessage;
    private HttpStatus httpCodeStatus;

    public ExchangeResult(BigDecimal returnedPrice, HttpStatus httpCodeStatus) {
        this.returnedPrice = returnedPrice;
        this.httpCodeStatus = httpCodeStatus;
    }

    public ExchangeResult(String errorMessage, HttpStatus httpCodeStatus) {
        this.errorMessage = errorMessage;
        this.httpCodeStatus = httpCodeStatus;
    }
}
