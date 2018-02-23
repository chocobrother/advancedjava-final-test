package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UserNotFoundException extends Exception{
	UserNotFoundException(){
		super("사용자를 찾을수 없습니다..");
	}
}

class PasswordDismatchException extends Exception{
	PasswordDismatchException(){
		super("비밀번호가 존재하지 않습니다..");
	}
}

public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		/*
		 *  로그인 처리 부분을 완성 합니다. login 함수 호출.
		 */
		
		try {
			User u  = new User(id,password);
			login(joinUsers,u);
			System.out.println("로그인 성공");
		} catch (UserNotFoundException | PasswordDismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){//해쉬코드랑 equals 변경해서 사용
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}
}
