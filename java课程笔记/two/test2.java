import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class test2{
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("./1.txt"));
		String ss = "测试数据";
		bw.write(ss);
		bw.newLine(); //换行用
		bw.close();
		System.out.println("写入成功");
	}
}
