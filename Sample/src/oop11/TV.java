package oop11;

public interface TV {
		public abstract void powerOn();
		public abstract void powerOff();
		public abstract void channelUp();
		public abstract void channelDown();
		public abstract void soundUp();
		public abstract void soundDown();
		public default void setSpeaker(Speaker speaker) {
			//무조건 오버라이딩 안해도 됨
		}
}       
