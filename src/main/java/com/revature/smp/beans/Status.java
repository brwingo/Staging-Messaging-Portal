package com.revature.smp.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "USER_STATUS")
public class Status implements Serializable {
	
	private static final long serialVersionUID = 6033234014682351342L;
	
	@Id
	@Column(name = "status_id")
	private int statusId;
	
	@Column(name = "status_name")
	private String status;
	
	public Status() {
	}
	
	public Status(int statusId, String status) {
		this.statusId = statusId;
		this.status = status;
	}
	
	public int getStatusId() {
		return statusId;
	}
	
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", status=" + status + "]";
	}
	
}