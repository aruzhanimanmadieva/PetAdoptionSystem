package observer;

public class ApplicantNotifier implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Notification to applicant: " + message);
    }
}