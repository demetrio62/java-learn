class Calculator{
	private int result;
	
	public void add(int ... params){
		result = 0;
		for (Integer param : params){
			result +=param;
		}
	}
	
	public void substr(int ... params){
		result = params[0] * 2;
		for (Integer param : params){
			result -=param;
		}
	}
	
	public void mult(int ... params){
		result = 1;
		for (Integer param : params){
			result *=param;
		}
	}
	
	public void divis(int ... params){
		result = params[0] * params[0];
		for (Integer param : params){
			result /=param;
		}
	}
	
	public void expon(int base, int pow){
		result = (int) Math.pow(base, pow);
	}
	
	public int getResult(){
		return result;
	}
	void clearResult(){
		result = 0;
	}
}