package laba9;

public class UnderGraduate extends Student {
    public int years;

    public UnderGraduate(String Name,int years) {
	super(Name);
	this.years = years;
    }
    @Override
    public String toString() {
	
	return name + years;
	
	
    }
}
