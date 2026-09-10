class Product{
    String name;
    int price;
    String category ;
    Product(String name){
        this.name=name;
        this.price=0;
        this.category="General";
    }
    Product(String name,int price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    void display(){
        System.out.println("Product name "+name);
        System.out.println("Product Price "+price);
        System.out.println("Product category "+category);
    }

}


public class ProductTest {
    public static void main(String[] args) {
        Product p1=new Product("keyword");
        Product p2=new Product("Laptop",55000,"Electronics");
        p1.display();
        p2.display();
    }
}
