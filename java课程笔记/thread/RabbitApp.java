package thread;
import thread.rabbit.*;
public class RabbitApp{
	public static void main(String[] args){
		Rabbit rab=new RabbitApp();
		Tortoise tor=new Tortoise();
		rab.start();
		tor.start();
		for(int i=0;i<100;i++){
			System.out.println("main执行了"+i+"步");
		}
	}
}
