package Adapter;

public class Main {
    public static void main(String[] args) {
        OldXmlSystem oldSystem = new OldXmlSystem();
        JsonClient adapter = new XmlToJsonAdapter(oldSystem);
        adapter.receiveJson("dummy_trigger");
    }
}
