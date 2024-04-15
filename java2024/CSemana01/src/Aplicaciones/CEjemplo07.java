import java.util.Scanner;

public class CEjemplo07 {
    public static void main(String[] args) {
        // Crear un Scanner para la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar al usuario el radio del cilindro
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = teclado.nextDouble();
        
        // Solicitar al usuario la altura del cilindro
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = teclado.nextDouble();
        
        // Calcular el área total del cilindro
        double areaTotal = calcularAreaTotal(radio, altura);
        
        // Calcular el volumen del cilindro
        double volumen = calcularVolumen(radio, altura);
        
        // Mostrar el área total y el volumen del cilindro
        System.out.println("El area total del cilindro es: " + areaTotal);
        System.out.println("El volumen del cilindro es: " + volumen);
        
        // Cerrar el Scanner
        teclado.close();
    }
    
    // Método para calcular el área total del cilindro
    public static double calcularAreaTotal(double radio, double altura) {
        return 2 * Math.PI * radio * (radio + altura);
    }
    
    // Método para calcular el volumen del cilindro
    public static double calcularVolumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }
}