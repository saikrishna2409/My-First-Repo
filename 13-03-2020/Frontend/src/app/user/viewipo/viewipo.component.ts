import { Component, OnInit } from '@angular/core';
import { Ipo } from 'src/app/models/ipo';
import { IpoService } from 'src/app/services/ipo.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewipo',
  templateUrl: './viewipo.component.html',
  styleUrls: ['./viewipo.component.css']
})
export class ViewipoComponent implements OnInit {

  ipo:Ipo[];

  constructor(private ipoService:IpoService,private router:Router) { }

  ngOnInit() {
  
  this.ipoService.getAllIpo().subscribe(data=>{
    this.ipo=data;
  });
}
  deleteIpo(ipo:Ipo) {
    this.ipoService.deleteIpo(ipo.id).subscribe();
    this.ipo=this.ipo.filter(u => u !== ipo);

    }
    updateIpo(ipo:Ipo){
      localStorage.removeItem('');
      localStorage.setItem('userId',ipo.id.toString());
      this.router.navigate(['updateipo']);
  }


}
