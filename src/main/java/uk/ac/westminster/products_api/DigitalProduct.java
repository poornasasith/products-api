package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct(){
    }

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB0){
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB0;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }

}
