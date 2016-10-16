import javax.swing.JOptionPane;

//Write a program that asks the user for 3 numbers. 
//Then print the Numbers in ascending order. 
//Print the numbers in descending order.

public class Simplenumbersorter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String number1=JOptionPane.showInputDialog("Enter a number.");
String number2=JOptionPane.showInputDialog("Enter another number.");
String number3=JOptionPane.showInputDialog("Enter another number.");
int num1=Integer.parseInt(number1);
int num2=Integer.parseInt(number2);
int num3=Integer.parseInt(number3);
if(num1>num2&&num1>num3&&num2>num3){
System.out.println(num3+","+num2+","+ num1);
}
else if(num1>num2&&num1>num3&&num3>num2){
System.out.println(num2+","+num3+","+ num1);
}
else if(num2>num1&&num2>num3&&num1>num3){
System.out.println(num3+","+num1+","+ num2);
}
else if(num2>num1&&num2>num3&&num3>num1){
System.out.println(num1+","+num3+","+ num2);
	}
else if(num3>num1&&num3>num2&&num1>num2){
System.out.println(num2+","+num1+","+ num3);
}
else if(num3>num1&&num3>num2&&num2>num1){
System.out.println(num1+","+num2+","+ num3);
}
}
}