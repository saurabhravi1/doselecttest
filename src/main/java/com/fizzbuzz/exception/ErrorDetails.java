package com.fizzbuzz.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	private String message;
	private LocalDateTime dateTime;
	private String details;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", dateTime=" + dateTime + ", details=" + details + "]";
	}
	public ErrorDetails(String message, LocalDateTime dateTime, String details) {
		super();
		this.message = message;
		this.dateTime = dateTime;
		this.details = details;
	}
	
}
