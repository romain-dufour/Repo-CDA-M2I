package heritage.joined_table;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "paypal")
@PrimaryKeyJoinColumn(name = "idPayment")
public class PaypalPayment extends Payment{

    private String accountNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "PaypalPayment{" +
                "accountNumber='" + accountNumber + '\'' +
                "} " + super.toString();
    }
}
