public class BmiService {
    public double calculate(double growth, double weight) {
        double result = weight / Math.pow(growth / 100, 2);
        return result;
    }
}
