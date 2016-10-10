
class Friend{
	String name;
	String phoneNum;
	String addr;
	public Friend(String name, String phoneNum, String addr) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
	}
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 : " + phoneNum);
		System.out.println("주소 : " + addr);
	}
	public void showBasicInfo(){
		
	}
}

class HighFriend extends Friend{
	String work;
	public HighFriend(String name, String phoneNum, String addr, String job) {
		super(name, phoneNum, addr);
		work = job;
	}
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("직업 : "+work);
	}
	@Override
	public void showBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+phoneNum);
	}
}
class UnivFriend extends Friend{
	String major;
	public UnivFriend(String name, String phoneNum, String addr, String major) {
		super(name, phoneNum, addr);
		this.major = major;
	}
	@Override
	public void showData() {
		// TODO Auto-generated method stub
		super.showData();
		System.out.println("전공 : "+ major);
	}
	@Override
	public void showBasicInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+name);
		System.out.println("전화 : "+phoneNum);
		System.out.println("전공 : "+ major);
	}
}

class FriendInfoHandler {
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
}


public class MyFriendInfoBook {
}
