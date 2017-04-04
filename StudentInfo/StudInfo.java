
public class StudInfo {
	
	private int id;
	private String name;
	private String schoolName;
	private int marks[] = new int[3];
	
	StudInfo()
	{
		schoolName="DPS public school";
	}
	
	StudInfo(int id, String name, int ...marks)
	{
		this();
		this.id=id;
		this.name=name;	
		this.marks=marks;
	}
	
	private int getTotal()
	{
		int sum=0;
		for(int mark: marks)
			sum=sum+mark;
		return sum;
	}
	
	private float getPercentage()
	{
		return this.getTotal()/3;
		
	}
	
	private String getGrade()
	{
		return this.getTotal()>90?"Grade A":"B Grade";
	}
	
	private void printLine()
	{
		System.out.println("*******************************");
		
	}
	
	public void printMarkSheet()
	{
		printLine();		
		System.out.println(schoolName);
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: ");
		for(int mark: marks)
		{
			System.out.println(mark);
		}
		System.out.println("Total Marks: "+getTotal());
		System.out.println("Percentage:"+getPercentage());
		System.out.println("Grade: "+getGrade());
		printLine();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
}
