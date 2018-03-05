package application.junkitem;

public class JunkItem {
	
	private String Name;
	private String color = "dimgray";
	private String[] sizes= {"tiny", "small", "medium", "large", "huge"};
	private double weight;
	
	
	public void SetName(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return this.Name;
	}
	
	

}
