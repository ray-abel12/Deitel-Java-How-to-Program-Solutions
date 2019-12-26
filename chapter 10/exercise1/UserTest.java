package exercise1;

public class UserTest {
	public void printUserType(User u) {
		u.printUserType();
	}
	public void saveWebLinks(User s) {
		s.saveWebLinks();
	}

	public static void main(String[] args) {
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();

		UserTest ut = new UserTest();
		//ut.printUserType(user);
		//ut.printUserType(staff);
		//ut.printUserType(editor);
		//ut.saveWebLinks(user);
		editor.postAReview();
		staff.postAReview();
		user.postAReview();
		user.saveWebLinks();
		 

	}

}
