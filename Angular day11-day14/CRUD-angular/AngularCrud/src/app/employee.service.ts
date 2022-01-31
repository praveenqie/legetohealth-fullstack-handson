import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {

  baseUrl = 'http://localhost:9090'
  constructor(private _client:HttpClient) { }

  fetchEmployees():Observable<any>{
    let url = `${this.baseUrl}/employee`;
    return this._client.get(url);
  }

  storeEmployees(emp:any):Observable<any>{

    console.log(`post data${emp}`);
    let url = `${this.baseUrl}/employee`;
    return this._client.post(url,emp);
  }

  removeEmployee(empId:number):Observable<any>{
    let url = `${this.baseUrl}/employee/${empId}`;
    return this._client.delete(url);
  }

  searchEmployee(empId:number):Observable<any>{
    let url = `${this.baseUrl}/employee/${empId}`;
    return this._client.get(url);
  }
  

  updateEmployee(emp:any):Observable<any>{
    console.log(emp);
    let url = `${this.baseUrl}/employee`;
    return this._client.put(url,emp);
  }
}
