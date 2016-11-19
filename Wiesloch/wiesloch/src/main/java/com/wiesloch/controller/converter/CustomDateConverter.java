
package com.wiesloch.controller.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * <p>ClassName:CustomDateConverter</p>
 * <p>Description:</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日11:03:51 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public class CustomDateConverter implements Converter<String,Date>{

	public Date convert(String source) {
		//实现 将日期串转成日期类型(格式是yyyy-MM-dd HH:mm:ss)
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
