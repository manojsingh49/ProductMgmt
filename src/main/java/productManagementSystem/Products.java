package productManagementSystem;

public class Products {
    private int productId;
    private String productName;
    private int productQty;
    private double price;


    public Products(int productId, String productName, int productQty, double price) {
        this.productId = productId;
        this.productName = productName;
        this.productQty = productQty;
        this.price = price;
    }
    public Products(){

    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


