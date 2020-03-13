import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminadddetailsComponent } from './adminadddetails.component';

describe('AdminadddetailsComponent', () => {
  let component: AdminadddetailsComponent;
  let fixture: ComponentFixture<AdminadddetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminadddetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminadddetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
