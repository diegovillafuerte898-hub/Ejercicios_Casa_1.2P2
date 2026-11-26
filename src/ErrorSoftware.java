public class ErrorSoftware {
    private String codigo;
    private String descripcion;
    private String severidad; // ALTA, MEDIA, BAJA
    private boolean resuelto;

    public ErrorSoftware(String codigo, String descripcion, String severidad, boolean resuelto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.severidad = severidad;
        this.resuelto = resuelto;
    }

    public String getCodigo() { return codigo; }
    public String getSeveridad() { return severidad; }
    public boolean isResuelto() { return resuelto; }

    public String mostrarInformacion() {
        return codigo + " [" + severidad + "] - " + descripcion + " (" + (resuelto ? "Resuelto" : "Pendiente") + ")";
    }
}
