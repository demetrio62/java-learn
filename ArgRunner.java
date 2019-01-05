public class ArgRunner{
	public static void main(String[] args){
		Calculator calc = new Calculator();
		char operand = args[1].charAt(0);
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[2]);

		//System.out.println(args);
		if (args.length != 3) 
			System.out.println("Error! Command format: java ArgRunner operation n1 n2 operation");
				else{
					switch(operand) {
						case '+':
							System.out.println(calc.add(first, second));
							break;
						case '-':
							System.out.println(calc.substr(first, second));
							break;
						case '*':
							System.out.println(calc.mult(first, second));
							break;
						case '/':
							System.out.println(calc.divis(first, second));
							break;
						case '^':
							System.out.println(calc.expon(first, second));
							break;
						default:
							System.out.println("Operation unavailable!");
							break;

					}
				}
		
	}
}