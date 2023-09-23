import java.util.Scanner;

public class Zoo1 {
    public static void main(String[] args) {
        // Utilisation de Scanner pour obtenir les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer le nombre de cages
        System.out.print("Entrez le nombre de cages : ");
        int nbrCages = scanner.nextInt();

        // Vider la ligne après la saisie de l'entier pour éviter les problèmes de lecture
        scanner.nextLine();

        // Demander à l'utilisateur d'entrer le nom du zoo
        System.out.print("Entrez le nom du zoo : ");
        String zooName = scanner.nextLine();

        // Affichage du message avec les nouvelles valeurs
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }
}