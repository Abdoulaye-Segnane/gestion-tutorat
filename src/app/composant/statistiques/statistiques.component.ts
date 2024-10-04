import { Component, OnInit } from '@angular/core';
import { Chart } from 'chart.js/auto'; // Assure-toi d'importer Chart.js
@Component({
  selector: 'app-statistiques',
  standalone: true, 
  imports: [],
  templateUrl: './statistiques.component.html',
  styleUrl: './statistiques.component.css',
})


export class StatistiquesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    this.createBarChart();
  }

  createBarChart(): void {
    const ctx = document.getElementById('barChart') as HTMLCanvasElement;
    new Chart(ctx, {
      type: 'bar',
      data: {
        labels: ['Semaine 1', 'Semaine 2', 'Semaine 3', 'Semaine 4', 'Semaine 5', 'Semaine 6', 'Semaine 7', 'Semaine 8', 'Semaine 9', 'Semaine 10'],
        datasets: [
          {
            label: 'Heures effectuées',
            data: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], // Exemple de données
            backgroundColor: 'rgba(75, 192, 192, 0.2)',
            borderColor: 'rgba(75, 192, 192, 1)',
            borderWidth: 1
          },
          {
            label: 'Heures non effectuées',
            data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], // Exemple de données
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            borderColor: 'rgba(255, 99, 132, 1)',
            borderWidth: 1
          }
        ]
      },
      options: {
        scales: {
          y: {
            beginAtZero: true
          }
        }
      }
    });
  }

}

