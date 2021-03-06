package camt.se234.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Data
@Builder
// @NoArgsConstructor
@AllArgsConstructor
public class SaleTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String transactionId;

	@ManyToOne
	@JoinColumn(name = "order_id")
	SaleOrder order;
	@OneToOne(fetch = FetchType.EAGER)
	Product product;
	int amount;

	public SaleTransaction() {
		super();
	}

	public SaleTransaction(String transactionId, Product product, int amount) {
		this.transactionId = transactionId;
		this.product = product;
		this.amount = amount;
	}

	public Long getId() {
		return id;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public SaleOrder getOrder() {
		return order;
	}

	public void setOrder(SaleOrder order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(transactionId, product.hashCode(), amount);
	}

	@Override
	public boolean equals(Object st) {
		return st != null && hashCode() == ((SaleTransaction) st).hashCode();
	}

	@Override
	public String toString() {
		return "SaleTransaction [transactionId=" + transactionId + ", product="
				+ product + ", amount=" + amount + "]";
	}
}
