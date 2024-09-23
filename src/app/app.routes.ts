import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { SeancesComponent } from './seances/seances.component';
export const routes: Routes = [
    { path: 'dashboard', component: DashboardComponent },
  { path: 'formulaire', component: FormulaireComponent },
  { path: 'seances', component: SeancesComponent },
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' }, // Redirection par défaut
  { path: '**', redirectTo: '/dashboard' } // Redirection en cas de chemin non défini
];
