public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 59;
        double height = 1.60;
        double index = service.calculate(weight, height);

        System.out.println("Индекс массы тела составляет:");
        System.out.printf("%.2f", index);
    }
}