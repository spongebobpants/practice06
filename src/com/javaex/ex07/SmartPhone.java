package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if("앱".equals(str)) {
        	application();
        }else if("음악".equals(str)){
        	super.execute(str);
        }else{
        	super.execute(str);
        	
        }
        //코드작성
        
    }
    public void application() {
		System.out.println("앱실행");
	}
    //메소드작성
    public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
    
    //메소드작성
    
    
    
}
