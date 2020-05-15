package programs;

class Even implements Runnable {
    private SharedPrinter sp;
    private int max;
 
    // standard constructor
    
 
    @Override
    public void run() {
        for (int i = 2; i <= max; i = i + 2) {
            sp.printEvenNum(i);
        }
    }

	public Even(SharedPrinter sp, int max) {
		super();
		this.sp = sp;
		this.max = max;
	}
}
