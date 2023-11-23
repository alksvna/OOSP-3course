public class Document implements Copyable{
    private String name;
    private String content;

    public Document(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "�������� = " + name + "\n���������� = " + content ;
    }

    @Override
    public Document copy() {
        return new Document(name, content);

    }
}
