package camt.se234.project;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import camt.se234.project.dao.OrderDao;
import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import camt.se234.project.service.ProductServiceImpl;
import camt.se234.project.service.SaleOrderService;
import camt.se234.project.service.SaleOrderServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleOrderServiceTests {
	@Autowired
	SaleOrderService saleOrderSrv;

	@Test
	public void testSaleOrderSer() {
		Product Garden = new Product("p0001", "Garden", "The garden which you can grow everything on earth",
				"http://localhost:8080/images/garden.jpg", 20000);
		Product Banana = new Product("p0002", "Banana", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 150);
		Product Papaya = new Product("p0004", "Papaya", "Use for papaya salad",
				"http://localhost:8080/images/papaya.jpg", 12);
		Product Rambutan = new Product("p0005", "Rambutan", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 20);

		List<SaleTransaction> transactList1 = new ArrayList<SaleTransaction>();
		transactList1.add(new SaleTransaction("t001", Garden, 1));
		transactList1.add(new SaleTransaction("t002", Papaya, 10));
		assertThat(transactList1.size(),is(2));
		System.out.println(transactList1.toString());
		
		List<SaleTransaction> transactList2 = new ArrayList<SaleTransaction>();
		transactList2.add(new SaleTransaction("t003", Banana, 2));
		transactList2.add(new SaleTransaction("t004", Garden, 3));
		transactList2.add(new SaleTransaction("t005", Banana, 1));
		transactList2.add(new SaleTransaction("t006", Rambutan, 6));

		assertThat(saleOrderSrv, is(notNullValue()));
		List<SaleOrder> saleOrders = saleOrderSrv.getSaleOrders();
		assertThat(saleOrders, is(notNullValue()));
		assertThat(saleOrders.size(), is(2));
		assertThat(saleOrders.get(0), is(new SaleOrder("o001", transactList1)));
		assertThat(saleOrders.get(1), is(new SaleOrder("o002", transactList2)));
	}

	@Test
	public void mockSetup() {
		OrderDao orderDao = mock(OrderDao.class);
		((SaleOrderServiceImpl) saleOrderSrv).setOrderDao(orderDao);
		List<SaleOrder> mockOrders = new ArrayList<SaleOrder>();

		Product Garden = new Product("p0001", "Garden", "The garden which you can grow everything on earth",
				"http://localhost:8080/images/garden.jpg", 20000);
		Product Banana = new Product("p0002", "Banana", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 150);
		Product Orange = new Product("p0003", "Orange", "Nothing good about it",
				"http://localhost:8080/images/orange.jpg", 280);
		Product Papaya = new Product("p0004", "Papaya", "Use for papaya salad",
				"http://localhost:8080/images/papaya.jpg", 12);
		Product Rambutan = new Product("p0005", "Rambutan", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 20);
		Product Unknow = new Product("p0006", "Unknow", "Don't use this", "http://localhost:8080/images/rambutan.jpg",
				-1);

		SaleOrder order1 = new SaleOrder();
		order1.setSaleOrderId("o001");
		List<SaleTransaction> transactList1 = new ArrayList<SaleTransaction>();
		transactList1.add(new SaleTransaction("t001", Garden, 1));
		transactList1.add(new SaleTransaction("t002", Papaya, 10));
		mockOrders.add(order1);

		SaleOrder order2 = new SaleOrder();
		order2.setSaleOrderId("o002");
		List<SaleTransaction> transactList2 = new ArrayList<SaleTransaction>();
		transactList2.add(new SaleTransaction("t003", Banana, 2));
		transactList2.add(new SaleTransaction("t004", Garden, 3));
		transactList2.add(new SaleTransaction("t005", Banana, 1));
		transactList2.add(new SaleTransaction("t006", Rambutan, 6));
		mockOrders.add(order2);

		when(orderDao.getOrders()).thenReturn(mockOrders);
	}

	@Test
	public void testGetSaleOrdersWithMock() {
		List<SaleOrder> list = saleOrderSrv.getSaleOrders();
		assertThat(list.size(), is(2));
	}
}
