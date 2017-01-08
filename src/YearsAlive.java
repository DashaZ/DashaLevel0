import javax.swing.JOptionPane;

public class YearsAlive {

	public static void main(String[] args) {
String birth=JOptionPane.showInputDialog("When were you born?");
int date=Integer.parseInt(birth);
for (int i = 2016; i >= date ; i--) {
System.out.print(i);
	if(i>date){
		System.out.print(",");
	}
}
	}

}
