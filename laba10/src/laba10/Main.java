package laba10;

public class Main {
    public static void main(String[] args) {
        try {
            Sotrudnik s1 = new ShtatnySotrudnik("Иванов И.И.", "Инженер", -50000, 10000);
            Sotrudnik s2 = new KontraktnySotrudnik("Петрова А.А.", "Аналитик", 45000);
            Sotrudnik s3 = new ShtatnySotrudnik("Сидоров В.В.", "Менеджер", 60000, -5000); 

            System.out.println(s1.getFio() + ": " + s1.rasschitatZarplatu());
            System.out.println(s2.getFio() + ": " + s2.rasschitatZarplatu());
            System.out.println(s3.getFio() + ": " + s3.rasschitatZarplatu());

        } catch (OkladException e) {
            System.err.println(e.getMessage());
        }
    }
}
