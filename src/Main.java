public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int growth = 184;
        int weight = 75;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);

    }
}
