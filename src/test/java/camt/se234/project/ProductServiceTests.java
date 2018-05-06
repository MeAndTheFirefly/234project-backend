package camt.se234.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.service.ProductService;
import camt.se234.project.service.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTests {

	@Autowired
	ProductService productSrv;

	@Test
	public void testProductSrv() {
		assertThat(productSrv, is(notNullValue()));
		List<Product> products = productSrv.getAllProducts();
		assertThat(products, is(notNullValue()));
		assertThat(products.size(), is(6));
		assertThat(products.get(0), is(new Product("p0001", "Garden", "The garden which you can grow everything on earth", "http://localhost:8080/images/garden.jpg", 20000)));
		assertThat(products.get(1), is(new Product("p0002", "Banana", "A good fruit with very cheap price", "http://localhost:8080/images/banana.jpg", 150)));
		assertThat(products.get(2), is(new Product("p0003", "Orange", "Nothing good about it", "http://localhost:8080/images/orange.jpg", 280)));
		assertThat(products.get(3), is(new Product("p0004", "Papaya", "Use for papaya salad", "http://localhost:8080/images/papaya.jpg", 12)));
		assertThat(products.get(4), is(new Product("p0005", "Rambutan", "An expensive fruit from the sout", "http://localhost:8080/images/rambutan.jpg", 20)));
		assertThat(products.get(5), is(new Product("p0006", "Unknow", "Don't use this", "http://localhost:8080/images/rambutan.jpg", -1)));
	}

	@Test
	public void mockSetup() {
		ProductDao productDao = mock(ProductDao.class);
		((ProductServiceImpl) productSrv).setProductDao(productDao);
		List<Product> mockProducts = new ArrayList<Product>();
		mockProducts.add(new Product("p0001", "Garden", "The garden which you can grow everything on earth", "http://localhost:8080/images/garden.jpg", 20000));
		mockProducts.add(new Product("p0002", "Banana", "A good fruit with very cheap price", "http://localhost:8080/images/banana.jpg", 150));
		mockProducts.add(new Product("p0003", "Orange", "Nothing good about it", "http://localhost:8080/images/orange.jpg", 280));
		mockProducts.add(new Product("p0004", "Papaya", "Use for papaya salad", "http://localhost:8080/images/papaya.jpg", 12));
		mockProducts.add(new Product("p0005", "Rambutan", "An expensive fruit from the sout", "http://localhost:8080/images/rambutan.jpg", 20));
		mockProducts.add(new Product("p0006", "Unknow", "Don't use this", "http://localhost:8080/images/rambutan.jpg", -1));
		when(productDao.getProducts()).thenReturn(mockProducts);
	}

	@Test
	public void testGetAllProdMock() {
		List<Product> list = productSrv.getAllProducts();
		assertThat(list.size(), is(6));
		assertThat(list.get(0), is(new Product("p0001", "Garden", "The garden which you can grow everything on earth", "http://localhost:8080/images/garden.jpg", 20000)));
		assertThat(list.get(1), is(new Product("p0002", "Banana", "A good fruit with very cheap price", "http://localhost:8080/images/banana.jpg", 150)));
		assertThat(list.get(2), is(new Product("p0003", "Orange", "Nothing good about it", "http://localhost:8080/images/orange.jpg", 280)));
		assertThat(list.get(3), is(new Product("p0004", "Papaya", "Use for papaya salad", "http://localhost:8080/images/papaya.jpg", 12)));
		assertThat(list.get(4), is(new Product("p0005", "Rambutan", "An expensive fruit from the sout", "http://localhost:8080/images/rambutan.jpg", 20)));
		assertThat(list.get(5), is(new Product("p0006", "Unknow", "Don't use this", "http://localhost:8080/images/rambutan.jpg", -1)));
	}

	@Test
	public void testGetAvailProdMock() {
		List<Product> list = productSrv.getAvailableProducts();
		assertThat(list.size(), is(5));
		assertThat(list.get(0), is(new Product("p0001", "Garden", "The garden which you can grow everything on earth", "http://localhost:8080/images/garden.jpg", 20000)));
		assertThat(list.get(1), is(new Product("p0002", "Banana", "A good fruit with very cheap price", "http://localhost:8080/images/banana.jpg", 150)));
		assertThat(list.get(2), is(new Product("p0003", "Orange", "Nothing good about it", "http://localhost:8080/images/orange.jpg", 280)));
		assertThat(list.get(3), is(new Product("p0004", "Papaya", "Use for papaya salad", "http://localhost:8080/images/papaya.jpg", 12)));
		assertThat(list.get(4), is(new Product("p0005", "Rambutan", "An expensive fruit from the sout", "http://localhost:8080/images/rambutan.jpg", 20)));
	}

	@Test
	public void testGetUnavailProdMock() {
		assertThat(productSrv.getUnavailableProductSize(), is(1));
	}
}




