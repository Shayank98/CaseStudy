package CaseStudy;

public class Sedan extends Cars {
	private  Boolean absEnabled;
	private int bootSpace;
	Sedan(long id, String name,Boolean absEnabled,int bootSpace) {
		super(id, name);
		this.absEnabled=absEnabled;
		this.bootSpace = bootSpace;
	}
	@Override
	double CalculateDriveCost(double km) {
		System.out.println("id :"+getId()+"\n"+"name :"+getName()+"\n"+"type : Sedan"+"\n"+"distance :"+km+"\n"+"absEnabled"+"\n"+absEnabled+"\n"+"BootSpace :"+bootSpace);
		if(bootSpace>600){
			return km*15*0.2;
		}
		else{
			return km*15;
		}
	}

}

class UtilityCar extends Cars{
	private boolean rearCoolingVents;
	UtilityCar(long id, String name,boolean rearCoolingVents) {
		super(id, name);
		this.rearCoolingVents = rearCoolingVents;
	}
	@Override
	double CalculateDriveCost(double km) {
		System.out.println("id :"+getId()+"\n"+"name :"+getName()+"\n"+"type : Utility"+"\n"+"distance :"+km+"\n"+"rearCoolingVents"+"\n"+rearCoolingVents);
		return km*18;
	}
}
