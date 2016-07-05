package Birds;

public class NonFlyingBird extends Bird{
	
	public NonFlyingBird(boolean feathers, boolean layEggs, String birdType, String habitat){
		super(feathers,layEggs,birdType,habitat);
	}
	
	public boolean fly(){
		return false;
	}
	
}
