import java.util.Scanner;

public class CEjemplo04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculadora de indice de Masa Corporal (IMC)");
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = teclado.nextDouble();
        
        System.out.print("Ingrese su altura en metros: ");
        double altura = teclado.nextDouble();
        
        double imc = calcularIMC(peso, altura);
        
        System.out.println("Su IMC es: " + imc);
        System.out.println("Interpretacion del IMC:");
        interpretarIMC(imc);
        
        teclado.close();
    }
    
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
    
    public static void interpretarIMC(double imc) {
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}