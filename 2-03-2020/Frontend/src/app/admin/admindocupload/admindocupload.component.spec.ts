import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmindocuploadComponent } from './admindocupload.component';

describe('AdmindocuploadComponent', () => {
  let component: AdmindocuploadComponent;
  let fixture: ComponentFixture<AdmindocuploadComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdmindocuploadComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdmindocuploadComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
