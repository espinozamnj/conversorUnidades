package conversores;

public class Masa {

    public final float kg2lb(float kilogramos) {
        return kilogramos * 2.20462f;
    }

    public final float lb2kg(float libras) {
        return libras / 2.20462f;
    }

    public final float kg2g(float kilogramos) {
        return kilogramos * 1000;
    }

    public final float g2kg(float gramos) {
        return gramos / 1000;
    }
}
