package prob02;

import java.util.Scanner;


class Add implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
class Sub implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}
class Mul implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}
class Div implements Arithmetic{

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}
public class CalcApp  {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		
		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		if(operation.equals("+")) {
			Add aa =new Add();
			System.out.println(aa.calculate(a, b));
		}else if(operation.equals("-")) {
			Sub ss = new Sub();
			ss.calculate(a, b);
			System.out.println(ss.calculate(a, b));
		}else if(operation.equals("*")) {
			Mul mm = new Mul();
			mm.calculate(a, b);
			System.out.println(mm.calculate(a, b));
		}else if(operation.equals("/")) {
			Div dd = new Div();
			dd.calculate(a, b);
			System.out.println(dd.calculate(a, b));
		}
			
		

		
	}


	
}
