package Birds;

public abstract class Bird {
	
	private boolean feathers;
	private boolean layEggs;
	private String  birdType;
	private String  habitat;
	
	public static void main(String[] args){
		
		Eagle eagle = new Eagle();
		
		System.out.println(eagle.toString());
		
		Chicken chicken = new Chicken();
		
		System.out.println(chicken.toString());
		
		Swallow swallow = new Swallow();
		
		System.out.println(swallow.toString());
		
		Penguin penguin = new Penguin();
		
		System.out.println(penguin.toString());
		
	
	}
	
	public Bird(boolean feathers, boolean layEggs, String birdType, String habitat) {
		this.feathers = feathers;
		this.layEggs = layEggs;
		this.birdType = birdType;
		this.habitat = habitat;
	}

	public abstract boolean fly();
	
	public String toString(){
		return "--------------------\n"
				+ birdType +
			   "\n--------------------" +
			   "\nCan fly = " + fly() +
			   "\nLay Eggs = " + layEggs +
			   "\nFeathers = " + feathers +
			   "\nHabitat = " + habitat;
	}
}