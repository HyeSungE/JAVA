class AreaException extends Exception {
	private String m;
	AreaException(){
		super();
	}
	
	public String getMessage() {
		m="1~100������ ���� �Է��� �� �ֽ��ϴ�.";
		return m;
	}
}
