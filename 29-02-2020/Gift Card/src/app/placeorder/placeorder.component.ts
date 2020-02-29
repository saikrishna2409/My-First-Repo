import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { OrderService } from '../service/order.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-placeorder',
  templateUrl: './placeorder.component.html',
  styleUrls: ['./placeorder.component.css']
})
export class PlaceorderComponent implements OnInit {

  checker: FormGroup;
  constructor(private formBuilder: FormBuilder, private service: OrderService, private router: Router) { }

  addOrder() {
    this.service.saveOrder(this.checker.value).subscribe(data => {
      console.log("Order Placed Successfully" + data);
      this.router.navigate(['/view']);
    });
  }
  ngOnInit() {

    this.checker = this.formBuilder.group({
      id: ['', Validators.required],
      amount: ['', Validators.required],
      paise: ['', Validators.required],
      firstname: ['', Validators.required],
      lastname: ['', Validators.required],
      shippingadd: ['', Validators.required],
      city: ['', Validators.required],
      state: ['', Validators.required],
      country: ['', Validators.required],
      pincode: ['', Validators.required],
      bfirstname: ['', Validators.required],
      blastname: ['', Validators.required],
      ph1: ['', [Validators.required, Validators.min(6)]],
      ph2: ['', Validators.required],
      ph3: ['', Validators.required],
      ph4: ['', Validators.required],
      ph5: ['', Validators.required],
      ph6: ['', Validators.required],
      ph7: ['', Validators.required],
      ph8: ['', Validators.required],
      ph9: ['', Validators.required],
      ph10: ['', Validators.required],

      mail: ['', Validators.email]

    });
  }

}

