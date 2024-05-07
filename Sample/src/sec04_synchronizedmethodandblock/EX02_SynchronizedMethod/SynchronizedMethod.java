package sec04_synchronizedmethodandblock.EX02_SynchronizedMethod;

//공유 객체
class MyData{
	int data = 3;
	
	public synchronized void plusData(){	//synchronized -> 메서드 동기화
		int mydata = data;	//데이터 가져오기
		try {Thread.sleep(2000);}catch(InterruptedException e) {}
		data = mydata + 1;
	}
}
//공유 객체를 사용하는 쓰레드
class PlusThread extends Thread{
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과: " + myData.data);
	}	
}
public class SynchronizedMethod extends Thread {
	public static void main(String[] args) {
		//공유 객체 생성
		MyData myData = new MyData();
		
		//plusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}	//1초 기다림
		
		//plusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
