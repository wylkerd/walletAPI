package com.wallet.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = " wallet_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1796790346218894236L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JoinColumn(name = "wallet", referencedColumnName = "id")
	@ManyToOne(fetch = FetchType.LAZY)
	private Wallet wallet;
	@NotNull
	private Date date;
	@NotNull
	private String type;
	@NotNull
	private String description;
	@NotNull
	private BigDecimal value;
	
	public WalletItem() {
		
	}
	
	public WalletItem(long _id, Wallet _wallet, Date _date, String _type, String _description, BigDecimal _value) {
		// TODO Auto-generated constructor stub
		this.id = _id;
		this.wallet = _wallet;
		this.date = _date;
		this.type = _type;
		this.description = _description;
		this.value =_value;		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	

	
	
	
}
