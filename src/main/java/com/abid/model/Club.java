package com.abid.model;


public class Club implements java.io.Serializable {


    private Integer idClub;
    private Integer subscriptionMethodId;
    private Integer idProject;
    private String name;
    private String page;
    private String descriptionPage;
    private int clubNumber;
    private Integer clubType;
    private Integer ppdModeId;
    private Integer billingCycle;
    private Integer price;
    private Boolean autoUnsubAllowed;
    
    
	public int getIdClub() {
		return idClub;
	}
	public void setIdClub(int idClub) {
		this.idClub = idClub;
	}
	
	public Integer getSubscriptionMethodId() {
		return subscriptionMethodId;
	}
	public void setSubscriptionMethodId(Integer subscriptionMethodId) {
		this.subscriptionMethodId = subscriptionMethodId;
	}
	
	public Integer getIdProject() {
		return idProject;
	}
	public void setIdProject(Integer idProject) {
		this.idProject = idProject;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	
	public String getDescriptionPage() {
		return descriptionPage;
	}
	public void setDescriptionPage(String descriptionPage) {
		this.descriptionPage = descriptionPage;
	}
	
	public int getClubNumber() {
		return clubNumber;
	}
	public void setClubNumber(int clubNumber) {
		this.clubNumber = clubNumber;
	}
	
	public Integer getClubType() {
		return clubType;
	}
	public void setClubType(Integer clubType) {
		this.clubType = clubType;
	}
	
	public Integer getPpdModeId() {
		return ppdModeId;
	}
	public void setPpdModeId(Integer ppdModeId) {
		this.ppdModeId = ppdModeId;
	}
	
	public Integer getBillingCycle() {
		return billingCycle;
	}
	public void setBillingCycle(Integer billingCycle) {
		this.billingCycle = billingCycle;
	}
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Boolean getAutoUnsubAllowed() {
		return autoUnsubAllowed;
	}
	public void setAutoUnsubAllowed(Boolean autoUnsubAllowed) {
		this.autoUnsubAllowed = autoUnsubAllowed;
	}

    
}

