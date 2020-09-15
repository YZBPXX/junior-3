package two;
import one.bird;
public interface Flyable{
	int MAX_PEED = 10000;
	void fly();
}

interface Attack{
	void attack();
}

class Plane implements Flyable,Attack{
	public void fly(){
		System.out.println("靠发动机飞行");
	}

	@Override
	public void attack(){
		System.out.println("战斗机进攻");
	}
}

class Stone implements Flyable{
	@Override 
	public void fly(){
		bird b;
		System.out.println("被别人扔飞");
	}
}


