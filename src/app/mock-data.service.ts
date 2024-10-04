import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MockDataService {

  constructor() { }

  getAffectationsTuteurs() {
    return [
      { tuteur: 'Tuteur Amadou NDIAYE', groupe: 'Groupe 1', module: 'Projet opérationnel' },
      { tuteur: 'Tuteur Joseph Sega NDIONE', groupe: 'Groupe 2', module: 'UX Design' },
      { tuteur: 'Tuteur Joseph Sega NDIONE', groupe: 'Groupe 2', module: 'Design Thinking' },
      { tuteur: 'Tuteur Khalifa SYLLA', groupe: 'Groupe 1', module: 'Algorithmes avancés' },
      { tuteur: 'Tuteur Mouhamadou TOURE', groupe: 'Groupe 2', module: 'Bases de Données Avancée' },
      // Ajoute d'autres données fictives
    ];
  }

  getSeancesValidation() {
    return [
      { seance: 'Séance 1', date: '01/10/2024', statut: 'À valider' },
      { seance: 'Séance 2', date: '02/10/2024', statut: 'Validé' },
      { seance: 'Séance 3', date: '02/10/2024', statut: 'A Validé' },
      { seance: 'Séance 4', date: '02/10/2024', statut: 'A Validé' },
      { seance: 'Séance 5', date: '02/10/2024', statut: 'Validé' },
      // Ajoute d'autres séances
    ];
  }

  getStatistiques() {
    return {
      totalTuteurs: 20,
      totalGroupes: 10,
      totalSeances: 50,
    };
  }
}
