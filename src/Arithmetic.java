public class Arithmetic {
    private int a;
    private int b;
    private int result;

    public Arithmetic(int numA, int numB) {
        this.a = numA;
        this.b = numB;
    }
    public void addition() {
        result = a + b;
    }
    public void subtraction() {
        result = a - b;
    }
    public void division() {
        result = a / b;
    }
    public void multiplication() {
        result = a * b;
    }
    @Override
    public String toString() {
        return "" + result;
    }
}
