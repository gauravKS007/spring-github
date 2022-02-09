import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {AppComponent} from './app.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import {HeaderComponent} from './header/header.component';
import {MatExpansionModule} from '@angular/material/expansion';
import {MatCardModule} from '@angular/material/card';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from '@angular/forms';

import {HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import { NotesService } from './notes.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent],
  imports : [
  BrowserModule,
  MatToolbarModule,
  HttpClientModule,
  MatExpansionModule,
  MatCardModule,
  MatFormFieldModule,
  FormsModule,
  MatInputModule,
  MatButtonModule,
  BrowserAnimationsModule],
  providers: [ NotesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
