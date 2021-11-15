package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> positiveNumbers = new ArrayList<>();

    public void addPositiveNumber(double number) {
        if (number > 0)
            positiveNumbers.add(number);
    }

    public List<Double> getPositiveNumbers() {
        return positiveNumbers;
    }
}
