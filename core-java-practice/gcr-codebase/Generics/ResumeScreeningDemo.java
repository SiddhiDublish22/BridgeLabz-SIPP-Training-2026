

import java.util.ArrayList;
import java.util.List;


abstract class JobRole {

    String role;

    public JobRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return role;
    }

}


class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

}

class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

}

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

}


class Resume<T extends JobRole> {

    private T role;

    public Resume(T role) {
        this.role = role;
    }

    public void processResume() {
        System.out.println("Processing Resume for " + role);
    }

}


class ScreeningSystem {

    public static void screenCandidates(List<? extends JobRole> roles) {

        for (JobRole role : roles) {
            System.out.println(role);
        }

    }

}


public class ResumeScreeningDemo {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager());

        r1.processResume();
        r2.processResume();
        r3.processResume();

        System.out.println();

        List<JobRole> roles = new ArrayList<>();

        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningSystem.screenCandidates(roles);

    }

}