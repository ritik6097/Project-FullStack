import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetprofileComponent } from './getprofile.component';

describe('GetprofileComponent', () => {
  let component: GetprofileComponent;
  let fixture: ComponentFixture<GetprofileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GetprofileComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GetprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
