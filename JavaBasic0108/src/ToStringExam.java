import java.util.Objects;

public class ToStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ȫ�浿";
		String str2 = null;
		String str3 = "";
		
		System.out.println(Objects.toString(str1,"���̾�"));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"���̾�"));
		System.out.println(Objects.toString(str3,"���̾�"));
	}

}
