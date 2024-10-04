import { Component, OnInit } from '@angular/core';
import { FullCalendarModule } from '@fullcalendar/angular'; // Ajoute ceci pour importer le module FullCalendar
import dayGridPlugin from '@fullcalendar/daygrid';
import bootstrap from '../../main.server';
import { FormsModule } from '@angular/forms'; // Importer FormsModule
import { Modal } from 'bootstrap';

@Component({
  selector: 'app-seances',
  standalone: true,
  imports: [FullCalendarModule, FormsModule],
  templateUrl: './seances.component.html',
  styleUrl: './seances.component.css'
})


export class SeancesComponent implements OnInit {
  
onSubmit() {
 // Traiter le formulaire ici
 console.log('Séance planifiée:', this.titreSeance, this.dateSeance, this.heureSeance);
    
 // Fermer le modal après le plan
 const modalElement = document.getElementById('planifierSeanceModal');
 const modal = Modal.getInstance(modalElement);
 modal?.hide();

 // Réinitialiser le formulaire
 this.titreSeance = '';
 this.dateSeance = '';
 this.heureSeance = '';
}

  calendarOptions: any = {
    initialView: 'dayGridMonth', // Affiche par mois
    plugins: [dayGridPlugin], // Charge la vue jour-grille
    events: [
      { title: 'Séance de tutorat 1', date: '2024-10-07' },
      { title: 'Séance de tutorat 2', date: '2024-10-14' },
      
    ],
    eventClick: this.handleEventClick.bind(this) // Gère les clics sur les événements // Ici tu injecteras les séances planifiées
  };
totalSessions: number = 2;
totalHours: number = 4;
  calculateStatistic: any;
titreSeance: string = '';
dateSeance: string = '';
heureSeance: string = '';
  handleEventClick(info: { event: { title: string; }; }) {
    alert('Séance sélectionnée : ' + info.event.title);
    // Ici, tu pourrais ouvrir un modal pour afficher plus de détails
  }

  openPlanningModal() {
    // Utilisation de jQuery pour ouvrir le modal
    const modalElement = document.getElementById('planifierSeanceModal');
    const modal = new Modal(modalElement);
    modal.show();
  }


  ngOnInit(): void {
    this.loadSessions(); // Charger les données de séances
    this.calculateStatistic();
  }

  loadSessions() {
    // Exemple de données des séances
    this.calendarOptions.events = [
      { title: 'Séance de tutorat 1', date: '2024-10-07' },
      { title: 'Séance de tutorat 2', date: '2024-10-14' },
      // Ajout des autres séances ici
    ];
  }
}
