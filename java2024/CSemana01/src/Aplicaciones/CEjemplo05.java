import java.util.Scanner;

public class CEjemplo05 {
    public static void main(String[] args) {
        // Definir el costo por metro cuadrado
        double costoPorMetroCuadrado = 750; // en soles
        
        // Crear un Scanner para la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar al usuario la longitud del terreno
        System.out.print("Ingrese la longitud del terreno en metros: ");
        double longitud = teclado.nextDouble();
        
        // Solicitar al usuario el ancho del terreno
        System.out.print("Ingrese el ancho del terreno en metros: ");
        double ancho = teclado.nextDouble();
        
        // Calcular el área del terreno
        double area = calcularArea(longitud, ancho);
        
        // Calcular el precio del terreno
        double precio = calcularPrecio(area, costoPorMetroCuadrado);
        
        // Mostrar el área y el precio del terreno
        System.out.println("El Area del terreno es: " + area + " metros cuadrados");
        System.out.println("El precio del terreno es: S/ " + precio);
        
        // Cerrar el Scanner
        teclado.close();
    }
    
    // Método para calcular el área del terreno
    public static double calcularArea(double longitud, double ancho) {
        return longitud * ancho;
    }
    
    // Método para calcular el precio del terreno
    public static double calcularPrecio(double area, double costoPorMetroCuadrado) {
        return area * costoPorMetroCuadrado;
    }
}