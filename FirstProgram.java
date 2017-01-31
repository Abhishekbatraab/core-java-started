strictfp

class FirstProgram
{
		public static void main(int x)
		{
			System.out.println("this is int main");
			System.out.println("x="+x);
		}
		
		public static void main()
		{
			System.out.println("this is main withoutargs");
		}
		
		public static void main(String args[])
		{
			byte a = 10;
			short b = 20;
			int c=40;
			c++;
			int k=c;
			long r=100;			
			float p = 20.95f;
			double d=100.452669;
			boolean b1=true;
			char rr='A';

			int t8=100;
			int t9=100;
			if(t8==t9)
			{
				System.out.println("SameValue");
			}
			
			String name="Hello java";// string literal
			String name2 = new String("Hello java");
			if(name==name2)//compares the refers of two objects not their values
			{
				System.out.println("same reference");
			}
			else
			{
				System.out.println("differ reference");
			}
			if(name.equals(name2))//compare the values of two objects 
			{
				System.out.println("Equal string");
			}
			else
			{System.out.println("differ string");}
			System.out.println("Hello java"+name);
			main();
			main(25);						
		}
}