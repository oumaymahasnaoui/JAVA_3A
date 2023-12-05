public class Main {
    public static void main(String[] args) {

        DepartementHashSet departementHashSet = new DepartementHashSet();

        // Ajoutez quelques départements
        Departement dep1 = new Departement(1, "Informatique", 20);
        Departement dep2 = new Departement(2, "Finance", 15);

        departementHashSet.ajouterDepartement(dep1);
        departementHashSet.ajouterDepartement(dep2);

        // Affichez la liste des départements
        System.out.println("Liste des départements :");
        departementHashSet.displayDepartement();

        // Recherchez un département par nom
        String nomRecherche = "Informatique";
        if (departementHashSet.rechercherDepartement(nomRecherche)) {
            System.out.println("Le département '" + nomRecherche + "' existe.");
        } else {
            System.out.println("Le département '" + nomRecherche + "' n'existe pas.");
        }
    }
}
