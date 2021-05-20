import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws CalcException {
        String expression = requestString().replaceAll("\\s", "");
        String symbol = expression.replaceAll("\\w", "");
        String[] numbers  = expression.split("[+*/-]");
        int[] result = new int[numbers.length];
        ConvertToInt convertToInt = new ConvertToInt();
        boolean roman = false;
        if (RomanNumerals.getByName(numbers[0]) != null && RomanNumerals.getByName(numbers[1]) != null){
            result = convertToInt.calcRoman(numbers);
            roman = true;
        } else if (numbers[0].matches("\\d+")  && numbers[1].matches("\\d+")) {
            result = convertToInt.calcArabian(numbers);
        } else {
            throw new CalcException("Не корректный ввод!!!");
        }
        Arithmetic arithmetic = new Arithmetic(result[0], result[1]);
        switch (symbol) {
            case ("+"):
                arithmetic.addition();
                break;
            case ("/"):
                arithmetic.division();
                break;
            case ("-"):
                arithmetic.subtraction();
                break;
            case ("*"):
                arithmetic.multiplication();
                break;
            default:
                System.out.println("Не верный оператор!");
        }
        if(roman){
            System.out.println("Результат: " + RomanNumerals.getEnumByString(arithmetic.toString()));
        } else {
            System.out.println("Результат: " + arithmetic.toString());
        }
    }
    static String requestString(){
        System.out.print("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
