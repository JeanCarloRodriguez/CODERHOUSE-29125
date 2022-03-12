import org.testng.annotations.Test;

public class TestNGPriority {
    @Test(enabled = false)
    public void verificarLaExistenciaProducto() {
        System.out.println("Test de verification del producto");
    }

    @Test(priority = 0)
    public void verificarInicioPagina() {
        System.out.println("Test de verification de inicio de pagina");
    }
}
