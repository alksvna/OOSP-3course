public class Main {

    public static void main(String[] args) {Document document = new Document("Документ1", "Паттерн Прототип (Prototype) позволяет создавать объекты на основе уже ранее созданных объектов-прототипов.\nТо есть по сути данный паттерн предлагает технику клонирования объектов. \nКогда конкретный тип создаваемого объекта должен определяться динамически во время выполнения.");
        System.out.println(document);
        Document reportsClon = document.copy();
        reportsClon.setName("Документ2");
        System.out.println("---------------------------------------------\n" + reportsClon);
    }
}
