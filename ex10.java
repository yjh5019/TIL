package soft_07;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("HanBlackForeword[%s]\n",HanBlankForeword("한글abcd",15));
		System.out.printf("HanBlackForeword[%s]\n",HanBlankForeword("한글한글aa",15));
		System.out.printf("HanBlackForeword[%s]\n",HanBlankBackword("한글aa",15));
		System.out.printf("HanBlackForeword[%s]\n",HanBlankBackword("한글한글aa",15));
		System.out.printf("한글은 [%d]개 \n",HanCount("한글한글aa"));
	}
	
	public static String HanBlankForeword(String str, int len) {
        StringBuilder builder = new StringBuilder();
        int blankCount = len - str.length();
        for (int i = 0; i < blankCount; i++) {
            builder.append(" ");
        }
        builder.append(str);
        return builder.toString();
    }
	public static String HanBlankBackword(String str, int len) {
        StringBuilder builder = new StringBuilder(str);
        int blankCount = len - str.length();
        for (int i = 0; i < blankCount; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }
    
    public static int HanCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '가' && ch <= '힣') {
                count++;
            }
        }
        return count;
    }

}
