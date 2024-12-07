public class Mario {
    private int taille;
    private int vies;
    private boolean invincible;
    private MarioState state;

    public Mario(int taille, int vies, MarioState state) {
        this.taille = taille;
        this.vies = vies;
        this.state = state;
    }

    public void sauter() {
        System.out.println("Mario saute !");
    }

    public void courir() {
        state.seDeplacer();
    }

    public void interagirAvecEnnemi() {
        state.interagirAvecEnnemi();
    }

    public void perdreVie() {
        if (!invincible) {
            vies--;
            System.out.println("Mario a perdu une vie. Vies restantes: " + vies);
        }
    }

    public void changerEtat(MarioState newState) {
        this.state = newState;
        System.out.println("Mario a changé d'état.");
    }
}
