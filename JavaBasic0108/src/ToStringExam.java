import java.util.Objects;

public class ToStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "홍길동";
		String str2 = null;
		String str3 = "";
		
		System.out.println(Objects.toString(str1,"라이언"));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"라이언"));
		System.out.println(Objects.toString(str3,"라이언"));
	}

}
