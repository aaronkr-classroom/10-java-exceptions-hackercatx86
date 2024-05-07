class MyException extends Exception {
	String str1;
	
	MyException(String str2) {
		str1 = str2;
	}
	
	public String toString() {
		return ("MyException 발생! " + str1);
	}
}

public class Ex1103 {

	public static void main(String[] args) {
		try {
			System.out.println("try block!");
			throw new MyException("Call MyException class");
		}
		catch(MyException e) {
			System.out.println("catch block!");
			System.out.println(e);
		}

	}

}
