import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { fadeInUpAnimation } from '../../../../@mc4/animations/fade-in-up.animation';
import {OkAuth} from '../../../commons/model/auth.inteface';
import {UserAuth} from '../../../commons/model/user-auth.interface';
import {ErrorResponse} from '../../../commons/model/error-response';
import {ApiResponse} from '../../../commons/model/api-response';
import {SidenavService} from '../../../layout/sidenav/sidenav.service';
import {SidenavItem} from '../../../layout/sidenav/sidenav-item/sidenav-item.interface';
import {UserService} from '../../../commons/services/security/user.service';
import {AuthService} from '../../../commons/services/security/auth.service';
import {Theme, ThemeService} from '../../../../@mc4/services/theme.service';
import {KeyStorage} from '../../../commons/utils/key-storage.util';
import {SecureStorageService} from '../../../../@mc4/services/secure-storage.service';

@Component({
  selector: 'mc4-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
  animations: [fadeInUpAnimation]
})
export class LoginComponent implements OnInit {

  form: FormGroup;

  inputType = 'password';
  visible = false;

  constructor(private router: Router,
              private fb: FormBuilder,
              private cd: ChangeDetectorRef,
              private snackbar: MatSnackBar,
              private authService: AuthService,
              private userService: UserService,
              private themeService: ThemeService,
              private sidenavService: SidenavService,
              private secureStorage: SecureStorageService) {}

  ngOnInit() {
    this.form = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
    const lastTheme: Theme = this.secureStorage.getStorage(KeyStorage.themeKey.lastTheme);
    if (lastTheme) this.themeService.setTheme(lastTheme);
  }

  send() {
    if (this.form.valid) {
      const data: UserAuth = this.form.value;
      this.authService.requestLogin(data)
        .subscribe({next: this.successLogin, error: this.serviceError});
    }
  }

  private successLogin = async (body: ApiResponse<OkAuth>) => {
    this.authService.localSigninPersist(body.data);
    this.sidenavService.reloadResources();
    const userInfo = await this.userService.requestUserInfo().toPromise();
    if (userInfo) {
      this.authService.localUserInfo(userInfo);
    }
    await this.themeService.recoveryAppTheme();
    await this.router.navigate(['/']);
  }

  private serviceError = (error: ErrorResponse) => {
    console.error('Error de Servicio: ', error);
    this.snackbar.open(error.message, 'LOL THANKS', {
      duration: 10000
    });
  }

  toggleVisibility() {
    if (this.visible) {
      this.inputType = 'password';
      this.visible = false;
      this.cd.markForCheck();
    } else {
      this.inputType = 'text';
      this.visible = true;
      this.cd.markForCheck();
    }
  }
}
