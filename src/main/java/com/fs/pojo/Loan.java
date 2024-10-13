package com.fs.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fs.pojo.base.impl.FirmAwareImpl;

@Entity
@Table(name="FSLOAN", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Loan extends FirmAwareImpl{
	
	private static final long serialVersionUID = 366299965603L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "LoanType", nullable = false, unique = false)
	private String loanType;
	
	@Column(name = "Code", nullable = false, unique = false)
	private String code;
	
	@Column(name = "AccountNumber", nullable = false, unique = false)
	private String accountNumber;
	
	@NotNull(message = "LoanAmount can't be null")
	@Min(value = 1, message = "LoanAmount must be greater than zero")
	@Column(name = "LoanAmount", nullable = false, unique = false)
	private Double loanAmount;
	
	@NotNull(message = "Total Installments can't be null")
	@Min(value = 1, message = "Total Installments must be greater than zero")
	@Column(name = "TotalInstallments", nullable = false, unique = false)
	private Integer totalInstallments;
	
	@Column(name = "Saving", nullable = true, unique = false)
	private Double saving;
	
	@Column(name = "EmiAmount", nullable = false, unique = false)
	private Double emiAmount;
	
	@Column(name = "EmiStartDate", nullable = false, unique = false)
	private Date emiStartDate;
	
	@Column(name = "EmiEndDate", nullable = false, unique = false)
	private Date emiEndDate;
	
	@Column(name = "RecoveryAgent", nullable = false, unique = false)
	private String recoveryAgent;
	
	@Column(name = "disbursementDate", nullable = false, unique = false)
	private Date disbursementDate;
	
	@Column(name = "IsFlatInterestRate", nullable = true, unique = false)
	private Boolean isFlatInterestRate;
	
	@Column(name = "InterestRate", nullable = false, unique = false)
	private Double interestRate;
	
	@Column(name = "totalInterestAmount", nullable = true, unique = false)
	private Double totalInterestAmount;
	
	@Column(name = "other", nullable = true, unique = false)
	private Double other;
	
	@Column(name = "BankName", nullable = true, unique = false)
	private String bankName;
	
	@Column(name = "ChequeNumber", nullable = true, unique = false)
	private String chequeNumber;
	
	@Column(name = "FileNumber", nullable = true, unique = false)
	private String fileNumber;
	
	@Column(name = "Narration", nullable = true, unique = false)
	private String narration;
	
	@Column(name = "Gurantor1", nullable = true, unique = false)
	private String gurantor1;
	
	@Column(name = "Guranto2", nullable = true, unique = false)
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
