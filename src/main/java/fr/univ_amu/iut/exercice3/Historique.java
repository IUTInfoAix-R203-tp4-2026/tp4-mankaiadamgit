package fr.univ_amu.iut.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Historique {

  private static final int TAILLE_MAX = 10;
  private final List<String> entrees = new ArrayList<>();

  public void enregistrer(String choix) {
    entrees.add(choix);
    if (entrees.size() > TAILLE_MAX) {
      entrees.remove(0);
    }
  }

  public List<String> asList() {
    return entrees;
  }

  public String afficher() {
    StringBuilder sb = new StringBuilder();
    sb.append("--- Historique ---\n");
    for (String h : entrees) {
      sb.append("- ").append(h).append("\n");
    }
    return sb.toString();
  }
}
