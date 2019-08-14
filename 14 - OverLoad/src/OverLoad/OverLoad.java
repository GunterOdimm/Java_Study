package OverLoad;

public class OverLoad {
	private int seq;
	private String subject;
	private String writer;
	
	public OverLoad( int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public OverLoad(int seq) {
		this(seq,"제목없음","익명");
	}
	
	public OverLoad(int seq, String subject) {
		this(seq, subject,"익명");
	}
	
	@Override
	public String toString() {
		return "OverLoad [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}

	

}
