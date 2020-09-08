import java.util.Scanner;  
public class Opacko {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte libovolne cislo: ");
        int number = sc.nextInt();
        int i,num = 0;
        String numbers = ""; 
        
        
        if(number % 7 == 0) {
            System.out.println("Cislo je delitelne 7.");
        } else {
            System.out.println("Cislo neni delitelne 7.");
        }
        System.out.println("Zde jsou vsechny prvo cisla: ");
        for (i = 1; i<=100; i++){
            int x = 0;
            for(num = i; num>=1; num--) {
                if(i % num == 0){
 		            x = x + 1;}}
            if (x == 2){
	            numbers = numbers + i + " ";}	
        }
        System.out.println(numbers);
    }
}