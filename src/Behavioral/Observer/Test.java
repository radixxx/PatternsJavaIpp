package Behavioral.Observer;

public class Test {

	public static void main(String[] args) {
		CommentaryObjectObservable obj = new CommentaryObjectObservable("Apple Presentation");
		SMSUsersObserver observer = new SMSUsersObserver(obj, "Tim Cuck [New York]");
		SMSUsersObserver observer2 = new SMSUsersObserver(obj,"jony Ive [London]");
		observer.subscribe();
		observer2.subscribe();
		System.out.println("------------------------------------------------------");
		obj.setDesc("Welcome to live Apple Presentation");
		obj.setDesc("New iPhone");
		
		observer.unSubscribe();
		
		obj.setDesc("It's better a old iPhone!!");
		obj.setDesc("Current price 1499$");
	}
}
