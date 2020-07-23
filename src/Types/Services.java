package Types;

public class Services {
	public double price;
	double services=0;
	
	public Services() {

}
	public void addServices(double services1) {
		services=services+services1;
	}
	public double getServices() {
		return services;
	}
}
