import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormControl } from '@angular/forms';
import { ThrowStmt } from '@angular/compiler';
import { UploadserviceService } from 'src/app/services/uploadservice.service';
import bsCustomFileInput from 'bs-custom-file-input';


@Component({
  selector: 'app-admindocupload',
  templateUrl: './admindocupload.component.html',
  styleUrls: ['./admindocupload.component.css']
})

export class AdmindocuploadComponent implements OnInit {
 excelUploadForm:FormGroup;
 constructor(private stockPriceService:UploadserviceService){}
  file:File;
  isError:boolean =false;
  errorMessage:string="";
  ngOnInit(){
    this.excelUploadForm=new FormGroup({
      excelFileUpload:new FormControl("",[Validators.required])
    })
    bsCustomFileInput.init();
}
onFileChange(e)
{
  this.file =e.target.files[0];
  console.log(this.file);

}
uploadData(){
  console.log('AAA');
  const UploadSheetData =new FormData();
  UploadSheetData.append("stocksSheet",this.file,this.file.name);
  this.stockPriceService.uploadStocksSheet(UploadSheetData).subscribe(data =>{
    console.log("Uploaded");
    console.log(data);
  },
  error => {
    console.log(error);
  })
}
}
