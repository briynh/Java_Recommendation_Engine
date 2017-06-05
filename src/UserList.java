
public class UserList {
	private static User[] userList;
	private static int userCount;
	private static int listSize;
	
	public void append(User add){
		if(userCount == listSize){
			listSize = listSize*2;
			User[] newList = new User[listSize];
			for(int i = 0; i < userCount; i++){
				newList[i] = userList[i];
			}
			
			userList = newList;
		}
		//System.out.println("Current Size = " + movieCount);
		//System.out.println("Max Size = " + listSize);
		userList[userCount] = add;
		userCount++;
	}
	
	public User findUser(String toBeFound){
		User a = new User();
		return a;
	}
}
