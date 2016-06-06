
public class number
{
	
	void number1()
	{
		String Serial="";
		int i=0;
		for(int j=1;j<=25;++j)
		{
			i=(int)(Math.random()*3);
			
			switch(i)
			{
				case 0:Serial+=(char)((int)(Math.random()*26)+97);
				break;
				case 1:Serial+=(char)((int)(Math.random()*26)+65);
				break;
				case 2:Serial+=(char)((int)(Math.random()*10)+48);
				break;
			}
			if(j%5==0&&j!=25)
				Serial+='-';
		}
		System.out.println("§Ç¸¹: "+Serial);
	}
}
