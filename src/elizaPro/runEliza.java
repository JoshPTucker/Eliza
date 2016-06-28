package elizaPro;
import java.util.Scanner;
public class runEliza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cont=true;
		String answer=" ";
		Scanner in=new Scanner(System.in);
		Thread question = new Thread(new QuestionInterrupt());
		Eliza e =new Eliza();
		System.out.println("Welcome to Eliza, your virtual therapist.");
		System.out.println("Type to begin talking with Eliza. Type q to quit");
		question.start();
		while(cont){
			answer=in.nextLine().toLowerCase();
			if(answer.equals("hello eliza")||answer.equals("hello")||answer.equals("hi")){
			System.out.println("Hello");
			}else if(answer.equals("q")) {
				cont=false;
				break;
			}else if(cont=true){
				System.out.println(Eliza.getQualifier()+" "+e.respond(answer));
				System.out.println(Eliza.getHedge());
			}
		
		}
		question.interrupt();
		in.close();
	}

}
