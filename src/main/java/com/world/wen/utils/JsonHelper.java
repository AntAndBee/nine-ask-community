package com.world.wen.utils;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.base.Preconditions;

/**
 * json字符串和java对象互转工具
 * 
 * @author binliu
 * @version 1.0
 */
public final class JsonHelper {

	private JsonHelper() {
	}

	/**
	 * 
	 * @param jsonObj
	 *            (JavaBean对象)
	 * @return Bean对象的Json字符串表示
	 */
	public static String toJson(Object obj) {
		Preconditions.checkArgument(null != obj, "The object must not be null.");
		try {
			return getInstance().writeValueAsString(obj);
		} catch (Exception ignore) {
			throw new BusinessException("", ignore.getMessage(), ignore);
		}
	}

	private static class ObjectMapperSingletonHolder {
		static ObjectMapper instance = new ObjectMapper();
	}

	/**
	 * 单例模式
	 * 
	 * @return
	 */
	public static ObjectMapper getInstance() {
		return ObjectMapperSingletonHolder.instance;
	}

	/**
	 * 修改json中某一属性值，二层修改，请用“.”列示层级结构如“datagramHeader.requestStatus”
	 * 
	 * @param json
	 * @param fieldName
	 * @param value
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static String modifyField(String json, String fieldName, String value) {
		if (StringUtils.isBlank(json)) {
			return json;
		}
		try {
			ObjectMapper instance = getInstance();
			instance.configure(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS, true);
			instance.configure(SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN, true);
			Map<String, Object> propertyMap = instance.readValue(json, Map.class);
			String[] fileds = fieldName.split("\\.");
			if (fileds.length == 2) {
				Map<String, Object> map = (Map<String, Object>) propertyMap.get(fileds[0]);
				if (map != null && map.containsKey(fileds[1])) {
					map.put(fileds[1], value);
				}
			}
			if (fileds.length == 1) {
				if (propertyMap != null && propertyMap.containsKey(fileds[0])) {
					propertyMap.put(fileds[0], value);
				}
			}
			return instance.writeValueAsString(propertyMap);
		} catch (Exception e) {
			throw new BusinessException("", e.getMessage(), e);
		}
	}
}
