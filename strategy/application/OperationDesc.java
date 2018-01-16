package strategy.application;

import java.util.Collections;
import java.util.List;

public class OperationDesc implements Strategy {

    @Override
    public List<Integer> doOperation(List<Integer> elements) {
        Collections.sort(elements, Collections.reverseOrder());
        return elements;
    }
}
