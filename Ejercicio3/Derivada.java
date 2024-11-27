package Taller9.Ejercicio3;

public class Derivada extends Base { 
    public void mostrarMensajePrivado() { 
        // Acceso al atributo privado a través del método getter 
        System.out.println(super.getMensajePrivado()); 
    }

    public static void main(String[] args) { 
        Derivada instancia = new Derivada(); 
        instancia.mostrarMensajePrivado(); 
    } 

}
