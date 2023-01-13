import { Component, OnInit } from '@angular/core';
import { ApiConsumerService } from '../api-consumer.service';
import { CharacterResult } from 'src/models/CharacterResult';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { CharacterDetails } from 'src/models/CharacterDetails';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  nome: string = "";
  formName: FormControl = new FormControl(null, Validators.required);

 constructor(private apiConsumer: ApiConsumerService){

 }
  
 characters: CharacterResult[] = [];
 charactersDetail: CharacterDetails = {
  name:'',
  gender:'',
  episode:[],
  url:''
 }


  ngOnInit() { }

  findCharacterByName(){
    this.apiConsumer.getCharacter(this.nome).subscribe((data: any) =>{
     this.characters = data.results;
    })
  }

  mostrarDetalhes(charactersDetail:any){
    console.log(charactersDetail)
    this.charactersDetail = charactersDetail;
  }
}
