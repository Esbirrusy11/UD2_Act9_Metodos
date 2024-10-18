
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean boo = true;

        do {
            System.out.println("Menú");
            System.out.println("1: EsCapicua");
            System.out.println("2: EsPrimo");
            System.out.println("3: Siguiente primo");
            System.out.println("4: Potencia");
            System.out.println("5: Digitos");
            System.out.println("6: Voltea");
            System.out.println("7: DigitoN");
            System.out.println("8: PosiciónDeDigito");
            System.out.println("9: QuitaPorDetrás");
            System.out.println("10: QuitaPorDelante");
            System.out.println("11: PegaPorDetrás");
            System.out.println("12: PegaPorDelante");
            System.out.println("13: TrozoDeNúmero");
            System.out.println("14: JuntaNúmeros");
            System.out.println("0: Salir ");

            try {
                int i = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Introduce un número para comprobar si es capicua: ");
                        int num2 = sc.nextInt();
                        System.out.println(EsCapicua(num2));
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Introduce un número para comprobar si es primo: ");
                        int num3= sc.nextInt();
                        System.out.println(EsPrimo(num3));
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.println("Introduce un número para encontrar el primo más cercano: ");
                        int num4= sc.nextInt();
                        System.out.println("El número primo más cercano es: " + SiguientePrimo(num4));
                        System.out.println(" ");
                        break;
                    case 4:
                        System.out.println("Introduce una base: ");
                        int base = sc.nextInt();
                        System.out.println("Introduce un exponente");
                        int exponente = sc.nextInt();
                        System.out.println(Potencia(base, exponente));
                        System.out.println(" ");
                        break;
                    case 5:
                        System.out.println("Introduce un número para contar sus dígitos: ");
                        int num1 = sc.nextInt();
                        System.out.println("El número tiene " + Digitos(num1) + " dígitos");
                        System.out.println(" ");
                        break;
                    case 6:
                        System.out.println("Introduce un número al que voltear: ");
                        int num = sc.nextInt();
                        System.out.println("El número volteado es: " + Voltea(num));
                        System.out.println(" ");
                        break;
                    case 7:
                        System.out.println("Introduce un número: ");
                        int num5= sc.nextInt();
                        System.out.println("¿Que Dígito quieres mostrar?: ");
                        int digito= sc.nextInt();
                        System.out.println("El dígito en la posición "+ digito+" es "+DigitoN(num5,digito));
                        System.out.println(" ");
                        break;
                    case 8:
                        System.out.println("Introduce un número: ");
                        int num6= sc.nextInt();
                        System.out.println("¿Que dígito quieres mostrar?: ");
                        int digito2= sc.nextInt();
                        System.out.println(PosicionDeDigito(num6,digito2));
                        System.out.println(" ");
                        break;
                    case 9:
                        System.out.println("Introduce un número al que quitarle números: ");
                        int num7= sc.nextInt();
                        System.out.println("¿Cuántos números le quieres quitar por detrás?: ");
                        int detras= sc.nextInt();
                        System.out.println("El número con "+detras+" quitados por detrás es: "+QuitaPorDetras(num7,detras));
                        System.out.println(" ");
                        break;
                    case 10:
                        System.out.println("Introduce un número al que quitarle números por delante: ");
                        int num8= sc.nextInt();
                        System.out.println("¿Cuántos números le quieres quitar por delante?: ");
                        int delante= sc.nextInt();
                        System.out.println("El número con "+delante+" quitados por delante es: "+QuitaPorDelante(num8,delante));
                        System.out.println(" ");
                        break;
                    case 11:
                        System.out.println("Introduce un número al que pegar por Detrás: ");
                        int num9= sc.nextInt();
                        System.out.println("¿Que dígito quieres pegar?:");
                        int pega= sc.nextInt();
                        System.out.print(PegaPorDetras(num9,pega));
                        System.out.print(pega);
                        System.out.println(" ");
                        break;
                    case 12:
                        System.out.println("Introduce un número:");
                        int num10= sc.nextInt();
                        System.out.println("¿Que dígito quieres pegar por delante?");
                        int pegad= sc.nextInt();
                        System.out.print(pegad);
                        System.out.println(PegaPorDelante(num10,pegad));
                        System.out.println(" ");
                        break;
                    case 13:
                        System.out.println("Introduce un número: ");
                        int posi= sc.nextInt();
                        System.out.println(TrozoDeNumero(posi));
                        System.out.println(" ");
                        break;
                    case 14:
                        System.out.println("Introduce el primer número: ");
                        int num11= sc.nextInt();
                        System.out.println("Introduce el segundo número: ");
                        int num12= sc.nextInt();
                        System.out.println("Los dos números juntos son: " + JuntaNumeros(num11,num12));
                        System.out.println(" ");
                        break;
                    case 0:
                        System.out.println("Gracias");
                        boo = false;
                        break;
                    default:
                        System.out.println("Número no válido");
                        System.out.println(" ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se permiten números ");
                System.out.println(" ");
                sc.nextLine();
            }
        } while (boo);
    }

    public static int Voltea(int num1) {
        int volteado = 0;
        int digito;
        while (num1 > 0) {
            digito = num1 % 10;
            num1 = num1 / 10;
            volteado = volteado * 10 + digito;
        }
        return volteado;
    }
    public static int Potencia(int num1, int pot) {
        return (int) Math.pow(num1, pot);
    }
    public static int Digitos(int num) {
       int cont=0;
       while (num!=0){
           num=num/10;
           cont++;
        }
       return cont;
    }
    public static boolean EsCapicua(int num) {
        if (num == Voltea(num)) {
            return true;
        }
        return false;
    }
    public static boolean EsPrimo(int num) {
        int cont=0;
       for (int k=1;k<=num;k++) {
           if (num % k == 0) {
               cont++;
           }
           } if (cont == 2) {
               return true;
           }
           cont = 0;
        return false;
    }
    public static int SiguientePrimo(int num){
        while (!EsPrimo(num)){
            num++;
        }
        return num;
    }
    public static int DigitoN(int num,int num2) {
        int numero=Voltea(num)/Potencia(10,(num2));
        int solucion= numero % 10;
        return solucion;
    }
    public static int PosicionDeDigito(int num,int num2) {
        int cont = 1;
        int num3 = Voltea(num);
        do {
            num3 = num3 / 10;
            cont++;
            if (num3 <= 0) {
                return -1;
            }
        } while (num3 % 10 != num2);
        return cont;

    }
        public static int QuitaPorDetras(int num, int detras){
        return num/Potencia(10,detras);
    }
    public static int QuitaPorDelante(int num, int delante){
        num=Voltea(num);
        num=num/ Potencia(10,delante);
        num=Voltea(num);
        return num;
    }
    public static int PegaPorDetras(int num,int pega){
        return num;
    }
    public static int PegaPorDelante(int num, int pegad){
        return num;
    }
    public static int JuntaNumeros(int num, int num2){
        System.out.print(num);
        System.out.println(num2);
        return ' ';
    }
    public static int TrozoDeNumero(int num){
        num=QuitaPorDelante(num,1);
        num=QuitaPorDetras(num,1);
        return num;
    }
}

