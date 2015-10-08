import java.util.*;
import java.lang.Exception;

public class TowersOfHanoi{
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	private Stack<Integer> s3;
	private int size;
	private int min;
	private int tries;

	public TowersOfHanoi(int size){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		s3 = new Stack<Integer>();	
		this.size = size;

		for(int i = 0; i < size; i ++){
			s1.push(new Integer(size-i));
		}

		min = (int) (Math.pow(2,size)-1);
		tries = 0;
	}

	public void moveS1toS2(){
		if(s1.empty()){
			System.out.println("s1 is empty");
			return;
		}

		if( (!s2.empty()) && (!s1.empty()) && s1.peek() > s2.peek()){
			System.out.println("------cannot do that move!------");
			return;
		}
		Integer temp = s1.pop();
		s2.push(temp);
		tries ++;
	}

	public void moveS1toS3(){
		if(s1.empty()){
			System.out.println("s1 is empty");
			return;
		}

		if( (!s3.empty()) && (!s1.empty()) && s1.peek() > s3.peek()){
			System.out.println("------cannot do that move!------");
			return;
		}
		Integer temp = s1.pop();
		s3.push(temp);
		tries ++;
	}	


	public void moveS2toS1(){
		if(s2.empty()){
			System.out.println("s2 is empty");
			return;
		}
		if( (!s1.empty()) && (!s2.empty()) && s2.peek() > s1.peek()){
			System.out.println("------cannot do that move!------");
			return;
		}
		Integer temp = s2.pop();
		s1.push(temp);
		tries ++;
	}

	public void moveS2toS3(){
		if(s2.empty()){
			System.out.println("s2 is empty");
			return;
		}

		if( (!s3.empty()) && (!s2.empty()) && s2.peek() > s3.peek()){
			System.out.println("------cannot do that move!------");
			return;
		}
		Integer temp = s2.pop();
		s3.push(temp);
		tries ++;
	}

	public void moveS3toS1(){
		if(s3.empty()){
			System.out.println("s3 is empty");
			return;
		}

		if( (!s1.empty()) && (!s3.empty()) && s3.peek() > s1.peek()){
			System.out.println("------cannot do that move!------");
			return;
		}
		Integer temp = s3.pop();
		s1.push(temp);
		tries ++;
	}

	public void moveS3toS2(){
		if(s3.empty()){
			System.out.println("s3 is empty");
			return;
		}

		if( (!s2.empty()) && (!s3.empty()) && s3.peek() > s2.peek()){
			System.out.println("------cannot do that move!------");
			return;
		}
		Integer temp = s3.pop();
		s2.push(temp);
		tries ++;
	}

	private void printStack(){
		Iterator<Integer> it = s1.iterator();
		System.out.print("s1: ");
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

		it = s2.iterator();
		System.out.print("\ns2: ");
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

		it = s3.iterator();
		System.out.print("\ns3: ");
		while(it.hasNext()){
			System.out.print(it.next() + " ");
		}

		System.out.println("\n------------------------------------------");


	}

	public void printState(){
		System.out.println("\nSTATE\n-------------------------------(tries: "+ tries+")");
		printStack();
	}

	public void restart(){
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();
		s3 = new Stack<Integer>();	

		for(int i = 0; i < size; i ++){
			s1.push(new Integer(size-i));
		}
		tries = 0;
	}

	public boolean winGame(){
		if(s1.empty() && s2.empty()){
			if(tries == min){
				System.out.println("\nCongratulations Chris!! you finished in minimum number of tries!!");
				return true;
			}
			System.out.println("\nCongratulations Chris!! You solved it! number of tries were: "+ tries + "\nThe minimum number of tries is: " + min);
			return true;
		}
		return false;
	}

	public void printCmd(){
		System.out.println("\nCommands : \"s1s2\"- move top block from s1 to s2");
		System.out.println("           \"s1s3\"- move top block from s1 to s3");
		System.out.println("           \"s2s1\"- move top block from s2 to s1");
		System.out.println("           \"s2s3\"- move top block from s2 to s3");
		System.out.println("           \"s3s1\"- move top block from s3 to s1");
		System.out.println("           \"s3s2\"- move top block from s3 to s2");
		System.out.println("           \"state\"- to see the current state");
		System.out.println("           \"min\"- see minimum number of minimum steps to complete");
		System.out.println("           \"restart\"- restart game to beginning");
		System.out.println("           \"end\"- end program");
	}

	public void printMin(){
		System.out.println("The minimum number of steps is: " + min);
	}



	public static void main(String[] args){
		System.out.println("Choose the number of blocks you want to play with");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();

		int size = Integer.parseInt(input1);
		TowersOfHanoi tpf = new TowersOfHanoi(size);


		System.out.println("\nWelcome to Towers of Hanoi!!\n==========================================");
		tpf.printState();
		




		while(true){
			System.out.println("\npress command to see \"command\"\n");


			String input = sc.nextLine();

			switch(input){
				case "s1s2": tpf.moveS1toS2();
				tpf.printState();
				break;
				case "s1s3": tpf.moveS1toS3();
				tpf.printState();
				break;
				case "s2s1": tpf.moveS2toS1();
				tpf.printState();
				break;
				case "s2s3": tpf.moveS2toS3();
				tpf.printState();
				break;
				case "s3s1": tpf.moveS3toS1();
				tpf.printState();
				break;
				case "s3s2": tpf.moveS3toS2();
				tpf.printState();
				break;

				case "restart": tpf.restart();
				tpf.printState();
				break;

				case "command": tpf.printCmd();
				break;

				case "state": tpf.printState();
				break;

				case "min": tpf.printMin();
				break;

				case "end": sc.close();
				return;		

				default: System.out.println("Invalid move!");
				//tpf.printState();
				break;
			}

			if(tpf.winGame()){
				return;
			}
		}
	}
}