import java.util.Scanner;

public class Ex1101 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("나누고 싶은 숫자를 입력하세요: ");
		int num = s.nextInt();
		
		int arr[] = new int[5];
		
		// try block
		try {
			arr[num] = 10 / num;
			System.out.println("10/n = " + arr[num]);
		}
		// catch block
		catch(ArithmeticException e) {
			System.out.println("0이 아닌 값을 입력하세요!");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0~4까지의 인덱스만 입력하세요.");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("올바른 숫자를 입력하세요.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// finally block 
		finally {
			System.out.println("예외 발생 여부와 상관없이 항상 실행합니다.");
		}
		System.out.println("try-catch block의 외부 문장입니다.");

	}

}
