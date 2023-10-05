package conversores;

public class Area {

    public static float m22ft2(float metrosCuadrados) {
        return metrosCuadrados * 10.7639f;
    }

    public static float ft22m2(float piesCuadrados) {
        return piesCuadrados / 10.7639f;
    }

    public static float m22cm2(float metrosCuadrados) {
        return metrosCuadrados * 10000;
    }

    public static float cm22m2(float centimetrosCuadrados) {
        return centimetrosCuadrados / 10000;
    }
}
