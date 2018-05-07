package camt.se234.project;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import camt.se234.project.service.SaleOrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleOrderServiceTestsXls {
	@Autowired
	SaleOrderService saleOrderSrv;

	@Test
	public void testSaleOrderSer() {
		Product p0001 = new Product("p0001", "Garden", "The garden which you can grow everything on earth",
				"http://localhost:8080/images/garden.jpg", 20000);
		Product p0002 = new Product("p0002", "Banana", "A good fruit with very cheap price",
				"http://localhost:8080/images/banana.jpg", 150);
		Product p0004 = new Product("p0004", "Papaya", "Use for papaya salad",
				"http://localhost:8080/images/papaya.jpg", 12);
		Product p0005 = new Product("p0005", "Rambutan", "An expensive fruit from the sout",
				"http://localhost:8080/images/rambutan.jpg", 20);

		List<SaleTransaction> o001list = new ArrayList<SaleTransaction>();
		o001list.add(new SaleTransaction("t001", p0001, 1));
		o001list.add(new SaleTransaction("t002", p0004, 10));
		assertThat(o001list.size(), is(2));
		SaleOrder o001 = new SaleOrder("o001", o001list);

		List<SaleTransaction> o002list = new ArrayList<SaleTransaction>();
		o002list.add(new SaleTransaction("t003", p0002, 2));
		o002list.add(new SaleTransaction("t004", p0001, 3));
		o002list.add(new SaleTransaction("t005", p0002, 1));
		o002list.add(new SaleTransaction("t006", p0005, 6));
		SaleOrder o002 = new SaleOrder("o002", o002list);

		assertThat(saleOrderSrv, is(notNullValue()));
		List<SaleOrder> saleOrders = saleOrderSrv.getSaleOrders();
		assertThat(saleOrders, is(notNullValue()));
		assertThat(saleOrders.size(), is(2));
		assertThat(saleOrders.get(0), is(o001));
		assertThat(saleOrders.get(1), is(o002));
	}

	@Test
	public void testAvgOrderPrice() {
		// System.out.println("Average: " + saleOrderSrv.getAverageSaleOrderPrice());
		assertThat(saleOrderSrv.getAverageSaleOrderPrice(), is(40345.0));
	}

}
