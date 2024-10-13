package com.fs.to;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fs.to.base.BaseTo;

public class LoanGroupTo extends BaseTo{
	
	@JsonProperty("loanGroupId")
	@JsonAlias("id")
	private Long id;
	
	@JsonProperty("code")
	private String code;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("membersCount")
	private Integer membersCount;
	
	@JsonProperty("recoveryAgent")
	private String recoveryAgent;
	
	@JsonProperty("loanAmount")
	private Double loanAmount;
	
	@JsonProperty("interestRate")
	private Double interestRate;
	
	@JsonProperty("narration")
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
