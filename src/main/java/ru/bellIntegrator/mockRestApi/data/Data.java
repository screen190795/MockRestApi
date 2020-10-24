
package ru.bellIntegrator.mockRestApi.data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    private Integer page = 2;
    @JsonProperty("per_page")
    private Integer perPage = 6;
    private Integer total = 12;
    @JsonProperty("total_pages")
    private Integer totalPages = 12;
    private List<User> data = new ArrayList<User>();
    private Ad ad;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param total
     * @param per_page
     * @param ad
     * @param data
     * @param total_pages
     * @param page
     */
    public Data(List<User> data, Ad ad) { 
        this.data = data;
        this.ad = ad;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }

}
