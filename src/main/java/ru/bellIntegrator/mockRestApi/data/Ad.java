
package ru.bellIntegrator.mockRestApi.data;


public class Ad {

    private String company;
    private String url;
    private String text;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ad() {
    }

    /**
     * 
     * @param company
     * @param text
     * @param url
     */
    public Ad(String company, String url, String text) {
        super();
        this.company = company;
        this.url = url;
        this.text = text;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
