import { TestBed } from '@angular/core/testing';

import { CaltaxService } from './caltax.service';

describe('CaltaxService', () => {
  let service: CaltaxService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CaltaxService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
