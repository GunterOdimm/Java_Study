package study.java.helper;

public class Main04 {

	public static void main(String[] args) {
		String authNum = " ";

		for (int i = 0; i < 6; i++) {
			authNum += util.getInstance().random(0, 9);
			/*
			 * 강제 형변환
			 */
			System.out.println(authNum);
		}
		System.out.println("인증번호 = " + authNum);
	}
	/**
	*	public class whatTitle{
	*		public static whatTitle whatST;
	*		public static whatTitle getInstance(){
	*			if(whatST == null){
	*				whatST = new whatTitle();
	*			}
	*			return whatST;
	*		}
	*		private whatTitle(){
	*		}
	*}		
	**/
}