package hello_world;

class HelloWorld {

	static int ageMultiply(int age){
		return age * 3;
	}
	
	public static void main(String[] args){
		System.out.printf("Hello, I am %s my age is %s and if " +
						"my age is multiplied by 3 than result is %d%n",
				args[0], args[1], ageMultiply(Integer.parseInt(args[1])));
	} 
}
