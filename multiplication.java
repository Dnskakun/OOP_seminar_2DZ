import java.util.LinkedList;

public class multiplication extends operations {

    @Override
    public double calculation(LinkedList<Double> item) {
        double result = item.get(0) * item.get(1);
        return result;
    }

}