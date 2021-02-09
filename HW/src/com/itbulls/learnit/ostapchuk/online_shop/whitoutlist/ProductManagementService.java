package whitoutlist;

public interface ProductManagementService {
	
	Product[] getProducts();

	Product getProductById(int productIdToAddToCart);

}
