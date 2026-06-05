package Lesson4_LiskovSubstitutionPrinciple.BetterCode;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards){
            card.internationalPayment();
        }
    }
}
