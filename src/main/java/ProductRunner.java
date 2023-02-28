import java.util.Scanner;

public class ProductRunner {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner scan = new Scanner(System.in);

        String select;
        do {
            System.out.println("====MINI MARKET====");
            System.out.println("Yapmak istediginiz islemi giriniz.");
            System.out.println("1-Urunleri gormek icin\n" +
                    "2-Urun satin almak icin\n" +
                    "3-Urun eklemek icin\n" +
                    "4-Ucret odemek icin\n" +
                    "0-Cikis");
            select = scan.nextLine();
            System.out.println("Seciminiz : ");
            ProductService service = new ProductService();
            switch (select) {
                case "1":
                    //urunleri listeleme
                    service.listProduct();
                    start();
                   break;
                case "2"://urun satin almak
                    service.buyProduct();
                    break;
                case "3"://urun eklemek
                    service.addProduct();

                    break;
                case "4"://ucret odemek
                    break;
                case "0"://cikis
                    System.out.println("Yine bekleriz");
                    break;
                default:
                    System.out.println("Yanlis secim yaptiniz.");
            }
        } while (select.equals("0"));
    }
}