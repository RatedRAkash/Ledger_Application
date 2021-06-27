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
public class Product {
    
    private int buy_price;
    private int sell_price;
    private int amount_in_inventory;
    private int profit_selling_product;
    private int delete_flag;
    private int ID;
    private String name;
    
    Product(String name, int buy_price, int sell_price, int amount_in_inventory)
    {
        this.name=name;
        this.buy_price=buy_price;
        this.sell_price=sell_price;
        this.amount_in_inventory=amount_in_inventory;
        //this.profit_selling_product=profit_selling_product;
        this.delete_flag=0;
    }

    
    
    
    public int getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(int buy_price) {
        this.buy_price = buy_price;
    }

    public int getSell_price() {
        return sell_price;
    }

    public void setSell_price(int sell_price) {
        this.sell_price = sell_price;
    }

    public int getAmount_in_inventory() {
        return amount_in_inventory;
    }

    public void setAmount_in_inventory(int amount_in_inventory) {
        this.amount_in_inventory = amount_in_inventory;
    }

    public int getProfit_selling_product() {
        return profit_selling_product;
    }

    public void setProfit_selling_product(int profit_selling_product) {
        this.profit_selling_product = profit_selling_product;
    }

    public int getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
