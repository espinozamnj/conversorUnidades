package conversores;

public class Masa {

    public static float kg2lb(float kilogramos) {
        return kilogramos * 2.20462f;
    }

    public static float lb2kg(float libras) {
        return libras / 2.20462f;
    }

    public static float kg2g(float kilogramos) {
        return kilogramos * 1000;
    }

    public static float g2kg(float gramos) {
        return gramos / 1000;
    }
}
