package camt.se234.project;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.service.ProductService;
import camt.se234.project.service.ProductServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductServiceTestsMock {
	@Autowired
	ProductService productSrv;
	
	@Test
	@Before
	public void mockSetup() { // initial set up for mock data.
		ProductDao productDao = mock(ProductDao.class);
		((ProductServiceImpl) productSrv).setProductDao(productDao);
		List<Product> mockProducts = new ArrayList<Product>();
		mockProducts.add(new Product("p01", "Den", "My garden den", "http://localhost:8080/images/p01.jpg", 11));
		mockProducts.add(new Product("p02", "Ban", "Thai house", "http://localhost:8080/images/p02.jpg", 22));
		mockProducts.add(new Product("p03", "Org", "Nasty fruit", "http://localhost:8080/images/p03.jpg", 33));
		mockProducts.add(new Product("p04", "Pap", "Nice fruit", "http://localhost:8080/images/p04.jpg", 44));
		mockProducts.add(new Product("p05", "Ram", "Southern fruit", "http://localhost:8080/images/p05.jpg", 55));
		mockProducts.add(new Product("p06", "Oop", "My mistake", "http://localhost:8080/images/p06.jpg", -1));
		when(productDao.getProducts()).thenReturn(mockProducts);
	}

	@Test
	public void testGetAllProdMock() { // test get all products with mock data.
		List<Product> list = productSrv.getAllProducts();
		assertThat(list.size(), is(6));
		assertThat(list.get(0),
				is(new Product("p01", "Den", "My garden den", "http://localhost:8080/images/p01.jpg", 11)));
		assertThat(list.get(1),
				is(new Product("p02", "Ban", "Thai house", "http://localhost:8080/images/p02.jpg", 22)));
		assertThat(list.get(2),
				is(new Product("p03", "Org", "Nasty fruit", "http://localhost:8080/images/p03.jpg", 33)));
		assertThat(list.get(3),
				is(new Product("p04", "Pap", "Nice fruit", "http://localhost:8080/images/p04.jpg", 44)));
		assertThat(list.get(4),
				is(new Product("p05", "Ram", "Southern fruit", "http://localhost:8080/images/p05.jpg", 55)));
		assertThat(list.get(5),
				is(new Product("p06", "Oop", "My mistake", "http://localhost:8080/images/p06.jpg", -1)));
	}

	@Test
	public void testGetAvailProdMock() { // test getAvailableproducts with mock data.
		List<Product> list = productSrv.getAvailableProducts();
		assertThat(list.size(), is(5));
		assertThat(list.get(0),
				is(new Product("p01", "Den", "My garden den", "http://localhost:8080/images/p01.jpg", 11)));
		assertThat(list.get(1),
				is(new Product("p02", "Ban", "Thai house", "http://localhost:8080/images/p02.jpg", 22)));
		assertThat(list.get(2),
				is(new Product("p03", "Org", "Nasty fruit", "http://localhost:8080/images/p03.jpg", 33)));
		assertThat(list.get(3),
				is(new Product("p04", "Pap", "Nice fruit", "http://localhost:8080/images/p04.jpg", 44)));
		assertThat(list.get(4),
				is(new Product("p05", "Ram", "Southern fruit", "http://localhost:8080/images/p05.jpg", 55)));
	}

	@Test
	public void testGetUnavailProdMock() { // test getUnavailableproducts with mock data.
		assertThat(productSrv.getUnavailableProductSize(), is(1));
	}
	

}
