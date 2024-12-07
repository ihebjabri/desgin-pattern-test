public class Main {
    public static void main(String[] args) {
        // Initial Mario state
        Mario mario = new Mario(1, 3, new EtatPetit(null));
        mario.changerEtat(new EtatPetit(mario));

        // Test state changes
        mario.courir();
        mario.interagirAvecEnnemi();

        mario.changerEtat(new EtatNormal(mario));
        mario.courir();
        mario.interagirAvecEnnemi();

        mario.changerEtat(new EtatInvincible(mario));
        mario.courir();
        mario.interagirAvecEnnemi();

        // Add decorators
        mario = new DecorateurFleurFeu(mario);
        mario.courir();
        mario.sauter();

        mario = new DecorateurChampion(mario);
        mario.courir();
        mario.sauter();
    }
}
