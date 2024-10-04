import { Component } from '@angular/core';
import { ChartConfiguration, ChartOptions, ChartType } from 'chart.js';

@Component({
  selector: 'app-test-chart',
  standalone: true,
  imports: [],
  templateUrl: './test-chart.component.html',
  styleUrl: './test-chart.component.css'
})
export class TestChartComponent {

  public barChartOptions: ChartOptions<'bar'> = {
    responsive: true,
  };
  public barChartLabels: string[] = ['Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi'];
  public barChartType: ChartType = 'bar';
  public barChartLegend = true;
  public barChartData: ChartConfiguration<'bar'>['data'] = {
    labels: this.barChartLabels,
    datasets: [
      { data: [65, 59, 80, 81, 56], label: 'Heures effectuées' }
    ]
  };
bar: any;
}
