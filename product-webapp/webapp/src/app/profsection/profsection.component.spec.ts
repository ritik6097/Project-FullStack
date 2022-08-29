import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfsectionComponent } from './profsection.component';

describe('ProfsectionComponent', () => {
  let component: ProfsectionComponent;
  let fixture: ComponentFixture<ProfsectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfsectionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfsectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
