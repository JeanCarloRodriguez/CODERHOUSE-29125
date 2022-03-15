package Data;

import org.testng.annotations.DataProvider;

public class FacebookUsers {

    @DataProvider(name = "FacebookUsers")
    public static Object[][] getFacebookUsers() {
        return new Object[][]
                {
                        {"jose@gmail.com", "password", true},
                        {"luis@gmail.com", "password", true},
                        {"pedro@gmail.com", "password", false},
                        {"fernando@gmail.com", "contrasena", false}
                };
    }
}
