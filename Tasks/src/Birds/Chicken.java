package Birds;

public class Chicken extends NonFlyingBird{

	private final static String birdName = "Chicken";
	private final static String habitat = "Farms, forests and fields";
	
	public Chicken(){
		super(true,true,birdName,habitat);
	}
}
