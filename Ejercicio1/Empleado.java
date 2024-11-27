package Taller9.Ejercicio1;

public class Empleado extends Persona {
    private String departamento; 

    public Empleado(String nombre, int edad, String departamento) { 
        super(nombre, edad); this.departamento = departamento;
     } 

     public String getDepartamento() { 
        return departamento; 
    }

    public void setDepartamento(String departamento) {
    this.departamento = departamento; } 

    @Override
    public void mostrarDetalles() { 
    super.mostrarDetalles(); 
    System.out.println("Departamento: " + departamento); 
    }
}
