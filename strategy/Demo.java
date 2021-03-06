package strategy;

import strategy.application.Context;
import strategy.application.OperationAsc;
import strategy.application.OperationDesc;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(10, 2, 5, 7);
        Context context = new Context(new OperationAsc());
        System.out.println("Lista ascendente: " + context.doOrder(elements));
        System.out.println("-----------------------------------------------------------");
        context.setStrategy(new OperationDesc());
        System.out.println("Lista discendente: " + context.doOrder(elements));
    }
}