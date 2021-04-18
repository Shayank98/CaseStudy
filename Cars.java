package CaseStudy;

public abstract class Cars {
	private long id;
	private String name;

	Cars(long id,String name){
		this.setId(id);
		this.setName(name);
	}
	abstract double CalculateDriveCost(double km);
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}	
class HatchBack extends Cars{
	private Boolean PowerWindowEnabled;
	private Boolean automaticGear;
	HatchBack(long id, String name,Boolean PowerWindowEnabled,Boolean automaticGear) {
		super(id, name);
		this.PowerWindowEnabled = PowerWindowEnabled;
		this.automaticGear = automaticGear;
	}
	@Override
	double CalculateDriveCost(double km) {
		// TODO Auto-generated method stub
		System.out.println("id :"+getId()+"\n"+"name :"+getName()+"\n"+"type : HatchBack"+"\n"+"distance :"+km+"\n"+"PowerWindowEnabled"+"\n"+PowerWindowEnabled+"\n"+"automatic :"+automaticGear);
			if(automaticGear==false){
				return km*10;
			}
			else{
				return km*12;
			}
		}
}
