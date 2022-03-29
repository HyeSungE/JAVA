class AreaException extends Exception {
	private String m;
	AreaException(){
		super();
	}
	
	public String getMessage() {
		m="1~100까지의 수만 입력할 수 있습니다.";
		return m;
	}
}
