package onlineRetailer;

import java.util.ArrayList;
import java.util.List;

public class CompanyUtils {
    public static List<Company> createListOfCompanies(long id, String username, Address address) {
        Company company = new Company(username, address, id);
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Katana", new Address("Moldova", "Straseni", "Columna"), 1));
        companies.add(new Company("Star", new Address("Moldova", "Chisinau", "Sfatul Tarii"), 2));
        companies.add(new Company("Computer Systems", new Address("Romania", "Cluj", "Teilor"), 2));
        companies.add(new Company("Macros", new Address("Moldova", "Chisinau", "Arborilor"), 3));
        companies.add(new Company("Fast Track", new Address("Moldova", "Ungheni", "Eminescu"), 4));
        companies.add(new Company("Burgher Co", new Address("Romania", "Bucharest", "Merilor"), 5));
        companies.add(new Company("Cioco", new Address("Finland", "Helsinki", "Molotov"), 6));
        companies.add(new Company("Freedom", new Address("Russia","Moscow", "Andropov"), 7));
        return companies;
    }
}
