package com.world.wen.vo;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.world.wen.annotation.DateTimeFormat;
import com.world.wen.utils.Constants;

public class RequestBody implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * API接口名称
	 */
	private String method;

	/**
	 * 时间戳，格式为yyyy-MM-dd HH:mm:ss，例如：2013-05-06 13:52:03。API服务端允许客户端请求时间误差为6分钟。
	 */
	private String timestamp;

	/**
	 * 客户端传入参数，对其值进行倒序排序后，再进行拼接，然后MD5加密
	 */
	private String sign;

	@NotBlank
	@Size(max = 100)
	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	@DateTimeFormat(pattern = Constants.YMD_HMS)
	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@NotBlank
	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}
}
