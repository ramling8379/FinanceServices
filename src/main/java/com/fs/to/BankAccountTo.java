package com.fs.to;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;

public class BankAccountTo extends BaseTo{
	
	@NotEmpty(message="BankAccount code should not be empty.")
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("bankAccountId")
	@JsonAlias("id")
	private Long id;
	
	@JsonProperty("bankName")
	private String bankName;
	
	@JsonProperty("holderName")
	private String holderName;
	
	@JsonProperty("accountNumber")
	private String accountNumber;
	
	@JsonProperty("currentBalance")
	private Double currentBalance;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getCurrentBalance() {
		return currentBalance == null ? 0.0 : currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}
}
