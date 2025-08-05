public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Suma: " + calc.sum());
        System.out.println("Restul: "+calc.substract());
        System.out.println("Produsul: "+calc.multiply());
        System.out.println("Cat-ul: "+calc.divide());


        LogicalOp log = new LogicalOp();

        // 3
        System.out.println("\nThe bigger number is: " + log.checkBiggerNumber(2, 3));

        // 4
        System.out.println(log.compareText("FastTrackIT"));

        // 5
        System.out.println(log.compareTextAndNumber("FastTrackIT", 2));

        // 6
        System.out.println(log.snowForecast(6));

        // 7
        System.out.println(log.checkNumber(5));

        // 8
        int num = 5;
        System.out.println("\nThe number is: " + num);
        log.printNumber(num);

        // 91
        System.out.println("\nIs even: " + log.isNumberEven(4));

        // 10
        System.out.println("\nCan vote: " + log.isEligibleToVote(18));

        // 11
        System.out.println("\nBiggest number is: " + log.biggestNumber(17, 12, 3));
    }
}