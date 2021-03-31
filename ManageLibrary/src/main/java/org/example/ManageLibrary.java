package org.example;

class Managelibrary {
    private String CodeDocument;
    public String NamePublishing;
    public int DeliveryNumber;

    public Managelibrary() {

    }

    public Managelibrary (String CodeDocument,String NamePublishing,int DeliveryNumber) {
        this.CodeDocument = CodeDocument;
        this.NamePublishing = NamePublishing;
        this.DeliveryNumber = DeliveryNumber;
    }

    public String getCodeDocument() {
        return CodeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        CodeDocument = codeDocument;
    }

    public String getNamePublishing() {
        return NamePublishing;
    }

    public void setNamePublishing(String namePublishing) {
        NamePublishing = namePublishing;
    }

    public int getDeliveryNumber() {
        return DeliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        DeliveryNumber = deliveryNumber;
    }
}
