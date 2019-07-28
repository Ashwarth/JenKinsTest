import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        System.out.println("printing all numbers");
        printAll();
        System.out.println("printing even numbers");
        printEvenNumbers();
        System.out.println("printing random numbers");
        printRandomNumbers();
        System.out.println("skipping one element");
        skipOneElement();
        System.out.println("skip one parlull in middle");
        skipOneElementMiddle();
        System.out.println("primeOrNot");
        primeNumber();
    }

    private static void primeNumber() {
        IntStream.range(1, 100).filter(i -> i % 2 != 0 && i % 3 != 0 && i % 5 != 0)
                .forEach(System.out::println);
    }

    private static void skipOneElementMiddle() {
        IntStream.range(1, 10)
                .parallel().skip(2).distinct()
                .forEach(System.out::println);
    }

    private static void skipOneElement() {
        IntStream.range(1, 10)
                .skip(3)
                .forEach(System.out::println);
    }

    private static void printRandomNumbers() {
        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(1256789, 999999999))
                .limit(5).forEach(System.out::println);
    }

    private static void printEvenNumbers() {
        IntStream.range(1, 100)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printAll() {
        IntStream.of(10, 20, 30, 40, 50, 60, 70, 80)
                .forEach(System.out::println);
    }
}
