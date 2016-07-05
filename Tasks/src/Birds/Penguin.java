package Birds;

public class Penguin extends NonFlyingBird{
	
	private final static String birdName = "Penguin";
	private final static String habitat = "Cold climates";

	public Penguin(){
		super(true,true,birdName,habitat);
	}
}
