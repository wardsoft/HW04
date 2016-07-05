package Birds;

public class FlyingBird extends Bird{
	
	public FlyingBird(boolean feathers, boolean layEggs, String birdType, String habitat){
		super(feathers,layEggs,birdType,habitat);
	}
	
	public boolean fly(){
		return true;
	}
}
