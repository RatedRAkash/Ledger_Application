/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ledger_application;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RatedRAkash
 */
public class MyShop {
    
    static MyShop instance;
    private static int Balance;
    private static int coun;
    private static Map<Integer,Product> Product_Map;
    
    //Only ONE instance can created
    public static MyShop GetInstance(int Balance)
    {
        if(instance==null)
        {
            instance=new MyShop(Balance);
        }
                
        return instance;
    }
    
    //CONSTRUCTOR
    private MyShop(int Balance)
    {
        this.Balance=Balance;
        coun=0;
        Product_Map=new HashMap<Integer,Product>();
    }
        
    
    //FUNCTIONS
    static void Add_a_Product(String name, int buy_price, int sell_price, int amount)
    {
        Product ob = new Product(name, buy_price, sell_price, amount);//At first Zero Profit from Selling

        setCoun(getCoun() + 1); //Incementing ProductID
        Product_Map.put(getCoun(),ob);
    }
        
    static void Delete_a_Product(Integer ID)
    {
        try{
            Product_Map.get(ID).setDelete_flag(1);
        }
        
        catch(Exception e)
        {
            System.out.println("There is NO PRODUCT with this ID OR the Product has been deleted already");          
        }
    }
    
    static int Buy_a_Product(Integer ID, int amount)
    {
        try
        {
            int buying_price=(Product_Map.get(ID).getBuy_price())*amount;
            
            if(getBalance()>=buying_price)
            {
                setBalance(getBalance() - buying_price);
                Product_Map.get(ID).setAmount_in_inventory(Product_Map.get(ID).getAmount_in_inventory() + amount);
            }
        
            else
            {
                System.out.println("You do not have sufficient BALANCE");
            }
            
        }
        
        catch(Exception e)
        {
            System.out.println("There is NO PRODUCT with this ID");          
        }
        
        return getBalance();
    }
    
    static int Sell_a_Product(Integer ID, int amount)
    {
        try
        {
            if(Product_Map.get(ID).getAmount_in_inventory()>=amount)
            {
                int profit=(Product_Map.get(ID).getSell_price()-Product_Map.get(ID).getBuy_price())*amount;
            
                setBalance(getBalance() + profit);
            
                Product_Map.get(ID).setProfit_selling_product(Product_Map.get(ID).getProfit_selling_product() + profit);
                Product_Map.get(ID).setAmount_in_inventory(Product_Map.get(ID).getAmount_in_inventory() - amount);
            }
        
            else
            {
                System.out.println("You can not SELL that many items");
            }    
        }
        
        catch(Exception e)
        {
            System.out.println("There is NO PRODUCT with this ID");
        }
        
        
        
        return getBalance();
    }
    
    
    static void Show_All_Product()
    {
        int total=0;
        // Print the list objects in tabular format
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.printf("%5s %20s %25s %20s %25s %25s", "PRODUCT NO.", "PRODUCT NAME", "BUYING PRICE", "SELLING PRICE", "AMOUNT AVAILABLE", "PROFIT FROM PRODUCT");
	System.out.println();
	System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	for (Map.Entry<Integer,Product> entry : Product_Map.entrySet())
        {
            total+=entry.getValue().getProfit_selling_product();
            if(entry.getValue().getDelete_flag()==1)
            {
                
                System.out.format("%5s %20s %25s %20s %25s %25s",
				entry.getKey(), "Product Deleted", "N\\A", "N\\A", "N\\A", entry.getValue().getProfit_selling_product());	
                System.out.println();
            }
            else
            {
		System.out.format("%5s %20s %25s %20s %25s %25s",
				entry.getKey(), entry.getValue().getName(), entry.getValue().getSell_price(), entry.getValue().getBuy_price(), entry.getValue().getAmount_in_inventory(), entry.getValue().getProfit_selling_product());
		System.out.println();
	
            }
        }
	
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.format("%5s %20s %25s %20s %25s %25s",
				"TOTAL", " ", " ", " ", " ", total);	
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
	
        System.out.println();
	     
    }

    
    public static int getBalance() {
        return Balance;
    }

    public static void setBalance(int aBalance) {
        Balance = aBalance;
    }

    public static int getCoun() {
        return coun;
    }

    public static void setCoun(int aCoun) {
        coun = aCoun;
    }
    
}