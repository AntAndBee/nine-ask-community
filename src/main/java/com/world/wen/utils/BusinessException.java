package com.world.wen.utils;

/**
 * 全局系统业务异常(unchecked)
 * 
 * @author SM
 * 
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -8058289372452353570L;
	/** 业务类型代码 */
	private String code;

	public String getCode() {
		return code;
	}

	public BusinessException() {
		super();
	}

	public BusinessException(String code, String msg) {
		super(msg);
		this.code = code;
	}

	public BusinessException(String code, String message, Throwable e) {
		super(message, e);
		this.code = code;
	}

	public BusinessException(Throwable e) {
		super(e);
	}

	public BusinessException(String msg) {
		super(msg);
	}

}
