package com.world.wen.vo;

import com.world.wen.utils.Constants;


public class ErrorResponseBody extends ResponseBody {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5406188646545695869L;

	public static ErrorResponseBody createErrorResponseBody(String memo) {
		ErrorResponseBody responseBody = new ErrorResponseBody();
		responseBody.setStatus(Constants.CODE_111);
		responseBody.setMemo(memo);
		return responseBody;
	}
	
	public static ErrorResponseBody createErrorResponseBody(String status,String memo) {
		ErrorResponseBody responseBody = new ErrorResponseBody();
		responseBody.setStatus(status);
		responseBody.setMemo(memo);
		return responseBody;
	}

}
