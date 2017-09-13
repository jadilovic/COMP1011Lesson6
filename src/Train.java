
public class Train extends Vehicle implements IHaveStorage, IUseRails {

	// INSTANCE VARIABLES +++++++++++++++++++++++++++++++
	private Boolean _storageCompartment;
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++
	public Train(Boolean storage) {
		this._storageCompartment = storage;
	}

	// OVERRIDE METHODS ++++++++++++++++++++++++++++++++++
	@Override
	public Boolean useRails() {
		
		return (this.getPassengerCount() > 10) ? true : false;
	}

	@Override
	public Boolean haveStorage() {
		
		return (this._storageCompartment == true) ? true : false;
	}

}
