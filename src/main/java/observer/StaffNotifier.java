package observer;

public class StaffNotifier implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Notification to shelter staff: " + message);
    }
}