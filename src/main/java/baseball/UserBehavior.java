package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.constant.Constant.*;

public class UserBehavior {
    private CheckException checkException = new CheckException();
    private final List<Integer> computerNumbers;
    private int strike;
    private int ball;

    public UserBehavior(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;

    }

    public int input() {
        try {
            String inputNumbers[] = setStart();
            checkException.checkAll(inputNumbers);
            countResult(inputNumbers);
            while (result()) {
                System.out.println(FINISH);
                System.out.println(RESTART_OR_EXIT);
                return Integer.parseInt(Console.readLine());
            }
            return input();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }

    private String[] setStart() {
        strike = 0;
        ball = 0;
        System.out.print(INPUT_MENTION);
        return Console.readLine().split(SPLIT);
    }

    private void countResult(String[] inputNumbers) {
        int first = Integer.parseInt(inputNumbers[0]);
        check(0, first);
        int second = Integer.parseInt(inputNumbers[1]);
        check(1, second);
        int third = Integer.parseInt(inputNumbers[2]);
        check(2, third);
    }

    private void check(int index, int number) {
        if (computerNumbers.get(index) == number) {
            strike++;
            return;
        }
        if (computerNumbers.contains(number))
            ball++;
    }

    private boolean result() {
        if (strike == 3) {
            System.out.println(strike+ STRIKE);
            return true;
        }
        if (ball == 0 && strike == 0) {
            System.out.println(NOTHING);
            return false;
        }
        if (ball == 0) {
            System.out.println(strike+ STRIKE);
            return false;
        }
        if (strike == 0) {
            System.out.println(ball+ BALL);
            return false;
        }
        System.out.println(ball+ BALL+strike+ STRIKE);
        return false;
    }
}
