import java.util.Scanner;
public class App {
    
    public static void main(String[] args) throws Exception {
        //Se inician los objetos
        Salario empleado = new Salario();
        Scanner sc = new Scanner(System.in);
        // Se solicitan los datos y se guardan en memoria
        System.out.println("Ingrese nombre del empleado:");
        String nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese edad empleado: ");
        int edadEmpleado = sc.nextInt();
        System.out.println("Ingrese salario empleado: ");
        double salarioEmpleado = sc.nextDouble();
        System.out.println("*********************************************");
        //Se usa el constructor para usar el método salario de la clase Salario
        empleado.salario(nombreEmpleado, edadEmpleado, salarioEmpleado);
        sc.close();
    }
}

