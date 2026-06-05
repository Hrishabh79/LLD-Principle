package Lesson4_LiskovSubstitutionPrinciple.ProblematicCode;
import java.util.*;

public class Main {
    static void main() {
        List<CreditCard> cards = new ArrayList<>();
        for(CreditCard card : cards){
            if(card instanceof RupayCard){
                card.upiPayment();
            }
        }
    }
}
