import { Component } from '@angular/core';
import { AffectationsComponent } from "../composant/affectations/affectations.component";
import { ValidationSeancesComponent } from "../composant/validation-seances/validation-seances.component";
import { StatistiquesComponent } from '../composant/statistiques/statistiques.component';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [AffectationsComponent, ValidationSeancesComponent, StatistiquesComponent],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {

}
