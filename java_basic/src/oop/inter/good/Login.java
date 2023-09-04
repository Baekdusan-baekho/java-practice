package oop.inter.good;

public class Login implements IUserService {

	@Override
	public void execute() {
		
		System.out.print("사용자가 입력한 id, pw를 받고, 데이터베이스와 비교 등등....");
	}

}
