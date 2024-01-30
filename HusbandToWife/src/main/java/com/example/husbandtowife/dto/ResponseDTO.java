package com.example.husbandtowife.dto;

public class ResponseDTO {

	private int status;

	private String message;

	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseDTO [status=" + status + ", message=" + message + ", data=" + data + "]";
	}

	public ResponseDTO(int status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
