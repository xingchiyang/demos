package com.yb.test._fastjson;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class Test {
	public static void main(String[] args) {
		JSONObject j = new JSONObject();
		j.put("noteStep", 1);
		Map<Object, String> map = new HashMap<Object, String>();
		map.put(1, "1");
		map.put("1", "2");
		System.out.println(map.get(j.get("noteStep")));
		j.put("noteStep", "1");
		System.out.println(map.get(j.get("noteStep")));
	}
}
