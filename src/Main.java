import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String first_name=sc.nextLine();

        System.out.println("Podaj swoje nazwisko");
        String last_name=sc.nextLine();

        //System.out.println("Podaj swój adres");
        //String adress=sc.nextLine();

        System.out.println("Podaj swój wiek");
        int age=sc.nextInt();

        if (age<18) {
            System.out.println("wyp.... szczylu!!!");
        }else{
            System.out.println("Zapraszam królewiczu złoty... niunie już czekajo... ;)");
        }
        //System.out.println(first_name +" "+ last_name +" "+age + " lat " );

    }

}
