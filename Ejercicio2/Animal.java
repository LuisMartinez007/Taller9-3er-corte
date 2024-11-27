package Taller9.Ejercicio2;

public class Animal {
   // Atributo 
   private String especie; 
   // Constructor 
   public Animal(String especie) { 
    this.especie = especie;
 } // Método para mostrar la especie 
 public void mostrarEspecie() { 
    System.out.println("Especie: " + especie); 
} // Método getter 
public String getEspecie() { 
    return especie;
 } 
}
