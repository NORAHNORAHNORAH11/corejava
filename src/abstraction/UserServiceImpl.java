package abstraction;

public abstract class UserServiceImpl implements UserService,CommonService {

	@Override
	public void addUser() {
		System.out.println("ADDED");
		
	}

	@Override
	public void deleteUser() {
		System.out.println("DELETED");
	}
		@Override
		public void print() {
			System.out.println("....printing");	
		
	}

	
	
	

}
