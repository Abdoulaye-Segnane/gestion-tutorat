import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ValidationSeancesComponent } from './validation-seances.component';

describe('ValidationSeancesComponent', () => {
  let component: ValidationSeancesComponent;
  let fixture: ComponentFixture<ValidationSeancesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ValidationSeancesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ValidationSeancesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
