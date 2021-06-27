/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ledger_application;

import java.util.Scanner;;

/**
 *
 * @author RatedRAkash
 */
public class Ledger_Application {
    
    private static void init(){
        MyShop.Add_a_Product("TV", 22000, 25000, 10);
        MyShop.Add_a_Product("Mobile", 12000, 14000, 20);
        MyShop.Add_a_Product("AC", 30000, 45000, 15);
        MyShop.Add_a_Product("Headphone", 800, 850, 50);
        MyShop.Add_a_Product("VR set", 1000, 1200, 5);
        System.out.println("Initially 10 TV, 20 Mobile, 15 AC, 50 Headphones and 5 VR set are added.");

        MyShop.Sell_a_Product(1, 10);
        MyShop.Sell_a_Product(2, 5);
        MyShop.Sell_a_Product(4, 15);
        
    }


     public static void main(String[] args) {
        
        MyShop myshop = MyShop.GetInstance(0); //Only One Instance can be created for MYSHOP
        
        init(); //Initial Add Products
        
        while(true)
        {
            System.out.println("************************************************");
            
            System.out.println("Press: 0 (EXIT)");
            System.out.println("Press: 1 (Add a product)");
            System.out.println("Press: 2 (Delete a product)");
            System.out.println("Press: 3 (Buy a product)");         
            System.out.println("Press: 4 (Sell a product)"); 
            System.out.println("Press: 5 (See the list of products)"); 
            System.out.println("Press: 6 (See available balance)"); 
            
            System.out.println("************************************************");
            System.out.print("Enter Key: ");
            Scanner input=new Scanner(System.in);
            int selection = input.nextInt();

            int flag=0;
            switch(selection)
            {
                case 0:
                    //EXIT
                    flag=1;
                    break;
                    
                case 1:
                    //ADD PRODUCT
                    Scanner sc = new Scanner(System.in); 
        
                    System.out.print("Enter Name of the Product : "); 
                    String name=sc.next();
        
                    System.out.print("Enter Buy Price : ");  
                    int buy_price= sc.nextInt();  
        
                    System.out.print("Enter Sell Price : ");  
                    int sell_price= sc.nextInt();
        
                    System.out.print("Enter Amount available in inventory : ");  
                    int amount= sc.nextInt();
        
                    MyShop.Add_a_Product(name, buy_price, sell_price, amount);
        
                    break;

                case 2:
                    //DELETE PRODUCT
                    sc = new Scanner(System.in);
                    
                    System.out.print("Enter the Product Number You want to DELETE : ");  
                    int ID= sc.nextInt();
                    MyShop.Delete_a_Product(ID);
                    
                    break;

                case 3:
                    //BUY PRODUCT
                    sc = new Scanner(System.in);
                    
                    System.out.print("Enter the Product Number You want to BUY : ");  
                    ID = sc.nextInt();
                    
                    System.out.print("Enter the amount You want to Buy : ");  
                    amount = sc.nextInt();
                    
                    MyShop.Buy_a_Product(ID, amount);
                    break;
                    
                case 4:
                    //SELL PRODUCT
                    sc = new Scanner(System.in);
                    
                    System.out.print("Enter the Product Number You want to SELL : ");  
                    ID = sc.nextInt();
                    
                    System.out.print("Enter the amount You want to Sell : ");  
                    amount = sc.nextInt();
                    
                    MyShop.Sell_a_Product(ID, amount);
                    break;
                
                case 5:
                    //LIST of ALL PRODUCTS
                    MyShop.Show_All_Product();
                    break;
                
                case 6:
                    //AVAILABLE BALANCE
                    System.out.println("Available Balance is : " + MyShop.getBalance()+ " TK");
                    break;
            }
            
            if(flag==1)
            {
                break;
            }
            
            System.out.println("");
            
        }
        
    }
    
}