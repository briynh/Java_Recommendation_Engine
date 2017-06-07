
public class UserList {
	private static User[] userList;
	private static int userCount;
	private static int listSize;
	
	public UserList(){
		userList = new User[138494];
		userCount = 0;
		listSize = 138494;
	}
	
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
	
	public int findUser(int userID){
		for(int i = 0; i<userCount; i++){
			if(userList[i].getID() == userID){
				return i;
			}
		}
		return -1;
	}
	
	public int getUserCount(){
		return userCount;
	}
	
	
}
