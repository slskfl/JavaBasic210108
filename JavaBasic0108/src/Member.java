
public class Member {

	public String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// �Ű����� Member Ÿ������ Ȯ��
		if(obj instanceof Member) {
			Member member =(Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}