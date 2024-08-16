package libraryManagementSystemDay_5;

public class Book {
	private String title;
	private String subtitle;
	private static int count;
	
	public Book(String title) {
		this.title = title;
		count++;
	}
	
	public Book(String title,String subtitle) {
		this.title = title;
		this.subtitle = title;
		count++;
	}
	
	public void display() {
		System.out.println("Title : " + this.title);
		if(this.subtitle != null) {
			System.out.println("Subtitle : " + this.subtitle);
		}
		System.out.println();
	}
	
	public static void getTotalBookCount() {
		System.out.println("Total number of books created : " + count);
	}
	
	

}
