package fr.univ_amu.iut.exercice1;

public class Facture {

  private static final double TAUX_TVA = 1.20;
  private static final double SEUIL_REMISE = 100.0;
  private static final double TAUX_REMISE = 0.9;

  public double calculerTotal(Article[] articles) {
    double total = sommeHT(articles);
    total = appliquerTVA(total);
    total = appliquerRemise(total);
    return total;
  }

  private double sommeHT(Article[] articles) {
    double total = 0;
    for (Article a : articles) {
      total += a.prixUnitaireHT() * a.quantite();
    }
    return total;
  }

  private double appliquerTVA(double montant) {
    return montant * TAUX_TVA;
  }

  private double appliquerRemise(double montant) {
    if (montant > SEUIL_REMISE) {
      return montant * TAUX_REMISE;
    }
    return montant;
  }
}
