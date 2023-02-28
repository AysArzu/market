import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductService implements ProductMethods {
    static Scanner scan = new Scanner(System.in);
   static List<Product> myProduct = new ArrayList<>();

    public ProductService() {
        Product pr1 = new Product(101, "Eti", "Canga", 8.00, 25);
        Product pr2 = new Product(102, "Eti", "Crax", 6.00, 30);
        Product pr3 = new Product(103, "Eti", "Nero", 9.25, 10);
        Product pr4 = new Product(104, "Eti", "Etimek", 25.99, 7);
        Product pr5 = new Product(105, "Eti", "Browni", 4.35, 14);
        Product pr6 = new Product(106, "Eti", "Gong", 10.55, 12);
        Product pr7 = new Product(107, "Eti", "Cin 10'lu", 39.33, 5);
        Product pr8 = new Product(108, "Eti", "Burcak", 12.45, 7);
        Product pr9 = new Product(109, "Eti", "Kombo", 9.25, 21);
        Product pr10 = new Product(110, "Eti", "Topkek", 4.45, 22);
        Product pr11 = new Product(111, "Eti", "Karam", 8.45, 14);
        Product pr12 = new Product(112, "Eti", "Hosbes", 10.24, 16);
        Product pr13 = new Product(113, "Eti", "Bidolu", 7.99, 11);
        Product pr14 = new Product(114, "Eti", "Finger", 35.00, 6);
        Product pr15 = new Product(115, "Eti", "Lifalif", 22.99, 3);

        myProduct = new ArrayList<>(Arrays.asList(pr1, pr2, pr3, pr4, pr5, pr6, pr7, pr8, pr9, pr10, pr11, pr12, pr13, pr14, pr15));
    }


    @Override
    public void listProduct() {
        System.out.println("-----------------------------------");

        System.out.printf("\t%-3s | %-8s |  %-5s\n", "id", "Marka", "Urun", "Price");
        System.out.println("-----------------------------------");
        this.myProduct.forEach(product -> System.out.printf("\t%2s | %-3s | %-9s |  %-5s | %2s\n", product.getId(), product.getMake(),
                product.getName(), product.getPrice(), product.getStock()));
        System.out.println("-----------------------------------");
    }

    public double buyProduct() {

        System.out.println("Almak istediginiz urunun Id'sini giriniz");
        int buyid=scan.nextInt();

        double total=0;
        for(Product product:this.myProduct){
            if(product.getId()==buyid){
                System.out.println("kac adet alacaksiniz");
                int adet=scan.nextInt();
             return    total+= (product.getPrice()*adet);

            }else{
                System.out.println("yanlis secim yeniden deneyiniz");
                buyProduct();
                break;
            }
        }

        return total;
    }

    @Override
    public void addProduct() {
        System.out.println("Urunun markasi : ");
        String make = scan.nextLine();
        System.out.println("Urun adini giriniz");
        String name = scan.nextLine();

        boolean isExist = false;
        for (Product product : this.myProduct) {
            if (product.getMake().equalsIgnoreCase(make) && product.getName().equalsIgnoreCase(name)) {
                System.out.println("stok adetini giriniz");
                int addstock = scan.nextInt();
                int stoktaki= product.getStock();
                System.out.println(stoktaki);
               int adet= stoktaki+addstock;
                System.out.println(adet);
                System.out.println(product.getName());
                System.out.println(product.getMake());
                System.out.println(product.getStock());
               product.setStock(adet);
   product=new Product(product.getId(),product.getMake(),product.getName(),product.getPrice(),product.getStock());
               this.myProduct.add(product);
                System.out.println("Stok adedi guncellendi");
                isExist = true;
                ProductRunner.start();
                break;

            }
        }
        if (!isExist) {

            System.out.println("Urunun fiyatini giriniz");
            double price = scan.nextDouble();
            System.out.println("Urunun stogunu  giriniz");
            int stock = scan.nextInt();
            int id = 0;
            Product newProduct = new Product(id, make, name, price, stock);
            this.myProduct.add(newProduct);
        }
        listProduct();
        ProductRunner.start();
    }

    @Override
    public void deleteProduct() {
        System.out.println("Silmek istediginiz urunun Id'sini giriniz");
        int dltId=scan.nextInt();
        
        boolean isExist = true;
        for(Product product:this.myProduct){
            if(product.getId()==dltId){
                System.out.println("Iptal etmek istediginiz miktari giriniz");
                int num= scan.nextInt();

            }
        }

    }public void addSepet(){

    }
}
