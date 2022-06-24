public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(75,1.74);
        System.out.println(index);

    }
}
