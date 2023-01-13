import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiConsumerService {
  private SERVER_URI = "http://localhost:8080/?name="

  constructor(private httpClient: HttpClient) { }

  public getCharacter(name:string){
    return this.httpClient.get(this.SERVER_URI+name);
  }
}
