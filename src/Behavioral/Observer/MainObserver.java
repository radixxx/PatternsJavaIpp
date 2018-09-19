package Behavioral.Observer;

import java.util.ArrayList;

public class MainObserver {

	public static void main(String[] args) {
		Subject subject = new CommentaryObject(new ArrayList<Observer>(), "Apple Presentation");
		Observer observer = new SMSUsers(subject, "Tim Cuck [New York]");
		observer.subscribe();
		
		System.out.println();
		
		Observer observer2 = new SMSUsers(subject, "jony Ive [London]");
		observer2.subscribe();
		
		Commentary cObject = ((Commentary)subject);
		cObject.setDesc("Welcome to live Apple Presentation");
		cObject.setDesc("New iPhone");
		
		System.out.println();
		
		observer2.unSubscribe();
		
		System.out.println();
		
		cObject.setDesc("It's better a old iPhone!!");
		cObject.setDesc("Current price 1499$");
		
		System.out.println();
		
		Observer observer3 = new SMSUsers(subject, "Marrie [Paris]");
		observer3.subscribe();
		
		System.out.println();
		
		cObject.setDesc("It's a new Apple Watch!!");
		cObject.setDesc("New price 199$");
		
	}

}
