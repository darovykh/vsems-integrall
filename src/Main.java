public class Main {

    public static double getIntegrall() {
        double line = 0.1 * 7;
        int steps = 1000000;
        double width = Math.PI / steps;

        double area = 0.0;
        for (int i = 0; i < steps - 1; i++) {
            double height = Math.sin(width*i);
            if (height >= line) {
                height = line;
            }
            area += width * height;
        }

        return area;
    }

    public static void main(String [] args) {

        System.out.println(getIntegrall());

    }

}
