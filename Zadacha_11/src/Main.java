public class Main {

    public static void main(String[] args) {Document document = new Document("��������1", "������� �������� (Prototype) ��������� ��������� ������� �� ������ ��� ����� ��������� ��������-����������.\n�� ���� �� ���� ������ ������� ���������� ������� ������������ ��������. \n����� ���������� ��� ������������ ������� ������ ������������ ����������� �� ����� ����������.");
        System.out.println(document);
        Document reportsClon = document.copy();
        reportsClon.setName("��������2");
        System.out.println("---------------------------------------------\n" + reportsClon);
    }
}
