
public class Alumno {
    private String appa;
    private String apma;
    private int   codigo;
    private String nombre;
    private Double nota; 

    public Alumno() {
    }

    public Alumno(String appa, String apma, int codigo, String nombre, Double nota) {
        this.appa = appa;
        this.apma = apma;
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getAppa() {
        return appa;
    }

    public void setAppa(String appa) {
        this.appa = appa;
    }

    public String getApma() {
        return apma;
    }

    public void setApma(String apma) {
        this.apma = apma;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    
}
