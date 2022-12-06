package Fundamentos;

public class valor_compare {
public static void main(String[] args) {
	String valor= "CDD4.0_Java";
	System.out.println(valor.compareTo("CDD4.0_Java")== 0? true : false);
	System.out.println(valor.compareTo("CDD4.0_JAVA")== 0? true : false);
	System.out.println(valor.compareToIgnoreCase("CDD4.0_Java")== 0? true:false);
	System.out.println(valor);
	
}
