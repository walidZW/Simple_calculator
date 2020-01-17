package application;

public class modal {

	
	public long calculate(long oper1,long oper2,String opertor) {
	switch (opertor) {
	case "+":
		return oper1+oper2;
	case "-":
		return oper1-oper2;
		
  
	case "x":
		return oper1*oper2;
		
		
		
	case "/":
		return oper1/oper2;
	default: return 0;
	}
	
}
}	
