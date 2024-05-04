/**
 *
 * @author comqdhb
 */
public class HoleDriller {

    private static boolean atSafeHeight = false;

    private static void makeSafe() {
        if (!atSafeHeight) {
            System.out.println("G0 Z2");
            atSafeHeight = true;
        }
    }

    private static void millCircles(float x, float y, float r) {
        float dx = 0;
        float o;
        for (o = 1; o < r - 0.75; o++) {
            dx = x - o;
            System.out.println("G1 X" + dx + " Y" + y);
            System.out.println("G2 X" + dx + " Y" + y + " I" + o + " J0");
        }
        o = r - 0.75f;
        dx = x - o;
        System.out.println("G1 X" + dx + " Y" + y);
        System.out.println("G2 X" + dx + " Y" + y + " I" + o + " J0");
    }

    public enum Metal {
        steel, aluminium, ply, hardwood, perspex, foam
    }

    public static void main(String[] args) {
        makeSafe();
        preAmble();
        drillHole(-10, 0, 2.5f, 5);
        drillHole(10, 0, 5.1f, 3.9f);
        finish();
    }

    public static void preAmble() {
        System.out.println("G17");
        makeSafe();
        System.out.println("M3 S1000");
        setFeedRate(Metal.ply);
    }

    public static void finish() {
        makeSafe();
        System.out.println("M5");
        System.out.println("G0 X0 Y0");
    }

    public static void postHole() {
        makeSafe();
    }

    public static void setFeedRate(Metal metal) {
        switch (metal) {
            case steel:
                System.out.println("G1 F2");
                break;
            case aluminium:
                System.out.println("G1 F20");
                break;
            case ply:
                System.out.println("G1 F200");
                break;
            case hardwood:
                System.out.println("G1 F100");
                break;
            case perspex:
                System.out.println("G1 F100");
                break;
            case foam:
                System.out.println("G1 F500");
                break;
        }
    }

    public static void drillHole(float x, float y, float r, float d) {
        System.out.println("G0 X" + x + " Y" + y);
        float z;
        for (z = -2; z >= -d; z -= 2) {
            System.out.println("G1 Z" + z);
            atSafeHeight = false;
            millCircles(x, y, r);
            System.out.println("G1 X" + x + " Y" + y);
        }
        if (z != -d) {
            z = -d;
            System.out.println("G1 Z" + z);
            atSafeHeight = false;
            millCircles(x, y, r);
            System.out.println("G1 X" + x + " Y" + y);
        }
        postHole();
    }
}
