package ArquivosEmJava.EPItensVendidoscsv.entities;

public class Product {

    private String product;
    private Double price;
    private Integer quantity;

    public Product(String product, Double price, Integer quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double total(){
        return this.price * this.quantity;
    }
}
