import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FullCalendarModule } from '@fullcalendar/angular'; // Importe FullCalendarModule


// Import de NgChartsModule
import { BaseChartDirective, provideCharts, withDefaultRegisterables } from 'ng2-charts';
import { MockDataService } from './mock-data.service';
// Importation des composants
@NgModule({
  declarations: [ ],
  imports: [
    FullCalendarModule,
    BrowserModule,
    BaseChartDirective,  // Assure-toi que NgChartsModule est bien importé ici
  ],
  providers: [provideCharts(withDefaultRegisterables()), MockDataService],
  bootstrap: []
})
export class AppModule { }
