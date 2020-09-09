package oop;

public class CompanyOrder extends OrderByAnyUser {

    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}