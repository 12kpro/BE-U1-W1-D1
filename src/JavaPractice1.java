import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class JavaPractice1 {

	public static void main(String[] args) {
        System.out.println("This is my first Epicode Java Project!");
        
        int a = 5;
        int b = 8;
        int prodotto = Moltiplica(a, b);
        System.out.println("Il prodotto di " + a + " e " + b + " è " + prodotto);
        

        String concatenazione = Concatena("Cervi", 4);
        System.out.println("Concatenazione: " + concatenazione);
        
        String arrayDiPartenza [] = {"Cervo","Cinghiale","Lepre","Fagiano","Capriolo"};
        String newArray [] = InserisciInArray(arrayDiPartenza, "Spezzatino");
        System.out.println("Array di partenza: " + Arrays.toString(arrayDiPartenza));
        System.out.println("Nuovo array: " + Arrays.toString(newArray));
        
        InserisciEConcatena();
        
        double lunghezza = 5.2;
        double larghezza = 3.1;
        double perimetro = PerimetroRettangolo(lunghezza, larghezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        
        int numero = 17;
        int risultato = PariDispari(numero);
        System.out.println("Il numero " + numero + " è " + (risultato == 0 ? "pari" : "dispari"));
        
        double lato1 = 2.2;
        double lato2 = 3.2;
        double lato3 = 2.8;
        double area = AreaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);
        
    }
    
    public static int Moltiplica(int x, int y) {
        return x * y;
    }
    
    public static String Concatena(String txt, int num) {
        return txt + Integer.toString(num);
    }

    
    public static String [] InserisciInArray(String[] arrayDiStringhe, String nuovaStringa) {
    	String results [] = new String[6];
    	System.arraycopy(arrayDiStringhe, 0, results, 0, 3);
    	System.arraycopy(arrayDiStringhe, 3, results, 4, 2);
    	results[3] = nuovaStringa;
    	return results;
    }
    
    public static void InserisciEConcatena() {
        Scanner input = new Scanner(System.in);
        String[] inputArray = new String[3];
        
        System.out.print("Inserisci la prima stringa: ");
        inputArray[0] = input.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        inputArray[1] = input.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        inputArray[2] = input.nextLine();
        
        System.out.println(inputArray[0] + inputArray[1] + inputArray[2]);
        
        Collections.reverse(Arrays.asList(inputArray));
        System.out.println(inputArray[0] + inputArray[1] + inputArray[2]);
        
        input.close();
    }
    
    public static double PerimetroRettangolo(double lunghezza, double larghezza) {
        return 2 * (lunghezza + larghezza);
    }
    
    public static int PariDispari(int numero) {
    	return numero % 2== 0 ? 0 : 1;
    }
    
    public static double AreaTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2.0;

        double area = Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));

        return area;
    }
}

