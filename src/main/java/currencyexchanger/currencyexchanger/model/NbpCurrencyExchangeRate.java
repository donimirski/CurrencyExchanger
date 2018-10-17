package currencyexchanger.currencyexchanger.model;

import java.math.BigDecimal;
import java.util.Date;

public class NbpCurrencyExchangeRate {
    private String no;
    private Date date;
    private BigDecimal mid;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }
}
