public class GreatCircle {
    public static void main(String[] args) {

        double r = 6371.0;

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double sin1 = Math.toRadians((x2 - x1) / 2.0);
        double sin2 = Math.toRadians((y2 - y1) / 2.0);

        double calc = (Math.sin(sin1) * Math.sin(sin1)) + (Math.cos(Math.toRadians(x1)) * (Math.cos(Math.toRadians(x2)) * (Math.sin(sin2)) * (Math.sin(sin2))));
        double distance = 2 * r * Math.asin(Math.sqrt(calc));

        System.out.println(distance + " kilometers");
    }
}
