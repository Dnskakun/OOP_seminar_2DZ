import java.util.LinkedList;
import java.util.Scanner;

public class calculator {
    
    

    public LinkedList<Double> inputCalc() {
        System.out.println("Введите два числа и номер операции, которую " +
        "необходимо выполнить с данными числами: \n1. Сложение \n2. Вычитание" +
        "\n3. Умножение \n4. Деление");
        LinkedList<Double> userInput = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        userInput.add(scanner.nextDouble());
        System.out.print("Введите второе число: ");
        userInput.add(scanner.nextDouble());
        System.out.print("Введите номер операции: ");
        userInput.add(scanner.nextDouble());
        scanner.close();
        return userInput;        
    }

    
    public double startCalc(LinkedList<Double> userInput) {
        double result = 0;
        switch (userInput.get(2).intValue()) {
            case 1:
                result = new additional().calculation(userInput);
                break;
            case 2:
                result = new subtraction().calculation(userInput); 
                break;
            case 3:
                result = new multiplication().calculation(userInput);
                break;
            case 4:
                result = new division().calculation(userInput);
                break;
            default:
                System.out.println("Выбрано не корректное действие.");;
                break;
        }
        
        return Math.round(result*100.0)/100.0;
    }
    

}
