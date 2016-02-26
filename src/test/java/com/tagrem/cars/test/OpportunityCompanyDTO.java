package com.tagrem.crmsales.dto;

import java.util.Date;

public class OpportunityCompanyDTO {

	private String id;
	private OpportunityDTO opportunity;
	private CompanyDTO company;
	private Date created;
	private Date updated;
	private CustomerUserDTO createdBy;
	private CustomerUserDTO modifyedBy;

	public String getId() {
		return id;
	}
	public OpportunityDTO getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(OpportunityDTO opportunity) {
		this.opportunity = opportunity;
	}
	public CompanyDTO getCompany() {
		return company;
	}
	public void setCompany(CompanyDTO company) {
		this.company = company;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public CustomerUserDTO getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(CustomerUserDTO createdBy) {
		this.createdBy = createdBy;
	}
	public CustomerUserDTO getModifyedBy() {
		return modifyedBy;
	}
	public void setModifyedBy(CustomerUserDTO modifyedBy) {
		this.modifyedBy = modifyedBy;
	}
}
