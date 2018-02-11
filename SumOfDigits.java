import java.util.Scanner;

public class SumOfDigits
{
    public static void main(String[] args) {
        // Codigo por www.desarrollaraplicaciones.com
    int n;
    int aux;
    Scanner teclado=new Scanner(System.in);
    System.out.println("Introduce el numero");
    n=teclado.nextInt();
    aux=n;
    int total=0;
    while(n != 0){
    total=total+n%10;
        n=n/10;
    }
    System.out.println("La suma de las cifras de "+aux+" es "+total);
    }
}
