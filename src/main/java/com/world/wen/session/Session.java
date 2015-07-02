package com.world.wen.session;

import java.util.HashMap;
import java.util.Map;

public class Session {
	private static ThreadLocal<Map<String, Object>> requestThreadLocal = new ThreadLocal<Map<String, Object>>();

	public static void put(String key, Object value) {
		if (null == requestThreadLocal.get()) {
			requestThreadLocal.set(new HashMap<String, Object>());
		}
		requestThreadLocal.get().put(key, value);
	}

	public static Object get(String key) {
		if (null == requestThreadLocal.get()) {
			return null;
		}
		return requestThreadLocal.get().get(key);
	}

	public static void clear() {
		if (null != requestThreadLocal.get()) {
			requestThreadLocal.get().clear();
		}
	}
}
