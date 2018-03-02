package com.pkest.module.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastJsonUtils {
	
	 private static SerializerFeature[] features = {
	 		SerializerFeature.WriteMapNullValue,
			SerializerFeature.WriteNullStringAsEmpty,
			SerializerFeature.WriteNullListAsEmpty,
			SerializerFeature.WriteNullNumberAsZero,
			SerializerFeature.WriteNullBooleanAsFalse,
			SerializerFeature.WriteDateUseDateFormat,
			SerializerFeature.DisableCircularReferenceDetect
	 };
	 
	public static String toJsonString(Object data){
		 return JSON.toJSONString(data, features);
	}

	public static String toJsonString(Object data, SerializerFeature[] features){
		return JSON.toJSONString(data, features);
	}

	public static String toJsonString(Object data, PropertyFilter filter){
		return JSON.toJSONString(data, filter, features);
	}

	public static String toJsonString(Object data, String dateFormat){
		return JSON.toJSONStringWithDateFormat(data, dateFormat, features);
	}

}
