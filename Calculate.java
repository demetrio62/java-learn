public class Calculate {
	public static void main (String[] args){
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		
		System.out.println("Ready to Calculate number " + first + " and number " + second + ":");
		
		int sum = first + second;
		int diff = first - second;
		int mult = first * second;
		int del = first / second;
		double lvl = Math.pow(first, second);
		
		System.out.println("Сумма: " + sum);
		System.out.println("Разница: " + diff);
		System.out.println("Произведение: " + mult);
		System.out.println("Деление: " + del);
		System.out.println("Степень: " + lvl);
				
	}
}