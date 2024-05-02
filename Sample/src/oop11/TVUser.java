package oop11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TVUser {
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(new FileInputStream("src/oop11/product.properties"));
		
		//new AppleTV(); downcasting,
		//new 키워드 없는 채로 instance 생성. TVUser와 xxTV의 의존관계가 없어짐.
		String tvName = prop.getProperty("tv");
		Class tvClass = Class.forName(tvName);
		TV tv = (TV) tvClass.getConstructor().newInstance();
		
		String speakerName = prop.getProperty("speaker");
		Class speakerClass = Class.forName(speakerName);
		Speaker speaker = (Speaker)speakerClass.getConstructor().newInstance();
		
		tv.setSpeaker(speaker);
		
		/*
		 * try~catch
		 */
		
		
		
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.soundUp();
		tv.powerOff();
	}
}
