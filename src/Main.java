import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        int l;
        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü Alınacak Sayı Giriniz: ");
        k= inp.nextInt();

        System.out.println("Üs Olacak Sayı: ");
        l=inp.nextInt();

        int tot=1;

        for (int i=1; i<=k; i++ ) {
                tot *= l;

            }
        System.out.println("Sonuç: "+(tot));
        }

    }
