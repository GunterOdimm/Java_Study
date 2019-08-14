package study.java.movie.model;

//이 빈즈는 gson 으로 받은 빈즈를 다시 받아주는 빈즈이다
public class movie {
	private int id;
	private String searchDate;
	private int rank;
	private int rankInten;
	private String rankOldAnd_new;
	private String movieCd;
	private String openDt;
	private long salesAmt;
	private float salesShare;
	private long salesInten;
	private float salesChange;
	private long salesAcc;
	private int audiCnt;
	private int audiInten;
	private float audiChange;
	private int audiAcc;
	private int scrnCnt;
	private int showCnt;
	private String regDate;
	private String eidtDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(String searchDate) {
		this.searchDate = searchDate;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRankInten() {
		return rankInten;
	}
	public void setRankInten(int rankInten) {
		this.rankInten = rankInten;
	}
	public String getRankOldAnd_new() {
		return rankOldAnd_new;
	}
	public void setRankOldAnd_new(String rankOldAnd_new) {
		this.rankOldAnd_new = rankOldAnd_new;
	}
	public String getMovieCd() {
		return movieCd;
	}
	public void setMovieCd(String movieCd) {
		this.movieCd = movieCd;
	}
	public String getOpenDt() {
		return openDt;
	}
	public void setOpenDt(String openDt) {
		this.openDt = openDt;
	}
	public long getSalesAmt() {
		return salesAmt;
	}
	public void setSalesAmt(long salesAmt) {
		this.salesAmt = salesAmt;
	}
	public float getSalesShare() {
		return salesShare;
	}
	public void setSalesShare(float salesShare) {
		this.salesShare = salesShare;
	}
	public long getSalesInten() {
		return salesInten;
	}
	public void setSalesInten(long salesInten) {
		this.salesInten = salesInten;
	}
	public float getSalesChange() {
		return salesChange;
	}
	public void setSalesChange(float salesChange) {
		this.salesChange = salesChange;
	}
	public long getSalesAcc() {
		return salesAcc;
	}
	public void setSalesAcc(long salesAcc) {
		this.salesAcc = salesAcc;
	}
	public int getAudiCnt() {
		return audiCnt;
	}
	public void setAudiCnt(int audiCnt) {
		this.audiCnt = audiCnt;
	}
	public int getAudiInten() {
		return audiInten;
	}
	public void setAudiInten(int audiInten) {
		this.audiInten = audiInten;
	}
	public float getAudiChange() {
		return audiChange;
	}
	public void setAudiChange(float audiChange) {
		this.audiChange = audiChange;
	}
	public int getAudiAcc() {
		return audiAcc;
	}
	public void setAudiAcc(int audiAcc) {
		this.audiAcc = audiAcc;
	}
	public int getScrnCnt() {
		return scrnCnt;
	}
	public void setScrnCnt(int scrnCnt) {
		this.scrnCnt = scrnCnt;
	}
	public int getShowCnt() {
		return showCnt;
	}
	public void setShowCnt(int showCnt) {
		this.showCnt = showCnt;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getEidtDate() {
		return eidtDate;
	}
	public void setEidtDate(String eidtDate) {
		this.eidtDate = eidtDate;
	}
	@Override
	public String toString() {
		return "movie [id=" + id + ", searchDate=" + searchDate + ", rank=" + rank + ", rankInten=" + rankInten
				+ ", rankOldAnd_new=" + rankOldAnd_new + ", movieCd=" + movieCd + ", openDt=" + openDt + ", salesAmt="
				+ salesAmt + ", salesShare=" + salesShare + ", salesInten=" + salesInten + ", salesChange="
				+ salesChange + ", salesAcc=" + salesAcc + ", audiCnt=" + audiCnt + ", audiInten=" + audiInten
				+ ", audiChange=" + audiChange + ", audiAcc=" + audiAcc + ", scrnCnt=" + scrnCnt + ", showCnt="
				+ showCnt + ", regDate=" + regDate + ", eidtDate=" + eidtDate + "]";
	}
	
	
}
