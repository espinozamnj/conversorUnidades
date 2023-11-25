package conversores;

public class Area {

    public final float m22ft2(float metrosCuadrados) {
        return metrosCuadrados * 10.7639f;
    }

    public final float ft22m2(float piesCuadrados) {
        return piesCuadrados / 10.7639f;
    }

    public final float m22cm2(float metrosCuadrados) {
        return metrosCuadrados * 10000;
    }

    public final float cm22m2(float centimetrosCuadrados) {
        return centimetrosCuadrados / 10000;
    }
}
