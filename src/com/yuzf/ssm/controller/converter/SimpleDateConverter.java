package com.yuzf.ssm.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class SimpleDateConverter implements Converter<String,Date>{

	@Override
	public Date convert(String dateStr) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = null;
		try {
//			date = simpleDateFormat.parse(dateStr);
			return simpleDateFormat.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return date;
		return null;
	}

}
