import heritage.joined_table.CreditCardPayment;
import heritage.joined_table.PaypalPayment;
import heritage.single_table.CreditCardPayment1;
import heritage.single_table.PaypalPayment1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.getTransaction();
            transaction.begin();

            // Exemple joined table

//            CreditCardPayment creditCardPayment = new CreditCardPayment();
//            creditCardPayment.setCardNumber("123456");
//            creditCardPayment.setAmount(5000.0);
//            creditCardPayment.setPaymentDate(new Date());
//            creditCardPayment.setExpirationDate("12/2025");
//
//            PaypalPayment paypalPayment = new PaypalPayment();
//            paypalPayment.setAccountNumber("45678");
//            paypalPayment.setPaymentDate(new Date());
//            paypalPayment.setAmount(9854.5);
//
//            session.save(creditCardPayment);
//            session.save(paypalPayment);
//
//            System.out.println("CreditCarPayment " + creditCardPayment);
//            System.out.println("paypalPayment " + paypalPayment);


            // Exemple Single table :
            CreditCardPayment1  creditCardPayment1 = new CreditCardPayment1();
            creditCardPayment1.setCardNumber("5454545");
            creditCardPayment1.setAmount(98124.2);
            creditCardPayment1.setPaymentDate(new Date());
            creditCardPayment1.setExpirationDate("05/2023");

            PaypalPayment1 paypalPayment1 = new PaypalPayment1();
            paypalPayment1.setAccountNumber("45532");
            paypalPayment1.setPaymentDate(new Date());
            paypalPayment1.setAmount(15225.62);

            session.save(creditCardPayment1);
            session.save(paypalPayment1);

            System.out.println("CreditCarPayment " + creditCardPayment1);
            System.out.println("paypalPayment " + paypalPayment1);

            transaction.commit();


        }catch (Exception e) {
            if (transaction != null){
                System.out.println("ok");
            }

        }finally {
            session.close();
            sessionFactory.close();
        }












    }
}
