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
import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import camt.se234.project.service.SaleOrderService;
import camt.se234.project.service.SaleOrderServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleOrderServiceTestsMock {
	@Autowired
	SaleOrderService saleOrderSrv;

	@Before
	public void mockSetup() {
		OrderDao orderDao = mock(OrderDao.class);
		((SaleOrderServiceImpl) saleOrderSrv).setOrderDao(orderDao);
		List<SaleOrder> mockOrders = new ArrayList<SaleOrder>();

		Product p0001mock = new Product("p0001mock", "Garden-mock", "The garden which you can grow everything on earth",
				"http://localhost:8080/images/garden.jpg", 999);
		Product p0002mock = new Product("p0002mock", "Banana-mock", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 222);
		Product p0004mock = new Product("p0004mock", "Papaya-mock", "Use for papaya salad",
				"http://localhost:8080/images/papaya.jpg", 444);
		Product p0005mock = new Product("p0005mock", "Rambutan-mock", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 111);

		List<SaleTransaction> o001mocklist = new ArrayList<SaleTransaction>();
		o001mocklist.add(new SaleTransaction("t001mock", p0001mock, 5));
		o001mocklist.add(new SaleTransaction("t002mock", p0004mock, 4));
		mockOrders.add(new SaleOrder("o001mock", o001mocklist));

		List<SaleTransaction> o002mocklist = new ArrayList<SaleTransaction>();
		o002mocklist.add(new SaleTransaction("t003mock", p0002mock, 2));
		o002mocklist.add(new SaleTransaction("t004mock", p0001mock, 3));
		o002mocklist.add(new SaleTransaction("t005mock", p0002mock, 1));
		o002mocklist.add(new SaleTransaction("t006mock", p0005mock, 6));
		mockOrders.add(new SaleOrder("o002mock", o002mocklist));

		when(orderDao.getOrders()).thenReturn(mockOrders);
		System.out.println("getAverage test: "+saleOrderSrv.getAverageSaleOrderPrice());
	}

	@Test
	public void testGetSaleOrdersWithMock() {
		List<SaleOrder> mockOrders = saleOrderSrv.getSaleOrders();
		assertThat(mockOrders, is(notNullValue()));
		assertThat(mockOrders.size(), is(2));
		assertThat(mockOrders.get(0).getSaleOrderId(), is("o001mock"));
		assertThat(mockOrders.get(0).getTransactions().size(), is(2));
		assertThat(mockOrders.get(0).getTransactions().get(0).getTransactionId(), is("t001mock"));
		assertThat(mockOrders.get(0).getTransactions().get(1).getTransactionId(), is("t002mock"));
		assertThat(mockOrders.get(1).getSaleOrderId(), is("o002mock"));
		assertThat(mockOrders.get(1).getTransactions().size(), is(4));
		assertThat(mockOrders.get(1).getTransactions().get(0).getTransactionId(), is("t003mock"));
		assertThat(mockOrders.get(1).getTransactions().get(1).getTransactionId(), is("t004mock"));
		assertThat(mockOrders.get(1).getTransactions().get(2).getTransactionId(), is("t005mock"));
		assertThat(mockOrders.get(1).getTransactions().get(3).getTransactionId(), is("t006mock"));

	}

	@Test
	public void testSaleAvgMock() {
		// System.out.println("getAverageSaleOrderPrice: "+saleOrderSrv.getAverageSaleOrderPrice());
		assertThat(saleOrderSrv.getAverageSaleOrderPrice(), is(5550.0));
	}

}
