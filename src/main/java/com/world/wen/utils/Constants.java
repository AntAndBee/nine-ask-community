package com.world.wen.utils;

import java.util.HashMap;
import java.util.Map;

import com.world.wen.vo.RequestBody;
import com.world.wen.vo.request.GetAllTopicReq;

/**
 * 
 * @author jswu
 *
 */
public class Constants {

	public static final String CODE_000 = "000";

	public static final String CODE_111 = "111";

	public static final String YMD = "yyyy-MM-dd";
	public static final String YMD_HMS = "yyyy-MM-dd HH:mm:ss";

	public static final String CODE_115 = "115";

	public static final Map<String, String> APP_HANDLER = new HashMap<String, String>();

	public static final String ALL_TOPIC = "getAllTopicImpl";
	
	public static final String SESSION_USER_ID = "USER_ID";

	static {
		APP_HANDLER.put(ALL_TOPIC, "all_topic");
	}

	public static final Map<String, Class<? extends RequestBody>> APP_VO = new HashMap<String, Class<? extends RequestBody>>();

	public static final Object APP_SCRET = "wen9";

	public static final String CODE_113 = "113";

	public static final String CODE_114 = "114";

	static {
		APP_VO.put(ALL_TOPIC, GetAllTopicReq.class);
	}
}
