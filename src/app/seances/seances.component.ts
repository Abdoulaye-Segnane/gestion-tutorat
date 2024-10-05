import { Component, OnInit } from '@angular/core';
import { FullCalendarModule } from '@fullcalendar/angular'; // Ajoute ceci pour importer le module FullCalendar
import dayGridPlugin from '@fullcalendar/daygrid';
import bootstrap from '../../main.server';
import { FormsModule } from '@angular/forms'; // Importer FormsModule
import { Modal } from 'bootstrap';
import { isPlatformBrowser } from '@angular/common';
import { PLATFORM_ID, Inject } from '@angular/core';


@Component({
  selector: 'app-seances',
  standalone: true,
  imports: [FullCalendarModule, FormsModule],
  templateUrl: './seances.component.html',
  styleUrl: './seances.component.css'
})


export class SeancesComponent implements OnInit {
openPlanningModal() {
throw new Error('Method not implemented.');
}
  
onSubmit() {
 // Traiter le formulaire ici
 console.log('Séance planifiée:', this.titreSeance, this.dateSeance, this.heureSeance);
    
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

  /* constructor(@Inject(PLATFORM_ID) private platformId: Object) {}

  openPlanningModal() {
    const modalElement = document.getElementById('planifierSeanceModal');
    if (modalElement) {
      const modal = new bootstrap.Modal(modalElement); // Crée une instance de Modal
      modal.show(); // Montre le modal
    } else {
      console.error('L\'élément modal n\'a pas été trouvé.');
    }
  }*/
  


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
