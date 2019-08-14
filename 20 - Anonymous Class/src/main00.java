
public class main00 {
	public static void main(String[] args) {
		MySite my = new MySite() {
			
			@Override
			public void write() {
				System.out.println("새 글 쓰기 ");
			}
			
			@Override
			public void delete() {
				System.out.println("글 삭제");
			}
		};
		my.write();
		my.delete();
		
		MySite member = new MySite() {
			
			@Override
			public void write() {
				System.out.println("회원가입");
			}
			
			@Override
			public void delete() {
				System.out.println("회원탈퇴");
			}
		};
		member.write();
		member.delete();
		
	}

}
