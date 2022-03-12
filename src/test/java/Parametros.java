import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametros {

    @Test
    @Parameters({"username"})
    public void login(String username) {
        System.out.println("El usuario es:" + username);
    }
}
