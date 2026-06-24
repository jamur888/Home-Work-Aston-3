package Adapter;

class XmlToJsonAdapter implements JsonClient {
    private final OldXmlSystem xmlSystem;

    public XmlToJsonAdapter(OldXmlSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }

    @Override
    public void receiveJson(String jsonStr) {
        String xml = xmlSystem.getXmlData();
        String value = xml.replaceAll("<[^>]*>", "").trim();
        String adaptedJson = "{\"value\": " + value + "}";

        System.out.println("Адаптер передал JSON: " + adaptedJson);
    }
}