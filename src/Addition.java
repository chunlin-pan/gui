import javax.swing.JOptionPane;

public class Addition
{
	public static void main(String[] args)
	{
		//�o��ϥΪ̪���J�ǥ�JOptionPane input dialogs
		String firstNumber=JOptionPane.showInputDialog("��J�Ĥ@�Ӿ��");
		String secondNumber=JOptionPane.showInputDialog("��J�ĤG�Ӿ��");
		
		//�N��J�r���ഫ��������O
		int number1=Integer.parseInt(firstNumber);
		int number2=Integer.parseInt(secondNumber);
		
		//���ۥ[
		int sum=number1+number2;
		
		//��JOptionpane message dialog �e�{��X���G
		JOptionPane.showMessageDialog(null, "The sum is "+sum,"Sum of Tow Integers",JOptionPane.INFORMATION_MESSAGE);
		
	}
}