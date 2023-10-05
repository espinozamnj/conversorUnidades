package conversores;

public class Longitud {

    public static float mt2ft(float metros) {
        return metros * 3.28084f;
    }

    public static float ft2mt(float pies) {
        return pies / 3.28084f;
    }

    public static float mt2cm(float metros) {
        return metros * 100;
    }

    public static float cm2mt(float centimetros) {
        return centimetros / 100;
    }
}
