# Ledger Application
The solution is aimed to store all products' details kept in the inventory and also do certain opeartions like (adding new product, buying, selling, profit counting etc). I used java HashMap to solve the problem and store data. 

###(a) This Application can be thought of more like a MVC(Model, View, Controller) pattern. Here the "Product.java" contains all the abstract information of a particular Product. "MyShop.java" contains all the logic of how to delete, sell, buy a product from a shop and in "Ledger_Application.java" user interacts with the UI to give command.

(b) Also, Here I used "Encapsulation" property of OOP to with access modifiers(e.g., Private) to encapsulate the information of Product class and used getters and setters to access them later.

(c) I also used Singleton pattern as there can be only one MyShop instance can be created.



1. Add a product
  a. A product should have this information
    i. Product name
    ii. Buy price
    iii. Sell price
    iv. Available number in the inventory to sell
    v. Total profit selling the product
  b. One must input all the info in a natural number to add a
  product.
2. Delete a product
  a. When a product is deleted, it will not show in the list but
  the profit made from the product will still be there in the
  available balance.
3. Buy a product
  a. You will select the product and the number of products that
  you bought. It will add the number to the inventory of that
  product. The total buy price of the products should be
  subtracted from the available balance.
4. Sell a product
  a. You will select the product and the number of products that
  you sold.
  b. The profit is the difference between the buying price and
  the selling price. The number should be added to profit and
  the whole selling price should be added to available money.
  c. The number of selling products can not exceed the number
  available in the inventory.
5. See the list of products
  a. This list will include the name of the products, the number
  of available products in the inventory, and also the profit
  from each product. 
6. See available balance
![Initial Balance](https://user-images.githubusercontent.com/49761339/112669110-82241a80-8e89-11eb-916f-d7ac561a1f24.PNG)
![Five_Products_Added](https://user-images.githubusercontent.com/49761339/112669105-805a5700-8e89-11eb-89f5-80f6584b7a42.PNG)
![Sell_Three_Product](https://user-images.githubusercontent.com/49761339/112669112-82bcb100-8e89-11eb-8a03-6013fe2a86a5.PNG)
