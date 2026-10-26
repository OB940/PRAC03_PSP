package pq_AWT_Swing2;

public class Cliente {
    private int numero;
    private int puntos;
    private int edad;
    private String nombre;

    public Cliente(int numero, int puntos, int edad, String nombre) {
        this.numero = numero;
        this.puntos = puntos;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() { return edad; }
    public String getNombre() { return nombre; }
    public int getNumero() { return numero; }
    public int getPuntos() { return puntos; }
    
}