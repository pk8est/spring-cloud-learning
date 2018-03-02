package com.pkest.module.common.util;

import com.alibaba.fastjson.serializer.SerializerFeature;

import javax.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Json工具
 */
public class JsonOutputUtils {

	 public static String SUCCESS_MESSAGE = "success!";
	 public static String ERROR_MESSAGE = "error!";

	 public static String output(Object data){
	 	return output(data, null);
	 }

	public static String output(Object data, @Nullable SerializerFeature... feature){
		return output(0, data, feature);
	}

	 public static String output(Integer code, Object data){
		return output(code, data, null);
	 }

	public static String output(Integer code, Object data, @Nullable SerializerFeature... feature){
		return output(code, code < 0 ? ERROR_MESSAGE : SUCCESS_MESSAGE, data, feature);
	}

	 public static String output(Integer code, String message, Object data){
		return output(code, message, data, null);
	 }
	 public static String output(Integer code, String message, Object data, @Nullable SerializerFeature... feature){
		 Map<String,Object> result= new LinkedHashMap<String,Object>();
		 result.put("code",code);
		 result.put("message", message);
		 result.put("data", data == null ? new Object() : data);
		 if(feature == null){
			 return FastJsonUtils.toJsonString(result);
		 }else{
			 return FastJsonUtils.toJsonString(result, feature);
		 }
	 }
	
}
