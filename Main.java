import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int op=0;
        double mo=0, tl;
        Scanner lec = new Scanner(System.in);
        String menu= """
                        |-------------------------------------|
                        |BIENVENIDOS AL CONVERTIDOR DE MONEDAS|
                        |-------------------------------------|
                        |1.- Pesos Mexicanos a Dolares        |
                        |2.- Pesos Mexicanos a Euros          |
                        |3.- Pesos Mexicanos a Wones          |
                        |4.- Dolares a Pesos Mexicanos        |
                        |5.- Euros a Pesos Mexicanos          |
                        |6.- Won a Pesos mexicanos            |
                        |-------------------------------------|
                        | Elige una opcion                    |
                        |-------------------------------------|""";
        while (op != 6){
            System.out.println(menu);
            op = lec.nextInt();
            switch (op){
                case 1:
                    System.out.println("1.- Pesos Mexicanos a Dolares ");
                    System.out.println("Ingresa la cantidad a convertir ");
                    mo = lec.nextDouble();
                    tl = mo*0.059;
                    System.out.println("la conversion es de: "+tl+" Dolares");
                    break;
                case 2:
                    System.out.println("2.- Pesos Mexicanos a Euros");
                    System.out.println("Ingresa la cantidad a convertir ");
                    mo = lec.nextDouble();
                    tl = mo*0.055;
                    System.out.println("la conversion es de: "+tl+" Euros");
                    break;
                case 3:
                    System.out.println("3.- Pesos Mexicanos a Wones");
                    System.out.println("Ingresa la cantidad a convertir ");
                    mo = lec.nextDouble();
                    tl = mo*80.41;
                    System.out.println("la conversion es de: "+tl+" Wones");
                    break;
                case 4:
                    System.out.println("4.- Dolares a Pesos Mexicanos");
                    System.out.println("Ingresa la cantidad a convertir ");
                    mo = lec.nextDouble();
                    tl = mo*17.06;
                    System.out.println("la conversion es de: "+tl+" Pesos Mexicanos");
                    break;
                case 5:
                    System.out.println("5.- Euros a Pesos Mexicanos");
                    System.out.println("Ingresa la cantidad a convertir ");
                    mo = lec.nextDouble();
                    tl = mo*18.31;
                    System.out.println("la conversion es de: "+tl+" Pesos Mexicanos");
                    break;
                case 6:
                    System.out.println("6.- Won a Pesos mexicanos ");
                    System.out.println("Ingresa la cantidad a convertir ");
                    mo = lec.nextDouble();
                    tl = mo*0.012;
                    System.out.println("la conversion es de: "+tl+" Pesos Mexicanos");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

    }
}