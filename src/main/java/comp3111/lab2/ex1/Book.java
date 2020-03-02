package comp3111.lab2.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS = 10;
	
	public Book() {
		chapters = new String[DEFAULT_CHAPTERS];
		for(int i = 0 ; i < chapters.length; i++) {
			chapters[i] = "Chapter " + i;
		}
	}
	
	public Book(String argument[]) {
		chapters = null;
		chapters = new String[argument.length];
		for(int i = 0 ; i < argument.length; i++) {
			chapters[i] = argument[i];	
		}
	}
	
	public String getChapter(int i) {
		if(i < 0|  i >= chapters.length) {
			String tempStr = "invalid chapter";
			return tempStr;
		}
		return chapters[i];
	}
	
	public String[] getChapters() {
		return chapters;
	}
}
