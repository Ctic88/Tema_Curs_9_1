public class LogicalOp {
    // 3
    public int checkBiggerNumber(int nr1, int nr2) {
        if (nr1 > nr2) {
            return nr1;
        } else {
            return nr2;
        }
    }

    // 4
    public String compareText(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    // 5
    public String compareTextAndNumber(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + " " + number;
        } else if (number >= 4) {
            return number + " " + text;
        }
        return "Invalid conditions";
    }

    // 6
    public String snowForecast(int cm) {
        if (cm > 8 || cm == 6) {
            return "The amount of snow this winter was(cm): " + cm;
        } else {
            return "The forecast snow is(cm): " + cm;
        }
    }

    // 7
    public String checkNumber(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    // 8
    public void printNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is: 1 !");
                break;
            case 2:
                System.out.println("The number is: 2 !");
                break;
            case 3:
                System.out.println("The number is: 3 !");
                break;
            default:
                System.out.println("Number not in 1-3 range");
        }
    }

    // 9
    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 10
    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // 11
    public int biggestNumber(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}