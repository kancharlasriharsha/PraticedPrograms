package programs;

class Odd implements Runnable {
    private SharedPrinter sp;
    private int max;
 
    // standard constructors 
    
    
    @Override
    public void run() {
        for (int i = 1; i <= max; i = i + 2) {
            sp.printOddNum(i);
        }
    }

	public Odd(SharedPrinter sp, int max) {
		super();
		this.sp = sp;
		this.max = max;
	}
}
