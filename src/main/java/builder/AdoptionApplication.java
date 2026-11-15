package builder;

import factory.Pet;

public class AdoptionApplication {

    private final String applicantName;
    private final String contact;
    private final Pet pet;
    private final String reason;

    AdoptionApplication(String applicantName, String contact,
                        Pet pet, String reason) {
        this.applicantName = applicantName;
        this.contact = contact;
        this.pet = pet;
        this.reason = reason;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getContact() {
        return contact;
    }

    public Pet getPet() {
        return pet;
    }

    public String getReason() {
        return reason;
    }
}
