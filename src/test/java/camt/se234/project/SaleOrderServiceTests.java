package camt.se234.project;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
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
		assertThat(transactList1.size(), is(2));
		SaleOrder so1 = new SaleOrder("o001", transactList1);

		List<SaleTransaction> transactList2 = new ArrayList<SaleTransaction>();
		transactList2.add(new SaleTransaction("t003", Banana, 2));
		transactList2.add(new SaleTransaction("t004", Garden, 3));
		transactList2.add(new SaleTransaction("t005", Banana, 1));
		transactList2.add(new SaleTransaction("t006", Rambutan, 6));
		SaleOrder so2 = new SaleOrder("o002", transactList2);

		assertThat(saleOrderSrv, is(notNullValue()));
		List<SaleOrder> saleOrders = saleOrderSrv.getSaleOrders();
		assertThat(saleOrders, is(notNullValue()));
		assertThat(saleOrders.size(), is(2));
		assertThat(saleOrders.get(0), is(so1));
		assertThat(saleOrders.get(1), is(so2));
	}

	@Test
	public void testAvgOrderPrice() {
		// System.out.println("Average: " + saleOrderSrv.getAverageSaleOrderPrice());
		assertThat(saleOrderSrv.getAverageSaleOrderPrice(), is(40345.0));
	}

	@Test
	public void mockSetup() {
		OrderDao orderDao = mock(OrderDao.class);
		((SaleOrderServiceImpl) saleOrderSrv).setOrderDao(orderDao);
		List<SaleOrder> mockOrders = new ArrayList<SaleOrder>();
		Product Garden = new Product("p0001-mock", "Garden-mock", "The garden which you can grow everything on earth",
				"http://localhost:8080/images/garden.jpg", 999);
		Product Banana = new Product("p0002-mock", "Banana-mock", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 222);
		Product Papaya = new Product("p0004-mock", "Papaya-mock", "Use for papaya salad",
				"http://localhost:8080/images/papaya.jpg", 444);
		Product Rambutan = new Product("p0005-mock", "Rambutan-mock", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 111);

		List<SaleTransaction> transactMockList1 = new ArrayList<SaleTransaction>();
		transactMockList1.add(new SaleTransaction("t001-mock", Garden, 5));
		transactMockList1.add(new SaleTransaction("t002-mock", Papaya, 4));
		mockOrders.add(new SaleOrder("o001-mock", transactMockList1));

		List<SaleTransaction> transactMockList2 = new ArrayList<SaleTransaction>();
		transactMockList2.add(new SaleTransaction("t003-mock", Banana, 2));
		transactMockList2.add(new SaleTransaction("t004-mock", Garden, 3));
		transactMockList2.add(new SaleTransaction("t005-mock", Banana, 1));
		transactMockList2.add(new SaleTransaction("t006-mock", Rambutan, 6));
		mockOrders.add(new SaleOrder("o002-mock", transactMockList2));
		when(orderDao.getOrders()).thenReturn(mockOrders);
	}

	@Test
	public void testSaleAvgMock() {
		// System.out.println(saleOrderSrv.getAverageSaleOrderPrice());
		// assertThat(saleOrderSrv.getAverageSaleOrderPrice(), is(5550.0));
	}

	@Test
	public void testGetSaleOrdersWithMock() {
		List<SaleOrder> mockOrders = saleOrderSrv.getSaleOrders();
		assertThat(mockOrders, is(notNullValue()));
		assertThat(mockOrders.size(), is(2));
		assertThat(mockOrders.get(0).getSaleOrderId(), is("o001-mock"));
		assertThat(mockOrders.get(0).getTransactions().size(), is(2));
		assertThat(mockOrders.get(0).getTransactions().get(0).getTransactionId(), is("t001-mock"));
		assertThat(mockOrders.get(0).getTransactions().get(1).getTransactionId(), is("t002-mock"));
		assertThat(mockOrders.get(1).getSaleOrderId(), is("o002-mock"));
		assertThat(mockOrders.get(1).getTransactions().size(), is(4));
		assertThat(mockOrders.get(1).getTransactions().get(0).getTransactionId(), is("t003-mock"));
		assertThat(mockOrders.get(1).getTransactions().get(1).getTransactionId(), is("t004-mock"));
		assertThat(mockOrders.get(1).getTransactions().get(2).getTransactionId(), is("t005-mock"));
		assertThat(mockOrders.get(1).getTransactions().get(3).getTransactionId(), is("t006-mock"));

	}

}
