package com.itbulls.learnit.ostapchuk.online_shop.withlist;

import org.junit.Before;
import org.junit.Test;

import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.DefaultCart;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.DefaultProduct;
import com.itbulls.learnit.ostapchuk.online_shop.withoutlist.Product;

public class DefaultCartTest {
	private static final int MORE_THAN_TEN = 20;
	private DefaultCart testInstance;
	
	@Before
	public void setUp() {
		testInstance = new DefaultCart();
	}
	
	@Test
	public void shouldAddProductToCart() {
		Product product = new DefaultProduct();
		
		testInstance.addProduct(product);
		
		assertEquals(1, testInstance.getProducts().size());
		assertSame(product, testInstance.getProducts().get(0));
	}
	
	@Test
	public void shouldNotAddProductToCartIfProductIsNull() {
		testInstance.addProduct(null);
		
		assertEquals(0, testInstance.getProducts().size());
	}
	
	@Test
	public void shouldClearCart() {
		Product product = new DefaultProduct();
		
		testInstance.addProduct(product);
		testInstance.clear();
		
		assertEquals(0, testInstance.getProducts().size());
	}
	
	@Test
	public void shouldCheckIfCartIsEmpty() {
		assertTrue(testInstance.isEmpty());
	}
	
	@Test
	public void shouldCheckIfCartIsNotEmpty() {
		Product product = new DefaultProduct();
		
		testInstance.addProduct(product);
		
		assertFalse(testInstance.isEmpty());
	}
	
	@Test
	public void shouldAddMoreThanTenProducts() {
		Product product = new DefaultProduct();
		
		for (int i = 0; i < MORE_THAN_TEN; i++) {
			testInstance.addProduct(product);
		}
		
		assertEquals(MORE_THAN_TEN, testInstance.getProducts().size());
	}
}
