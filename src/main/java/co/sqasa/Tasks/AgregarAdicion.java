package co.sqasa.Tasks

public class AgregarAdicion implements Task {

    private final String adicion;

    public AgregarAdicion(String adicion) {
        this.adicion = adicion;
    }

    public static AgregarAdicion conNombre(String adicion) {
        return instrumented(AgregarAdicion.class, adicion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Scroll.to(By.xpath("//h3[contains(text(),'Selecciona adiciones')]")),
            Click.on(By.xpath("//label[contains(.,'" + adicion + "')]")),
            Click.on(By.xpath("//label[contains(.,'" + adicion + "')]/following::button[contains(text(),'Añadir')][1]"))
        );
    }
}
