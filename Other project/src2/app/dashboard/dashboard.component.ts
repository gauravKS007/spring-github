import { Component, OnInit } from '@angular/core';
import { Note } from 'src/app/note';
import { NotesService } from 'src/app/services/notes.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  errMessage: string;
  public note: Note = new Note();
  public notes: Array<Note> = [];

  constructor(private noteService: NotesService) {
  }

  ngOnInit() {
    this.noteService.getNotes().subscribe(data => {
      if (data) {
        this.notes = data;
      } else {
        this.errMessage = 'Unable to get note list.';
      }
    }, error => {
      this.errMessage = ' ';
    });
  }

  takeNote() {
    if (!this.note.text || !this.note.title) {
      this.errMessage = 'Title and Text both are required fields';
      return;
    }
    this.noteService.addNote(this.note).subscribe(data => {
      if (data) {
        this.notes.push(this.note);
        this.note = new Note();
      } else {
        this.errMessage = 'Unable to get note list.';
      }
    }, error => {
      this.errMessage = ' ';
    });
  }
}
