package org.lxh.demo.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

// 取得时间戳的类
public class TimeStamp{
	
	
	private Calendar calendar = null;
	
	String flag;
	public static void main(String[] args) {
		TimeStamp ts = new TimeStamp("s");
		//System.out.println(ts.addZero(ts.calendar.get(Calendar.MONTH)+1,2));
		System.out.println(ts.getTimeTamp());
		System.out.println(ts.getTimeTampRandom());

	}
	public TimeStamp(){
		this.calendar = new GregorianCalendar();
	}
	
	public TimeStamp(String str){
		this();
		this.flag = str;
	}
	public String getTimeTamp(){
		StringBuffer buffer = new StringBuffer();

		if(this.flag!=null){
			buffer.append(this.flag);
		}
		buffer.append(addZero(calendar.get(Calendar.YEAR),4));
		buffer.append(addZero(calendar.get(Calendar.MONTH)+1,2));
		buffer.append(addZero(calendar.get(Calendar.DAY_OF_MONTH),2));
		buffer.append(addZero(calendar.get(Calendar.HOUR_OF_DAY),2));
		buffer.append(addZero(calendar.get(Calendar.MINUTE),2));
		buffer.append(addZero(calendar.get(Calendar.SECOND),2));
		buffer.append(addZero(calendar.get(Calendar.MILLISECOND),3));

		return buffer.toString();
	}
	public String getTimeTampRandom(){
		StringBuffer strBuffer = new StringBuffer();
		Random r = new Random();

		strBuffer.append(getTimeTamp());
		
		strBuffer.append(r.nextInt(10));
		strBuffer.append(r.nextInt(10));
		strBuffer.append(r.nextInt(10));
		return strBuffer.toString();
	}
	
	public String addZero(int temp,int num){
		String str = temp + "";
		if(str.length()<num){
			str = "0"+temp;
		}
		return str;
		
	}

}
