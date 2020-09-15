package two;

@SuppressWarnings("serial")
class DangerException extends Exception{
	public String WarnMess(){
		return "超重";
	}
}

class Boat{
	int max; //最大载重
	int real;//装载重量
	void setMax(int c){
		max = c;
	}
	void loading (int m )throws DangerException{
		real += m;
		if (real>max){
			throw new DangerException();

		}
	}
}
public class TestException{
	public static void main(String[] args){
		Boat boat = new Boat();
		boat.setMax(1000);
		int m =600;
		try{
			boat.loading(m);
			m = 400;
			boat.loading(m);
			m = 200;
			boat.loading(m);
		}catch(DangerException e){
			System.out.println(e.WarnMess());
		}
		System.out.println("准时起航");
	}
}
