package soft_07;
import java.io.*;
public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("C:\\abdavadvadvavda.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		StringBuffer sf=new StringBuffer();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		while(!(str=br.readLine()).startsWith("s")) {
			sf.append(str+"\n");
		
			
		}
		br.close();
		fw.write(sf.toString());
		fw.flush();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
				
				
	
	}

}