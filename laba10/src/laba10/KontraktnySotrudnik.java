package laba10;

public class KontraktnySotrudnik extends Sotrudnik {
    public KontraktnySotrudnik(String fio, String position, double oklad) throws OkladException {
        super(fio, position, oklad);
    }

    @Override
    public double rasschitatZarplatu() {
        try {
            return oklad;
        } catch (Exception e) {
            System.out.println("Ошибка при расчёте зарплаты: " + e.getMessage());
            return 0;
        }
    }
}