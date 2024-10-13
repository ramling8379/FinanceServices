package com.fs.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fs.pojo.base.impl.FirmAwareImpl;

@Entity
@Table(name="FSBANKACCOUNTS", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class BankAccount extends FirmAwareImpl{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3666265299965603L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "Code", nullable = false, unique = false)
	private String code;
	
	@Column(name = "BankName", nullable = false, unique = false)
	private String bankName;
	
	@Column(name = "HolderName", nullable = false, unique = false)
	private String holderName;
	
	@Column(name = "AccountNumber", nullable = false, unique = false)
	private String accountNumber;
	
	@Column(name = "CurrentBalance", nullable = true, unique = false , precision = 2 ,columnDefinition = "numeric default 25")
	private Double currentBalance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}
}
