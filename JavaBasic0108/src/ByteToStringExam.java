
public class ByteToStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ASCII 코드표 참조

		byte[] bytes = { 97, 98, 99, 65, 66, 67};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,3,3);
		System.out.println(str2);

	}

}
