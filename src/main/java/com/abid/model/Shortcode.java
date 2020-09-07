package com.abid.model;

import java.math.BigDecimal;

public class Shortcode {
	
	
	
	private int idshortcode;
    private Integer scinoutmodeId;
    private Integer gatewayId;
    private Integer deliverydrmodeId;
    private Integer operatorId;
    private Integer countryId;
    private int billingmodeId;
    private String shortcode;
    private BigDecimal localPrice;
    private BigDecimal dollarPrice;
    private int isOnline;
    private String serviceType;
	public int getIdshortcode() {
		return idshortcode;
	}
	public void setIdshortcode(int idshortcode) {
		this.idshortcode = idshortcode;
	}
	public Integer getScinoutmodeId() {
		return scinoutmodeId;
	}
	public void setScinoutmodeId(Integer scinoutmodeId) {
		this.scinoutmodeId = scinoutmodeId;
	}
	public Integer getGatewayId() {
		return gatewayId;
	}
	public void setGatewayId(Integer gatewayId) {
		this.gatewayId = gatewayId;
	}
	public Integer getDeliverydrmodeId() {
		return deliverydrmodeId;
	}
	public void setDeliverydrmodeId(Integer deliverydrmodeId) {
		this.deliverydrmodeId = deliverydrmodeId;
	}
	public Integer getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public int getBillingmodeId() {
		return billingmodeId;
	}
	public void setBillingmodeId(int billingmodeId) {
		this.billingmodeId = billingmodeId;
	}
	public String getShortcode() {
		return shortcode;
	}
	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}
	public BigDecimal getLocalPrice() {
		return localPrice;
	}
	public void setLocalPrice(BigDecimal localPrice) {
		this.localPrice = localPrice;
	}
	public BigDecimal getDollarPrice() {
		return dollarPrice;
	}
	public void setDollarPrice(BigDecimal dollarPrice) {
		this.dollarPrice = dollarPrice;
	}
	public int getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(int isOnline) {
		this.isOnline = isOnline;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
    
    
    

}
