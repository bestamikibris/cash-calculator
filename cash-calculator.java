import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    double pearsPrice = 2.14, applesPrice = 3.67, tomatoesPrice = 1.11, bananasPrice = 0.95, auberginesPrice = 5.00;
    
    double pearsWeight, applesWeight, tomatoesWeight, bananasWeight, auberginesWeight;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Armut Miktarını Giriniz: ");
        pearsWeight= input1.nextDouble();
                
        Scanner input2 = new Scanner(System.in);
        System.out.print("Elma Miktarını Giriniz: ");
        applesWeight= input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.print("Domates Miktarını Giriniz: ");
        tomatoesWeight= input3.nextDouble();

        Scanner input4 = new Scanner(System.in);
        System.out.print("Muz Miktarını Giriniz: ");
        bananasWeight= input4.nextDouble();

        Scanner input5 = new Scanner(System.in);
        System.out.print("Patlican Miktarını Giriniz: ");
        auberginesWeight= input5.nextDouble();
               
        double totalPrice;
        totalPrice = ((pearsPrice*pearsWeight) + (applesPrice*applesWeight) + (tomatoesPrice*tomatoesWeight) + (bananasPrice*bananasWeight) + (auberginesPrice*auberginesWeight));
        System.out.println("Toplam Tutar: " + totalPrice + "TL");
               
               


    }
    
}
