package laba10;

public class ShtatnySotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatnySotrudnik(String fio, String position, double oklad, double premiya) throws OkladException {
        super(fio, position, oklad);
        this.premiya = premiya;
    }

    public double getPremiya() {
	return premiya; 
	}
    public void setPremiya(double premiya) { 
	this.premiya = premiya; 
	}

    @Override
    public double rasschitatZarplatu() {
        try {
            if (premiya < 0) {
                throw new PremiyaException("Премия не может быть отрицательной: " + premiya);
            }
            return oklad + premiya;
        } catch (PremiyaException e) {
            System.out.println("Ошибка при расчёте зарплаты: " + e.getMessage());
            return oklad;
        } catch (Exception e) {
            System.out.println("Общая ошибка: " + e.getMessage());
            return oklad;
        }
    }
}