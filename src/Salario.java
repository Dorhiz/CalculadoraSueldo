public class Salario {
    private String nombre;
    private int edad;
    private double salario;
    


    public Salario() {
    }

    public Salario(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void salario(String nombre, int edad, double salario){
        if (edad < 17){
            System.out.println("La edad de "+ nombre +" es invalida para trabajar."
            +"\n*********************************************");
        }else if(edad > 17 && edad < 46)
            System.out.println("Nombre: " + nombre + "\nEdad: "+ edad + 
            "\nSalario: " + CalculadoraSalario(salario, 5)
            +"\n*********************************************");
        else if(edad > 45 && edad < 60)
           System.out.println("Nombre: " + nombre + "\nEdad: "+ edad +
           "\nSalario: " + CalculadoraSalario(salario, 15) + 
           "\n*********************************************");
        else if(edad > 60){
            System.out.println("El empleado "+ nombre+" debe estar jubilado."
            + "\n*********************************************");}
        
    }
    
    public double CalculadoraSalario(double salario, double porciento){
        return Math.round(((salario/100) * porciento) + salario );
    }
}