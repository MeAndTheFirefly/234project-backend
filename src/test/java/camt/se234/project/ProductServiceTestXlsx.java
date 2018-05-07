package camt.se234.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import camt.se234.project.entity.Product;
import camt.se234.project.service.ProductService;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTestXlsx {

	@Autowired
	ProductService productSrv;

	@Test
	public void testProductSrv() { // test products with the data from xlsx file.
		assertThat(productSrv, is(notNullValue()));
		List<Product> products = productSrv.getAllProducts();
		assertThat(products, is(notNullValue()));
		assertThat(products.size(), is(6));
		assertThat(products.get(0),
				is(new Product("p0001", "Garden", "The garden which you can grow everything on earth",
						"http://localhost:8080/images/garden.jpg", 20000)));
		assertThat(products.get(1), is(new Product("p0002", "Banana", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 150)));
		assertThat(products.get(2), is(new Product("p0003", "Orange", "Nothing good about it",
				"http://localhost:8080/images/orange.jpg", 280)));
		assertThat(products.get(3), is(
				new Product("p0004", "Papaya", "Use for papaya salad", "http://localhost:8080/images/papaya.jpg", 12)));
		assertThat(products.get(4), is(new Product("p0005", "Rambutan", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 20)));
		assertThat(products.get(5),
				is(new Product("p0006", "Unknow", "Don't use this", "http://localhost:8080/images/rambutan.jpg", -1)));
	}

	@Test
	public void testGetAvailProd() { // test getAvailableproducts with the data from xlsx file.
		List<Product> list = productSrv.getAvailableProducts();
		assertThat(list.size(), is(5));
		assertThat(list.get(0), is(new Product("p0001", "Garden", "The garden which you can grow everything on earth",
				"http://localhost:8080/images/garden.jpg", 20000)));
		assertThat(list.get(1), is(new Product("p0002", "Banana", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 150)));
		assertThat(list.get(2), is(new Product("p0003", "Orange", "Nothing good about it",
				"http://localhost:8080/images/orange.jpg", 280)));
		assertThat(list.get(3), is(
				new Product("p0004", "Papaya", "Use for papaya salad", "http://localhost:8080/images/papaya.jpg", 12)));
		assertThat(list.get(4), is(new Product("p0005", "Rambutan", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 20)));
	}

	@Test
	public void testGetUnavailProd() { // test getUnavailableproducts with the data from xlsx file.
		assertThat(productSrv.getUnavailableProductSize(), is(1));
	}
}
