public class AnalizadorErrores {
    private ErrorSoftware[] errores;

    public AnalizadorErrores(ErrorSoftware[] errores) {
        this.errores = errores;
    }

    public int contarPendientes() {
        int c = 0;
        for (ErrorSoftware e : errores) {
            if (e != null && !e.isResuelto()) c++;
        }
        return c;
    }

    public ErrorSoftware buscarPorCodigo(String codigo) {
        for (ErrorSoftware e : errores) {
            if (e != null && e.getCodigo().equals(codigo)) return e;
        }
        return null;
    }

    public int contarPorSeveridad(String severidad) {
        int c = 0;
        for (ErrorSoftware e : errores) {
            if (e != null && e.getSeveridad().equalsIgnoreCase(severidad)) c++;
        }
        return c;
    }

    public String listarPorSeveridad(String severidad) {
        String res = "";
        for (ErrorSoftware e : errores) {
            if (e != null && e.getSeveridad().equalsIgnoreCase(severidad)) {
                res += e.mostrarInformacion() + "\n";
            }
        }
        return res;
    }
}
