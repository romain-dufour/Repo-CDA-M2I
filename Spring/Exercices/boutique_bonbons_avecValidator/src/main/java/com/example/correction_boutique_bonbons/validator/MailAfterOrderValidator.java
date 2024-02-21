package com.example.correction_boutique_bonbons.validator;

import com.example.correction_boutique_bonbons.entity.CandyOrder;
import com.example.correction_boutique_bonbons.repository.CandyOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component("afterCreateOrderSendMail")
public class MailAfterOrderValidator implements Validator {

    private final CandyOrderRepository candyOrderRepository;

    public MailAfterOrderValidator(CandyOrderRepository candyOrderRepository) {
        this.candyOrderRepository = candyOrderRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return CandyOrder.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CandyOrder candyOrder = (CandyOrder) target;
        System.out.println("Votre commande " + candyOrder.getId() + " a bien été créée.");

    }
}
