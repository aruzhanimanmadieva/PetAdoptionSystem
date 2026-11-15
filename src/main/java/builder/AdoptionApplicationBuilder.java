package builder;

import factory.Pet;

public class AdoptionApplicationBuilder {

    private String applicantName;
    private String contact;
    private Pet pet;
    private String reason;

    public AdoptionApplicationBuilder setApplicantName(String applicantName) {
        this.applicantName = applicantName;
        return this;
    }

    public AdoptionApplicationBuilder setContact(String contact) {
        this.contact = contact;
        return this;
    }

    public AdoptionApplicationBuilder setPet(Pet pet) {
        this.pet = pet;
        return this;
    }

    public AdoptionApplicationBuilder setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public AdoptionApplication build() {

        if (applicantName == null || contact == null
                || pet == null || reason == null) {
            throw new IllegalStateException(
                    "All application fields must be filled."
            );
        }

        return new AdoptionApplication(
                applicantName,
                contact,
                pet,
                reason
        );
    }
}
