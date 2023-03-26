package chapter10;

public class Exercise04 {
	public static void main(String[] args) {
		
		//Class.forName(java.lang.String);
				
		
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i=0; i<=2; i++) {
			//try {
				value = Integer.parseInt(strArray[i]);
		//	} catch(ArrayIndexOutOfBoundsException e) {
			//	e.printStackTrace();
			//	System.out.println("인덱스를 초과했음");
		//	} catch(NumberFormatException e) {
		//		e.printStackTrace();
		//		System.out.println("숫자로 변환할 수 없음");
		//	} finally {
				System.out.println(value);
			}
		}
	}
//}
