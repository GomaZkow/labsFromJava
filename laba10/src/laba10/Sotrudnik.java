package laba10;

public class Sotrudnik {
    private String fio;
    private String position;
    protected double oklad;

    public Sotrudnik(String fio, String position, double oklad) throws OkladException {
        this.fio = fio;
        this.position = position;
        this.setOklad(oklad);
    }

    public String getFio() { return fio; }
    public void setFio(String fio) { this.fio = fio; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getOklad() { return oklad; }
    public void setOklad(double oklad) throws OkladException {
	if(oklad<0) {
	    throw   new OkladException(oklad) ; 
	}
	
	}

    public double rasschitatZarplatu() {
        try {
            return oklad;
        } catch (Exception e) {
            System.err.println("Ошибка при расчёте зарплаты: " + e.getMessage());
            return 0;
        }
    }
}