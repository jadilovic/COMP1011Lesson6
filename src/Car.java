
public class Car extends Vehicle implements IHaveStorage, IUseRoads {

	// INSTANCE VARIABLES +++++++++++++++++++++++++++
	private Boolean _trunk;
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++
	public Car(Boolean trunk) {
		this._trunk = trunk;
	}

	// OVERRIDE METHODS ++++++++++++++++++++++++++++++++++
	@Override
	public Boolean useRoads() {
		
		return (this.get_tireCount() > 0) ? true : false;
	}

	@Override
	public Boolean haveStorage() {

		return (this._trunk == true) ? true : false;
	}

}
