import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlogprofileComponent } from './blogprofile.component';

describe('BlogprofileComponent', () => {
  let component: BlogprofileComponent;
  let fixture: ComponentFixture<BlogprofileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BlogprofileComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BlogprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
