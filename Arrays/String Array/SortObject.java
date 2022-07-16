public class SortObject
{

	private void DisplayStudentRank(Student[] arr1)
	{
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i].Name +"---"+arr1[i].mark);
		}
	}
	public static void main(String []args)
	{
		Student s1=new Student("name1", 90);

		Student [] arr= {

			new Student("nam", 90),
			new Student("abc", 80),
			new Student("abc", 90),
			new Student("bcd", 70),
			new Student("afc", 70),
			new Student("abp", 50),
			new Student("mno", 70)

		};

		SortObject obj=new SortObject();
		obj.sortStudentUsingName(arr);
		obj.DisplayStudentRank(arr);
	}

	private void sortStudentUsingName(Student []arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].Name.compareTo(arr[j+1].Name) > 0)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	private void sortStudentArrayByMarks(Student[] arr)
	{
		// implementation of bubble sort algorithm
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j].mark > arr[j+1].mark)
				{
					Student temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}



	}

}
class Student
{
	public String Name;
	public int mark;

	public Student(String name, int marks)
	{
		this.Name=name;
		this.mark=marks;
	}
}