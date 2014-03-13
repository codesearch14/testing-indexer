package org.model.order;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.model.userprofile.UserProfile;
import org.model.orderline.OrderLine;

/**
* This class represents a request made by an
* user 
*/
public class Order {
	private Long orderId;
	private UserProfile userProfile;
	private Calendar date;
	private Double totalPrice = 0.0;
	private Set<OrderLine> orderLines = new HashSet<OrderLine>();
	
	public Order() {}
	
	public Order(UserProfile userProfile, Calendar date) {
		this.userProfile = userProfile;
		this.date = date;
	}
	
    public Long getOrderId() {
        return orderId;
    }
    
    public void setOrderId(Long orderId) {
    	this.orderId = orderId;
    }
    
    public UserProfile getUserProfile() {
    	return this.userProfile;
    }

	public Calendar getDate() {
		return date;
	}


	public void setDate(Calendar date) {
		this.date = date;
	}


	public Double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void sumPrice(Double price) {
		this.totalPrice += price;
	}
	
	public Set<OrderLine> getOrderLines() {
		return orderLines;
	}


	public void setOrderLines(Set<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}
	
	
	public void addOrderLine(OrderLine orderLine) {
		orderLines.add(orderLine);
		orderLine.setOrder(this);
	}
	
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	public String toString() {
		return this.orderId;
	}
}
