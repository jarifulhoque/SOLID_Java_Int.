package cm.qa.solid;

public class Mechanic {
	private String tyreThread;
	private String spoiler;
	
	// constructor
	public Mechanic(String colour, String model, int mileage, String tyreThread, String spoiler) {
		super();
		this.tyreThread = tyreThread;
		this.spoiler = spoiler;
	}
	
	// getters and setters
	public String getTyreThread() {
		return tyreThread;
	}

	public void setTyreThread(String tyreThread) {
		this.tyreThread = tyreThread;
	}

	public String getSpoiler() {
		return spoiler;
	}

	public void setSpoiler(String spoiler) {
		this.spoiler = spoiler;
	}

	@Override
	public String toString() {
		return "Mechanic [tyreThread=" + tyreThread + ", spoiler=" + spoiler + "]";
	}
	

	
	
	
	
}
