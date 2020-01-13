package com.wallet.dto;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletItemDTO {

	 private Long id;
	 @NotNull(message = "Insira o id da carteira")
	 private long wallet;
	 @NotNull(message = "Informe uma data")
	 private Date date;
	 @NotNull(message = "Informe um tipo")
	 @Pattern(regexp="^(ENTRADA|SAÍDA)$", message = "Para o tipo somente são aceitos os valores ENTRADA ou SAÍDA")
	 private String type;
	 @NotNull(message = "Informe uma descrição")
	 @Length(min = 5, message = "A descrição deve ter no mínimo 5 caracteres")
	 private String description;
	 @NotNull
	 private BigDecimal value;
	 
	 
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getWallet() {
		return wallet;
	}
	public void setWallet(long wallet) {
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
	 
	 
}
