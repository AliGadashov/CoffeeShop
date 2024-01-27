import repository.DBConnection;
import service.ManagementService;
import service.impl.ManagementServiceImpl;

public class Main {
    public static void main(String[] args) {
        ManagementService managementService = new ManagementServiceImpl();
        managementService.management();
    }
}