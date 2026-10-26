package pq_AWT_Swing2;

public class Cliente {
    // ATRIBUTOS
    private int numero;
    private String nombre;
    private int edad;
    private int puntos;
    
    // CONSTRUCTOR
    public Cliente(int numero, String nombre, int edad, int puntos) {
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.puntos = puntos;
    }
    
    
    // MÉTODOS
    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
