package com.fs.to;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;

public class LoanTo extends BaseTo{

	@JsonProperty("loanId")
	@JsonAlias("id")
	private Long id;
	
	@JsonAlias("loanType")
	private String loanType;
	
	@JsonAlias("code")
	private String code;
	
	@JsonAlias("accountNumber")
	private String accountNumber;
	
	@JsonAlias("loanAmount")
	private Double loanAmount;
	
	@JsonAlias("totalInstallments")
	private Integer totalInstallments;
	
	@JsonAlias("saving")
	private Double saving;
	
	@JsonAlias("emiAmount")
	private Double emiAmount;
	
	@JsonAlias("emiStartDate")
	private Date emiStartDate;
	
	@JsonAlias("emiEndDate")
	private Date emiEndDate;
	
	@JsonAlias("recoveryAgent")
	private String recoveryAgent;
	
	@JsonAlias("disbursementDate")
	private Date disbursementDate;
	
	@JsonAlias("isFlatInterestRate")
	private Boolean isFlatInterestRate;
	
	@JsonAlias("interestRate")
	private Double interestRate;
	
	@JsonAlias("totalInterestAmount")
	private Double totalInterestAmount;
	
	@JsonAlias("other")
	private Double other;
	
	@JsonAlias("bankName")
	private String bankName;
	
	@JsonAlias("chequeNumber")
	private String chequeNumber;
	
	@JsonAlias("fileNumber")
	private String fileNumber;
	
	@JsonAlias("narration")
	private String narration;
	
	@JsonAlias("gurantor1")
	private String gurantor1;
	
	@JsonAlias("gurantor2")
	private String gurantor2;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getTotalInstallments() {
		return totalInstallments;
	}

	public void setTotalInstallments(Integer totalInstallments) {
		this.totalInstallments = totalInstallments;
	}

	public Double getSaving() {
		return saving;
	}

	public void setSaving(Double saving) {
		this.saving = saving;
	}

	public Double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public Date getEmiStartDate() {
		return emiStartDate;
	}

	public void setEmiStartDate(Date emiStartDate) {
		this.emiStartDate = emiStartDate;
	}

	public Date getEmiEndDate() {
		return emiEndDate;
	}

	public void setEmiEndDate(Date emiEndDate) {
		this.emiEndDate = emiEndDate;
	}

	public String getRecoveryAgent() {
		return recoveryAgent;
	}

	public void setRecoveryAgent(String recoveryAgent) {
		this.recoveryAgent = recoveryAgent;
	}

	public Date getDisbursementDate() {
		return disbursementDate;
	}

	public void setDisbursementDate(Date disbursementDate) {
		this.disbursementDate = disbursementDate;
	}

	public Boolean getIsFlatInterestRate() {
		return isFlatInterestRate;
	}

	public void setIsFlatInterestRate(Boolean isFlatInterestRate) {
		this.isFlatInterestRate = isFlatInterestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Double getTotalInterestAmount() {
		return totalInterestAmount;
	}

	public void setTotalInterestAmount(Double totalInterestAmount) {
		this.totalInterestAmount = totalInterestAmount;
	}

	public Double getOther() {
		return other;
	}

	public void setOther(Double other) {
		this.other = other;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getGurantor1() {
		return gurantor1;
	}

	public void setGurantor1(String gurantor1) {
		this.gurantor1 = gurantor1;
	}

	public String getGurantor2() {
		return gurantor2;
	}

	public void setGurantor2(String gurantor2) {
		this.gurantor2 = gurantor2;
	}
}
