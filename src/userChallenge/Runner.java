package userChallenge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Runner {
	public static void main(String[] args) {
		
		
		List<User> users = new ArrayList<User>();
		
		User u1 = new User();
		u1.setFirstName("Henry");
		u1.setLastName("Peterson");
		u1.setAge(39);
		u1.setEmail("Henry@email.com");
		u1.setPhoneNumber("5550123456");
		u1.setMiddleNames(Arrays.asList("Steve","Jordan"));
		users.add(u1);
		
		User u2 = new User();
		u2.setFirstName("Lucy");
		u2.setLastName("Ford");
		u2.setAge(50);
		u2.setEmail("Lucy@email.com");
		u2.setPhoneNumber("5559876543");
		u2.setMiddleNames(Arrays.asList("Simone"));
		users.add(u2);
		
		User u3 = new User();
		u3.setFirstName("Ash");
		u3.setLastName("Burton");
		u3.setAge(25);
		u3.setEmail("Ash@email.com");
		u3.setPhoneNumber("555420");
		u3.setMiddleNames(Arrays.asList());
		users.add(u3);
		
		for (User user : users) {
			System.out.println(user);
		}
		
		

		
	}
//	@Override    //Doesn't seem to like being overriden
//	public String toString(User user) {
//		System.out.println(user.getFirstName());
//		System.out.println(user.getLastName());
//		System.out.println(user.getAge());
//		System.out.println(user.getEmail());
//		System.out.println(user.getPhoneNumber());
//		System.out.println(user.getMiddleNames());
//		return user.getFirstName() + user.getLastName() + user.getAge() + user.getEmail() +user.getPhoneNumber() +user.getMiddleNames();
//	}
		

}
