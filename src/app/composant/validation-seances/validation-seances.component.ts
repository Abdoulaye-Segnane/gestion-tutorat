import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MockDataService } from '../../mock-data.service';
@Component({
  selector: 'app-validation-seances',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './validation-seances.component.html',
  styleUrl: './validation-seances.component.css'
})
export class ValidationSeancesComponent {
validerSeance(_t4: any) {
throw new Error('Method not implemented.');
}
seances = [
  { session: 'Séance 1', date: '01/10/2024', valide: true },
  { session: 'Séance 2', date: '05/10/2024', valide: false }
  // Ajoute d'autres séances si nécessaire
];
}
