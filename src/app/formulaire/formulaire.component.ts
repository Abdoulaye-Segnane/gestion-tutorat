import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core'
import { CommonModule } from '@angular/common'; // Importer CommonModule
import { FormsModule } from '@angular/forms'; // Importer FormsModule



@Component({
  selector: 'app-formulaire',
  standalone: true,
  imports: [
    
    CommonModule, // Ajouter CommonModule ici
    FormsModule // Ajouter FormsModule ici
  ],
  templateUrl: './formulaire.component.html',
  styleUrl: './formulaire.component.css'
})


export class FormulaireComponent implements OnInit {
  seances = [
    { id: 1, title: 'Séance 1', date: '2024-10-10' },
    { id: 2, title: 'Séance 2', date: '2024-10-17' },
    { id: 3, title: 'Séance 3', date: '2024-10-24' }
  ];

  selectedSeance: number | null = null;
  seanceStatus: string | null = null;
  commentaires: string = '';

  constructor() {}

  ngOnInit(): void {}

  onSubmit(): void {
    if (this.selectedSeance && this.seanceStatus) {
      // Traiter la validation de la séance
      console.log('Séance validée:', {
        seanceId: this.selectedSeance,
        status: this.seanceStatus,
        commentaires: this.commentaires
      });
      // Ajouter ici la logique pour envoyer ces données au backend
    } else {
      console.error('Formulaire incomplet');
    }
  }
}
