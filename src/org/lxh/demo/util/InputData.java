package org.lxh.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 用来输入数据的工具类
public class InputData {
    private BufferedReader br = null;
    
    public InputData(){
    	this.br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public int getInt(){
    	int temp = 0;
    	String str = null;
    	boolean flag = true;
    	while(flag){
    		str = this.getString();
    		if(!(str.matches("\\d+"))){
    			
    		}else{
    			temp = Integer.parseInt(str);
    			flag = false;
    		}
    		
    	}
    	return temp;
    }
    
    
    // 得到输入的字符串
    public String getString(){
    	String str = "";
    	try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return str;
    }
}
