package base;

public class Conversor {

    public final String[] unidadesLongitud = {"metro", "kilómetro", "centímetro", "milímetro", "pulgada", "pie", "yarda", "milla"};
    public final String[] unidadesArea = {"metro cuadrado", "kilómetro cuadrado", "hectárea", "acre", "pie cuadrado"};
    public final String[] unidadesTiempo = {"segundo", "minuto", "hora", "día", "semana", "mes", "año"};
    public final String[] unidadesMasa = {"gramo", "kilogramo", "miligramo", "tonelada", "onza", "libra"};
    public final String[] unidadesPresion = {"pascal", "atmosfera", "bar", "milímetro de mercurio", "libra por pulgada cuadrada"};
    public final String[] unidadesTemperatura = {"celsius", "fahrenheit", "kelvin"};

    private boolean esUnidadValida(String unidad, String[] unidades) {
        for (String u : unidades) {
            if (u.equals(unidad)) {
                return true;
            }
        }
        return false;
    }
    // ------------------------------------------------
    public float convLongitud(String unidadEntrada, String unidadSalida, float valor) {
        if (!esUnidadValida(unidadEntrada, unidadesLongitud) || !esUnidadValida(unidadSalida, unidadesLongitud)) {
            System.out.println("Unidad de longitud inválida.");
            return 0;
        }
        float valorEnMetros = convertirAMetros(unidadEntrada, valor);
        return convertirDesdeMetros(unidadSalida, valorEnMetros);
    }
    private float convertirAMetros(String unidad, float valor) {
        switch (unidad) {
            case "kilómetro":
                return valor * 1000;
            case "centímetro":
                return valor / 100;
            case "milímetro":
                return valor / 1000;
            case "pulgada":
                return valor * 0.0254F;
            case "pie":
                return valor * 0.3048F;
            case "yarda":
                return valor * 0.9144F;
            case "milla":
                return valor * 1609.34F;
            default: // metro
                return valor;
        }
    }
    private float convertirDesdeMetros(String unidad, float valorEnMetros) {
        switch (unidad) {
            case "kilómetro":
                return valorEnMetros / 1000;
            case "centímetro":
                return valorEnMetros * 100;
            case "milímetro":
                return valorEnMetros * 1000;
            case "pulgada":
                return valorEnMetros / 0.0254F;
            case "pie":
                return valorEnMetros / 0.3048F;
            case "yarda":
                return valorEnMetros / 0.9144F;
            case "milla":
                return valorEnMetros / 1609.34F;
            default: // metro
                return valorEnMetros;
        }
    }
    // ------------------------------------------------
    public float convArea(String unidadEntrada, String unidadSalida, float valor) {
        if (!esUnidadValida(unidadEntrada, unidadesArea) || !esUnidadValida(unidadSalida, unidadesArea)) {
            System.out.println("Unidad de área inválida.");
            return 0;
        }
        float valorEnMetrosCuadrados = convertirAMetrosCuadrados(unidadEntrada, valor);
        return convertirDesdeMetrosCuadrados(unidadSalida, valorEnMetrosCuadrados);
    }
    private float convertirAMetrosCuadrados(String unidad, float valor) {
        switch (unidad) {
            case "kilómetro cuadrado":
                return valor * 1000000;
            case "hectárea":
                return valor * 10000;
            case "acre":
                return valor * 4046.86F;
            case "pie cuadrado":
                return valor / 10.764F;
            default: // metro cuadrado
                return valor;
        }
    } 
    private float convertirDesdeMetrosCuadrados(String unidad, float valorEnMetrosCuadrados) {
        switch (unidad) {
            case "kilómetro cuadrado":
                return valorEnMetrosCuadrados / 1000000;
            case "hectárea":
                return valorEnMetrosCuadrados / 10000;
            case "acre":
                return valorEnMetrosCuadrados / 4046.86F;
            case "pie cuadrado":
                return valorEnMetrosCuadrados * 10.764F;
            default: // metro cuadrado
                return valorEnMetrosCuadrados;
        }
    }
    // ------------------------------------------------
    public float convTiempo(String unidadEntrada, String unidadSalida, float valor) {
        if (!esUnidadValida(unidadEntrada, unidadesTiempo) || !esUnidadValida(unidadSalida, unidadesTiempo)) {
            System.out.println("Unidad de tiempo inválida.");
            return 0;
        }
        float valorEnSegundos = convertirASegundos(unidadEntrada, valor);
        return convertirDesdeSegundos(unidadSalida, valorEnSegundos);
    }
    private float convertirASegundos(String unidad, float valor) {
        switch (unidad) {
            case "minuto":
                return valor * 60;
            case "hora":
                return valor * 3600;
            case "día":
                return valor * 86400;
            case "semana":
                return valor * 604800;
            case "mes":
                return valor * 2628000;
            case "año":
                return valor * 31536000;
            default: // segundo
                return valor;
        }
    }
    private float convertirDesdeSegundos(String unidad, float valorEnSegundos) {
        switch (unidad) {
            case "minuto":
                return valorEnSegundos / 60;
            case "hora":
                return valorEnSegundos / 3600;
            case "día":
                return valorEnSegundos / 86400;
            case "semana":
                return valorEnSegundos / 604800;
            case "mes":
                return valorEnSegundos / 2628000;
            case "año":
                return valorEnSegundos / 31536000;
            default: // segundo
                return valorEnSegundos;
        }
    }
    // ------------------------------------------------
    public float convMasa(String unidadEntrada, String unidadSalida, float valor) {
        if (!esUnidadValida(unidadEntrada, unidadesMasa) || !esUnidadValida(unidadSalida, unidadesMasa)) {
            System.out.println("Unidad de masa inválida.");
            return 0;
        }
        float valorEnGramos = convertirAGramos(unidadEntrada, valor);
        return convertirDesdeGramos(unidadSalida, valorEnGramos);
    }
    private float convertirAGramos(String unidad, float valor) {
        switch (unidad) {
            case "kilogramo":
                return valor * 1000;
            case "miligramo":
                return valor / 1000;
            case "tonelada":
                return valor * 1000000;
            case "onza":
                return valor * 28.3495F;
            case "libra":
                return valor * 453.592F;
            default: // gramo
                return valor;
        }
    }
    private float convertirDesdeGramos(String unidad, float valorEnGramos) {
        switch (unidad) {
            case "kilogramo":
                return valorEnGramos / 1000;
            case "miligramo":
                return valorEnGramos * 1000;
            case "tonelada":
                return valorEnGramos / 1000000;
            case "onza":
                return valorEnGramos / 28.3495F;
            case "libra":
                return valorEnGramos / 453.592F;
            default: // gramo
                return valorEnGramos;
        }
    }
    // ------------------------------------------------
    public float convPresion(String unidadEntrada, String unidadSalida, float valor) {
        if (!esUnidadValida(unidadEntrada, unidadesPresion) || !esUnidadValida(unidadSalida, unidadesPresion)) {
            System.out.println("Unidad de presión inválida.");
            return 0;
        }
        float valorEnPascales = convertirAPascales(unidadEntrada, valor);
        return convertirDesdePascales(unidadSalida, valorEnPascales);
    }
    private float convertirAPascales(String unidad, float valor) {
        switch (unidad) {
            case "atmosfera":
                return valor * 101325;
            case "bar":
                return valor * 100000;
            case "milímetro de mercurio":
                return valor * 133.322F;
            case "libra por pulgada cuadrada":
                return valor * 6894.76F;
            default: // pascal
                return valor;
        }
    }
    private float convertirDesdePascales(String unidad, float valorEnPascales) {
        switch (unidad) {
            case "atmosfera":
                return valorEnPascales / 101325;
            case "bar":
                return valorEnPascales / 100000;
            case "milímetro de mercurio":
                return valorEnPascales / 133.322F;
            case "libra por pulgada cuadrada":
                return valorEnPascales / 6894.76F;
            default: // pascal
                return valorEnPascales;
        }
    }
    // ------------------------------------------------
    public float convTemperatura(String unidadEntrada, String unidadSalida, float valor) {
        if (!esUnidadValida(unidadEntrada, unidadesTemperatura) || !esUnidadValida(unidadSalida, unidadesTemperatura)) {
            System.out.println("Unidad de temperatura inválida.");
            return 0;
        }
        float valorEnCelsius = convertirACelsius(unidadEntrada, valor);
        return convertirDesdeCelsius(unidadSalida, valorEnCelsius);
    }
    private float convertirACelsius(String unidad, float valor) {
        switch (unidad) {
            case "fahrenheit":
                return (valor - 32) * 5 / 9;
            case "kelvin":
                return valor - 273.15F;
            default: // celsius
                return valor;
        }
    }
    private float convertirDesdeCelsius(String unidad, float valorEnCelsius) {
        switch (unidad) {
            case "fahrenheit":
                return valorEnCelsius * 9 / 5 + 32;
            case "kelvin":
                return valorEnCelsius + 273.15F;
            default: // celsius
                return valorEnCelsius;
        }
    }
}