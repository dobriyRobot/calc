import java.util.Arrays;

public class ConvertToInt {
    private int[] romanToInt = new int[2];

    public int[] calcRoman(String[] str) throws CalcException {
        for (int i = 0; i < str.length; i++){
            RomanNumerals romanNumerals = RomanNumerals.getByName(str[i]);
            romanToInt[i] = Integer.parseInt(romanNumerals.getName());
            if (romanToInt[i] <= 0 || romanToInt[i] > 10){
                throw new CalcException("Разрешены числа от 1 до 10!!!");
            }
        }
        return romanToInt;
    }
    public int[] calcArabian(String[] str) throws CalcException {
        for (int i = 0; i < str.length; i++){
            romanToInt[i] = Integer.parseInt(str[i]);
            if (romanToInt[i] <= 0 || romanToInt[i] > 10){
                throw new CalcException("Разрешены числа от 1 до 10!!!");
            }
        }
        return romanToInt;
    }

    @Override
    public String toString() {
        return Arrays.toString(romanToInt);
    }
}
