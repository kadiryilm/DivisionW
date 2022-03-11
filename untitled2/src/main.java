import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner (System.in);
        System.out.print("Sayı giriniz: ");
        k = inp.nextInt();
        int i = 0;
        double sum = 0 , count = 0 ;

        while(i<=k){
            i++;
            if(i %3 == 0 || i%4 == 0 ){
                System.out.println(i);
                sum = sum + i ;
                count ++ ;
                }
            }
        double average = sum / count;
        if(count==0){
            System.out.println("3 ve 4'e bölünen sayıların ortalaması = 0");
        }else{
            System.out.println("3 ve 4'e bölünen sayıların ortalaması :"+average);

        }
    }
}