package co.sqasa.Tasks;

public class NavegarAlMenu implements Task {

    private final String opcionMenu;

    public NavegarAlMenu(String opcionMenu) {
        this.opcionMenu = opcionMenu;
    }

    public static NavegarAlMenu conOpcion(String opcionMenu) {
        return instrumented(NavegarAlMenu.class, opcionMenu);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(By.linkText(opcionMenu)) // Ejemplo: "Rosas"
        );
    }
}
