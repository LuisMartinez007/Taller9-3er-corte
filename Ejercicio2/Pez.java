package Taller9.Ejercicio2;

public class Pez extends Animal { 
    // Atributo adicional 
    private String tipoDeAgua; 
    // Constructor 
    public Pez(String especie, String tipoDeAgua) { 
        super(especie); this.tipoDeAgua = tipoDeAgua; 
    } // Método para obtener el tipo de agua 
    public String getTipoDeAgua() { 
        return tipoDeAgua; 
    } 
        // Método para establecer el tipo de agua 
        public void setTipoDeAgua(String tipoDeAgua) { 
            this.tipoDeAgua = tipoDeAgua; 
        } 
        // Método sobrescrito para mostrar los detalles del pez 
        @Override
         public void mostrarEspecie() { 
            super.mostrarEspecie(); 
            System.out.println("Tipo de Agua: " + tipoDeAgua);
         } 
    }