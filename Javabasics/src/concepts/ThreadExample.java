package concepts;

public class ThreadExample {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	    for(int i=0; i<1900; i++){
	      new Thread("" + i){
	        public void run(){
	          System.out.println("Thread: " + getName() + " running");
	          
	        }
	      }.start();
	    }

	}

}