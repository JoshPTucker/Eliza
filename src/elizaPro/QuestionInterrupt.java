package elizaPro;

public class QuestionInterrupt implements Runnable{
	@Override
	public void run(){
		Thread ct2 =Thread.currentThread();
		int count=1;
		
		while(true){
			try{
				Thread.sleep(5000);
			}catch (InterruptedException e){
				break;
			}
			System.err.println(Eliza.getRandomQuestion());
		}
		System.out.println("Thanks for talking with me");
	}
}
