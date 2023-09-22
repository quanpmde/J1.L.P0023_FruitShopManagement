import controller.FruitManagement;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FruitManagement mg = new FruitManagement();
        while(true){
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("1. Create fruit ");
            System.out.println("2. View order");
            System.out.println("3. Shopping ");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1: mg.createProduct();
                    break;
                case 2: mg.viewOrders();
                    break;
                case 3:
                    mg.shopping();
                case 4:
                    System.out.println("Exited");
                    return;
                default:
                    System.err.println("Choose 1 to 4");
            }
        }
    }
}
