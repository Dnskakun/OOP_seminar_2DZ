/*
 * Написать калькулятор в ООП стиле
 * (инкапсуляция, наследованеи. полиморфизм)
 */

import java.util.LinkedList;

public class program {

    public static void main(String[] args) {
        
        LinkedList<Double> userInut = new calculator().inputCalc();
        System.out.println(new calculator().startCalc(userInut));
        
    }
}