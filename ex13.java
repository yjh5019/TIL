package soft_07;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] OneRec = {
				"허가(신고)번호,허가(신고)일자,영업종류,상호,우편번호,소재지(지번),
				"27100-2013-000002,2013-10-21"
		};
		
		String[] field_name = OneRec[0].split(",");
		
		for(int i=1; i<OneRec.length-1; i++) {
			
			String[] field = OneRec[i].split(",");
			System.out.printf("*********************************\n");
			for(int j=0; j<field_name.length; j++) {
				System.out.printf(" %s : %s\n", field_name[j], field[j]);
			}
			System.out.printf("*********************************\n");
		}

	}

}
