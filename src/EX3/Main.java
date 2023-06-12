package EX3;

public class Main {
    public static void main(String[] args) {
        Category dm1 = new Category(1,"quan");
        Category dm2 = new Category(2,"ao");

        Product product1 = new Product(1,"quan au",150000,dm1);
        Product product2 = new Product(2,"quan jean",250000,dm1);

        Product product3 = new Product(3,"ao so mi",125000,dm2 );
        Product product4 = new Product(4,"ao phong",175000,dm2);

        System.out.println("tat ca cac san pham");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}
