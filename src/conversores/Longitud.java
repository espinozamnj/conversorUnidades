package conversores;

public class Longitud {

    public final float mt2ft(float metros) {
        return metros * 3.28084f;
    }
    public final float ft2mt(float pies) {
        return pies / 3.28084f;
    }
    public final float mt2cm(float metros) {
        return metros * 100;
    }
    public final float cm2mt(float centimetros) {
        return centimetros / 100;
    }
}
