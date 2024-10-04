import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { SeancesComponent } from './seances/seances.component';
import { AffectationsComponent } from './composant/affectations/affectations.component';
import { ValidationSeancesComponent } from './composant/validation-seances/validation-seances.component';
import { StatistiquesComponent } from './composant/statistiques/statistiques.component';
export const routes: Routes = [
  { path: 'dashboard', component: DashboardComponent },
  { path: 'formulaire', component: FormulaireComponent },
  { path: 'seances', component: SeancesComponent },
  { path: 'affectations', component: AffectationsComponent },
  { path: 'validation-seances', component: ValidationSeancesComponent },
  { path: 'statistiques', component: StatistiquesComponent },
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' }, // Redirection par défaut
  { path: '**', redirectTo: '/dashboard' } // Redirection en cas de chemin non défini
];
