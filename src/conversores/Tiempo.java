package conversores;

public class Tiempo {

    public static int hh2ss(int horas) {
        return horas * 3600;
    }

    public static int ss2hh(int segundos) {
        return segundos / 3600;
    }

    public static int mm2ss(int minutos) {
        return minutos * 60;
    }

    public static int ss2mm(int segundos) {
        return segundos / 60;
    }
}
