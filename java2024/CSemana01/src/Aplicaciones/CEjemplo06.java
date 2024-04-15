import java.util.Scanner;

public class CEjemplo06 {
    public static void main(String[] args) {
        // Crear un Scanner para la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar al usuario la base del rectángulo
        System.out.print("Ingrese la base del rectangulo: ");
        double base = teclado.nextDouble();
        
        // Solicitar al usuario la altura del rectángulo
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = teclado.nextDouble();
        
        // Calcular el área del rectángulo
        double area = calcularArea(base, altura);
        
        // Calcular el perímetro del rectángulo
        double perimetro = calcularPerimetro(base, altura);
        
        // Mostrar el área y el perímetro del rectángulo
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        // Cerrar el Scanner
        teclado.close();
    }
    
    // Método para calcular el área del rectángulo
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
    
    // Método para calcular el perímetro del rectángulo
    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}