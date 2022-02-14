import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { RouterService } from 'src/app/services/router.service';


@Injectable()
export class CanActivateRouteGuard implements CanActivate {

  constructor(private authentiationService: AuthenticationService, private routerService: RouterService) { }

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
    return this.authentiationService.isUserAuthenticated(this.authentiationService.getBearerToken())
      .then((authenticated) => {
        if (!authenticated) {
          this.routerService.routeToLogin();
        }
        return authenticated;
      });
  }
}
