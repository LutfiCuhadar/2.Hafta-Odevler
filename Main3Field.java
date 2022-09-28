
public class Main3Field {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop", "Hp Laptop", 3000, 2, "Siyah");
	
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
