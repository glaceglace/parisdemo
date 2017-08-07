package com.example.demo.utils;

import com.example.demo.model.Result;

public class ResultUtil {
	
	public static Result success(Object object){
		Result result = new Result();
		result.setCode(0);
		result.setMsg("Succeeded");
		result.setData(object);
		return result;
	}
	
	public static Result success(){
		return success(null);
	}
	
	public static Result error(Integer code, String msg, Object object){
		Result result = new Result();
		result.setCode(code);
		result.setMsg("Succeeded");
		result.setData(object);
		result.setMsg(msg);
		return result;
	}

}
