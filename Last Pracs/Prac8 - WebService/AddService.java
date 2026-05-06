import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class AddService {

    @WebMethod
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Endpoint.publish(
                "http://localhost:8080/add",
                new AddService());

        System.out.println("Web Service Started...");
    }
}