package racingcar.car;

import static racingcar.util.print.constants.RacingGameConstants.MIN_VALUE_FOR_MOVE;

public class Car {
    private String name;
    private int currentPosition;


    public Car(String name) {
        this.name = name;
    }
    public void move(int numberToMove) {
        if (MIN_VALUE_FOR_MOVE < numberToMove) {
            currentPosition++;
        }
    }

    public String getCarName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
