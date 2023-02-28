public class Product {
    private static int count=115;
    private int id;
    private int stock;
    private String name;
    private double price;
    private String make;

    public Product(int id, String make, String name, double price,int stock) {
        count++;
        this.id=count;
        this.name = name;
        this.price = price;
        this.stock=stock;
        this.make=make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
