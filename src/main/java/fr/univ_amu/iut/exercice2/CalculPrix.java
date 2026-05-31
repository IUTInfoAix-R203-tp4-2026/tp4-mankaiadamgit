package fr.univ_amu.iut.exercice2;

public class CalculPrix {

  private static final double TAUX_TVA = 1.20;
  private static final double SEUIL_REMISE_FIDELITE = 500.0;
  private static final double TAUX_REMISE_FIDELITE = 0.95;
  private static final double SEUIL_FRAIS_PORT_OFFERT = 50.0;
  private static final double MONTANT_FRAIS_PORT = 8.0;

  public double calculerPrixFinal(double montantHT, boolean clientFidele) {
    double montantTTC = montantHT * TAUX_TVA;
    if (clientFidele && montantTTC > SEUIL_REMISE_FIDELITE) {
      montantTTC = montantTTC * TAUX_REMISE_FIDELITE;
    }
    double fraisPort = 0;
    if (montantTTC < SEUIL_FRAIS_PORT_OFFERT) {
      fraisPort = MONTANT_FRAIS_PORT;
    }
    return montantTTC + fraisPort;
  }
}
