# Documentación general

## Documentación de la Clase Conversor:
Esta clase se encuentra dentro del paquete `base`.
La clase Conversor proporciona métodos para convertir entre diferentes unidades de longitud, área, tiempo, masa, presión y temperatura.

### Atributos:
- `unidadesLongitud`: Arreglo de cadenas que contiene las unidades admitidas para longitud.
- `unidadesArea`: Arreglo de cadenas que contiene las unidades admitidas para área.
- `unidadesTiempo`: Arreglo de cadenas que contiene las unidades admitidas para tiempo.
- `unidadesMasa`: Arreglo de cadenas que contiene las unidades admitidas para masa.
- `unidadesPresion`: Arreglo de cadenas que contiene las unidades admitidas para presión.
- `unidadesTemperatura`: Arreglo de cadenas que contiene las unidades admitidas para temperatura.

### Métodos:
#### De validación de datos
**Para verificar la compatibilidad con una unidad de medida**
```java
private boolean esUnidadValida(String unidad, String[] unidades) {
    for (String u : unidades) {
        if (u.equals(unidad)) {
            return true;
        }
    }
    return false;
}
```

#### De conversión específica
**Convertir un valor de longitud de una unidad de entrada a una unidad de salida.**

`convLongitud(String unidadEntrada, String unidadSalida, float valor): float`

*Ejemplo de uso:*

```java
Conversor conversor = new Conversor();
float resultado = conversor.convLongitud("metro", "kilómetro", 10.0);
System.out.println("Resultado: " + resultado + " kilómetros");
```

**Convertir un valor de área de una unidad de entrada a una unidad de salida.**

`convArea(String unidadEntrada, String unidadSalida, float valor): float`

*Ejemplo de uso:*

```java
Conversor conversor = new Conversor();
float resultado = conversor.convArea("metro cuadrado", "acre", 100.0);
System.out.println("Resultado: " + resultado + " acres");
```

**Convertir un valor de tiempo de una unidad de entrada a una unidad de salida.**

`convTiempo(String unidadEntrada, String unidadSalida, float valor): float`

*Ejemplo de uso:*

```java
Conversor conversor = new Conversor();
float resultado = conversor.convTiempo("hora", "minuto", 2.5);
System.out.println("Resultado: " + resultado + " minutos");
```

**Convertir un valor de masa de una unidad de entrada a una unidad de salida.**

`convMasa(String unidadEntrada, String unidadSalida, float valor): float`

*Ejemplo de uso:*

```java
Conversor conversor = new Conversor();
float resultado = conversor.convMasa("kilogramo", "gramo", 5.0);
System.out.println("Resultado: " + resultado + " gramos");
```

**Convertir un valor de presión de una unidad de entrada a una unidad de salida.**

`convPresion(String unidadEntrada, String unidadSalida, float valor): float`

*Ejemplo de uso:*

```java
Conversor conversor = new Conversor();
float resultado = conversor.convPresion("pascal", "atmosfera", 100000);
System.out.println("Resultado: " + resultado + " atmósferas");
```

**Convertir un valor de temperatura de una unidad de entrada a una unidad de salida.**

`convTemperatura(String unidadEntrada, String unidadSalida, float valor): float`

*Ejemplo de uso:*

```java
Conversor conversor = new Conversor();
float resultado = conversor.convTemperatura("celsius", "fahrenheit", 25.0);
System.out.println("Resultado: " + resultado + " grados Fahrenheit");
```

### Consideraciones para nuevas implementaciones
Para optimizar el uso de métodos a fin de mejorar el rendimiento del programa, se debe trabajar con una unidad de medida que sea de intermediaria para la conversión entre las diferentes unidades de medida.
Esto simplifica la cantidad de métodos a implementar por cada magnitud física deseada.
Por ejemplo, para el caso de longitud se usa al metro como unidad intermediaría, y el código seguirá esta secuencia:

**Para la conversión a metros**

```java
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
```

**Para la conversión desde metros**

```java
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
```

## Documentación de interfaz gráfica
Las clases necesarias se encuentran dentro del paquete `gui`.
Se usan componentes de la clase `JInternalFrame` para cada formulario conversor.
Los formularios deben insertarse dentro de la clase `ConversorUnidades_GUI` en el componente `jDesktopPaneMain` y por acción de uno de los botones del `JMenu` o de su atajo de teclado correspondiente.

*Ejemplo de creación de calculadora de conversión dentro de la ventana principal (para el conversor de unidades de **masa**) por medio de su botón correspondiente:*

```java
private void btnMasaActionPerformed(java.awt.event.ActionEvent evt) {
    FrmMasa frmMasa = new FrmMasa();
    jDesktopPaneMain.add(frmMasa);
    frmMasa.setVisible(true);
}
```

## Consejos Adicionales:

**Manejo de Errores:**
Implementa un manejo adecuado de errores para situaciones como unidades inválidas o valores no numéricos.

**Personalización de la Interfaz:**
Modifica la interfaz según tus preferencias y requisitos de diseño.

**Documentación del Código:**
Añade comentarios y documentación al código para facilitar su comprensión y mantenimiento.

