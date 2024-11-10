package OOP.Store;

public class Store {
    public static Product[] products = new Product[10];

    public static int productsCount = 0;

    public static int a = products.length;

    public static void addProduct(Product product) {
        int percentage = (productsCount/a)*100;
        if (percentage >= 80){
            Product[] products1 = new Product[a*2];
            a = a*2;
            for (int i = 0; i < productsCount; i++) {
                products1[i] = products[i];
            }
            products = products1;
        }
        products[productsCount] = product;
        productsCount++;
    }

    public static void removeProduct(int a) {
        products[a-1] = null;
        for (int i = 0; i < productsCount-1; i++) {
            Product product = products[a-1];
            products[a-1+i] = products[a+i];
            products[a+i] = product;
        }
    }
}
