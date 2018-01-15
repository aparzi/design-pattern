package application;

import java.util.Collections;
import java.util.List;

public class OperationAsc implements Strategy {

    @Override
    public List<Integer> doOperation(List<Integer> elements) {
        Collections.sort(elements);
        return elements;
    }
}
