package camt.se234.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String saleOrderId;
	@Builder.Default
	@OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<SaleTransaction> transactions = new ArrayList<SaleTransaction>();

	public SaleOrder() {
	}

	public SaleOrder(String saleOrdId, List<SaleTransaction> transactions) {
		this.saleOrderId = saleOrdId;
		this.transactions = transactions;
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		for (SaleTransaction transaction : transactions) {
			totalPrice += transaction.getAmount() * transaction.getProduct().getPrice();
		}
		return totalPrice;
	}

	public Long getId() {
		return id;
	}

	public String getSaleOrderId() {
		return saleOrderId;
	}

	public void setSaleOrderId(String saleOrderId) {
		this.saleOrderId = saleOrderId;
	}

	public List<SaleTransaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<SaleTransaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		int hash = Objects.hash(saleOrderId);
		for (SaleTransaction st : transactions)
			hash = Objects.hash(hash, st.hashCode());
		return hash;
	}

	@Override
	public boolean equals(Object so) {
		return so != null && hashCode() == ((SaleOrder) so).hashCode();
	}

	@Override
	public String toString() {
		return "SaleOrder [saleOrderId=" + saleOrderId + ", transactions="  + transactions + "]";
	}
}
