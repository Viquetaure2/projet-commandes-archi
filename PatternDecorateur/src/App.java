import modele.Message;
import modele.decoration.Chiffreur;
import modele.decoration.AtbashCipher;
import modele.decoration.CrypteurXOR;
import modele.decoration.InverseurDeMessage;
import modele.decoration.RotateurDeLettre;

public class App {

	public static void main(String[] args) {
		Message secret = new Message("Vive l'hiver1");
		System.out.println(secret.getTexte());
		
		Message secretInverse = new InverseurDeMessage(secret);
		System.out.println(secretInverse.getTexte() + "\n");
		
		Message messageRot1 = new RotateurDeLettre(secretInverse);
		System.out.println(messageRot1.getTexte() + "\n");
		
		Message messageAtbash = new AtbashCipher(messageRot1);
		System.out.println(messageAtbash.getTexte() + "\n");
		
		Message messageChiffre = new Chiffreur(messageAtbash);
		System.out.println(messageChiffre.getTexte() + "\n");
		
		Message messageCrypte = new CrypteurXOR(secret);
		System.out.println(messageCrypte.getTexte() + "\n");
		Message messageDecrypte = new CrypteurXOR(messageCrypte);
		System.out.println(messageDecrypte.getTexte());
	}
}
