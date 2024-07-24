import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLine()));}

    public static String calc(String input) throws Exception {
        String[] words = input.split(" ");
        if (words.length != 3) throw new Exception("Неверная длина строки.");

        int firstNumber = Integer.parseInt(words[0]);
        if (firstNumber < 1 || firstNumber > 10) throw new Exception("Число должно быть в диапазоне от 1 до 10");

        int secondNumber = Integer.parseInt(words[2]);
        if (secondNumber < 1 || secondNumber > 10) throw new Exception("Число должно быть в диапозоне от 1 до 10");

        String mathOperation = words[1];

        int result = switch (mathOperation) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new IllegalStateException("формат математической операции не удовлетворяет заданию");
        };
        return String.valueOf(result);

    }
}
