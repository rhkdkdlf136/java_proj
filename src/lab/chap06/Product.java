package lab.chap06;

public class Product {

//	1.필드
	private long idx; //번호
	private String proName; //제품명
	private int qty; //제품 개수
	private int year; //제품 생산년도
	private String proColor; //제품 색깔

	//기본생성자
	Product() {}

	
	//getter,setter 생성
	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getProColor() {
		return proColor;
	}

	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	
	
	
	
	//toString메소드 Overriding : 객체 자체를 출력시 필드의 값을 출력
	@Override
	public String toString() {
		return "Product [idx=" + idx + ", proName=" + proName + ", qty=" + qty + ", year=" + year + ", proColor="
				+ proColor + "]";
	}
	
	
	
	
	
}
