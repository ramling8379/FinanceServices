package com.fs.pojo;

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
@Table(name="FSLOANGROUP", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class LoanGroup extends FirmAwareImpl{

	
	private static final long serialVersionUID = 366626445299965603L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Code", nullable = false, unique = false)
	private String code;
	
	@Column(name = "Name", nullable = false, unique = false)
	private String name;
	
	@Column(name = "MembersCount", nullable = false, unique = false)
	private Integer membersCount;
	
	@Column(name = "RecoveryAgent", nullable = false, unique = false)
	private String recoveryAgent;
	
	@NotNull(message = "LoanAmount can't be null")
	@Min(value = 1, message = "LoanAmount must be greater than zero")
	@Column(name = "LoanAmount", nullable = false, unique = false)
	private Double loanAmount;
	
	@NotNull(message = "Interest can't be null")
	@Min(value = 1, message = "Interest must be greater than zero")
	@Column(name = "interestRate", nullable = false, unique = false)
	private Double interestRate;
	
	@Column(name = "narration", nullable = true, unique = false)
	private String narration;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMembersCount() {
		return membersCount;
	}

	public void setMembersCount(Integer membersCount) {
		this.membersCount = membersCount;
	}

	public String getRecoveryAgent() {
		return recoveryAgent;
	}

	public void setRecoveryAgent(String recoveryAgent) {
		this.recoveryAgent = recoveryAgent;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}
}
