import javax.swing.JOptionPane;

public class Addition
{
	public static void main(String[] args)
	{
		//得到使用者的輸入藉由JOptionPane input dialogs
		String firstNumber=JOptionPane.showInputDialog("輸入第一個整數");
		String secondNumber=JOptionPane.showInputDialog("輸入第二個整數");
		
		//將輸入字串轉換為整數類別
		int number1=Integer.parseInt(firstNumber);
		int number2=Integer.parseInt(secondNumber);
		
		//兩樹相加
		int sum=number1+number2;
		
		//用JOptionpane message dialog 呈現輸出結果
		JOptionPane.showMessageDialog(null, "The sum is "+sum,"Sum of Tow Integers",JOptionPane.INFORMATION_MESSAGE);
		
	}
}