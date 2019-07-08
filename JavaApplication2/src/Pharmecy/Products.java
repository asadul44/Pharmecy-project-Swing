
package Pharmecy;


public class Products {

    private int id;
    private String name;
    private int quantity;
    private float price;
private int avail;

    
    public Products() {
    }
 
    public Products(int id, String name, int quantity, float price,int avail){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.avail=avail;
    
    }


     
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
        
    }


    public void setPrice(float price) {
        this.price = price;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    

   
}
