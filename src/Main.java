void main() {
    System.out.println("\n=== PRUEBAS SW-A2: ERRORES ===");
    ErrorSoftware[] eArray = new ErrorSoftware[7];
    eArray[0] = new ErrorSoftware("ERR0R1", "NullPointerException en login", "ALTA", false);
    eArray[1] = new ErrorSoftware("ERR0R2", "Desalineación de botón CSS", "BAJA", true);
    eArray[2] = new ErrorSoftware("ERR0R3", "Fuga de memoria en conexión", "ALTA", false);
    eArray[3] = new ErrorSoftware("ERR0R4", "Retorno lento en consulta", "MEDIA", true);
    eArray[4] = new ErrorSoftware("ERR0R5", "OutOfMemoryError", "ALTA", true);
    eArray[5] = new ErrorSoftware("ERR0R6", "IndexOutOfBoundsException", "BAJA", true);
    eArray[6] = new ErrorSoftware("ERR0R7", "DivisionByZero", "BAJA", false);

    AnalizadorErrores anaErrores = new AnalizadorErrores(eArray);
    System.out.println("Errores pendientes: " + anaErrores.contarPendientes());
    System.out.println("Errores de severidad ALTA: " + anaErrores.contarPorSeveridad("ALTA"));
    System.out.println("Listado de severidad ALTA:\n" + anaErrores.listarPorSeveridad("ALTA"));
}
