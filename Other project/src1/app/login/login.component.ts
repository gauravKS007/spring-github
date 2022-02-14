import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { HttpErrorResponse } from '@angular/common/http';
import { RouterService } from 'src/app/services/router.service';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

    username = new FormControl('');
    password = new FormControl('');

    loginForm = new FormGroup({
        username: new FormControl('', [Validators.required]),
        password: new FormControl('', [Validators.required, Validators.minLength(6)])
    });

    submitMessage: string;

    constructor(private authentiationService: AuthenticationService, private routerService: RouterService) {
    }

    ngOnInit() {

    }

    get username1() {
        return this.loginForm.get('username');
    }

    get password1() {
        return this.loginForm.get('password');
    }

    loginSubmit() {
        console.log(this.loginForm.value);
        this.authentiationService.authenticateUser(this.loginForm.value).subscribe(
            data => {
                this.authentiationService.setBearerToken(data['token']);
                this.routerService.routeToDashboard();
                console.log(data);
            },
            error => {
                if (error instanceof HttpErrorResponse || error.status === 404) {
                    this.submitMessage = 'Http failure response for http://localhost:3000/auth/v1: 404 Not Found';
                } else {
                    this.submitMessage = error.error.message;
                }
            });
    }

}
