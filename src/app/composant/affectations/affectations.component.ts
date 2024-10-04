import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MockDataService } from '../../mock-data.service';
@Component({
  selector: 'app-affectations',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './affectations.component.html',
  styleUrl: './affectations.component.css'
})

export class AffectationsComponent implements OnInit {
affectations: any;
seances: any;


constructor(private mockDataService: MockDataService) { }

ngOnInit(): void {
  this.affectations = this.mockDataService.getAffectationsTuteurs();
}
 
}
