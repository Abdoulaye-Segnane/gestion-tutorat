import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TestChartComponent } from "./test-chart/test-chart.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, TestChartComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'gestion-tutorat-frontend';
}
