package conversores;

public class Tiempo {

    public final int hh2ss(int horas) {
        return horas * 3600;
    }

    public final int ss2hh(int segundos) {
        return segundos / 3600;
    }

    public final int mm2ss(int minutos) {
        return minutos * 60;
    }

    public final int ss2mm(int segundos) {
        return segundos / 60;
    }
}
