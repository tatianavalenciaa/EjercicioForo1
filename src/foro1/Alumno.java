package foro1;

public class Alumno {
    private String carnet;
    private String nombres;
    private String apellidos;

    public Alumno() {
    }

    public Alumno(String carnet, String nombres, String apellidos) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }    
    
}
