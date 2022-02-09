import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Note } from '../note';
import { HttpClient } from '@angular/common/http';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { HttpHeaders } from '@angular/common/http';
import { not } from '@angular/compiler/src/output/output_ast';

@Injectable()
export class NotesService {
  notes: Array<Note> = [];
  subject: BehaviorSubject<Array<Note>> = new BehaviorSubject(this.notes);

  constructor(private httpClient: HttpClient, private authenticationService: AuthenticationService) {
  }

  getNotes(): Observable<Array<Note>> {
    return this.httpClient.get<Array<Note>>('http://localhost:3000/api/v1/notes', {
      headers: new HttpHeaders().set('Authorization', `Bearer ${this.authenticationService.getBearerToken()}`)
    });
  }

  addNote(note: Note): Observable<Note> {
    return this.httpClient.post<Note>('http://localhost:3000/api/v1/notes', note, {
      headers: new HttpHeaders().set('Authorization', `Bearer ${this.authenticationService.getBearerToken()}`)
    });
  }
}
