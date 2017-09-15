
public abstract class Vehicle {

	// INSTANT VERIABLES (FIELDS) ++++++++++++++++++++++
	private int _tireCount;
	private int _passengerCount;
	
	// PROPERTIES ++++++++++++++++++++++++++++++++++++++
	public int get_tireCount() {
		return _tireCount;
	}

	public void set_tireCount(int _tireCount) {
		this._tireCount = _tireCount;
	}
	
	public int getPassengerCount() {
		return _passengerCount;
	}

	public void setPassengerCount(int _passengerCount) {
		this._passengerCount = _passengerCount;
	}
	
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++
	public void Vehicle(){
		
	}
	
	// OVERRIDE PUBLIC METHOD toString derived from Object superclass
	@Override
	public String toString(){
		return "The Vehicle has " + this._tireCount + " tiers";
	}



}
