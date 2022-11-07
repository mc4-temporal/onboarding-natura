import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {authKey, KeyStorage} from '../../utils/key-storage.util';
import {OkAuth} from '../../model/auth.inteface';
import {SecureStorageService} from '../../../../@mc4/services/secure-storage.service';
import {UserAuth} from '../../model/user-auth.interface';
import {ApiResponse} from '../../model/api-response';
import {environment} from '../../../../environments/environment';
import {ThemeService} from '../../../../@mc4/services/theme.service';
import {IUser} from '../../model/security.interface';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient,
              private secureStorage: SecureStorageService,
              private themeServide: ThemeService) {}

  isLoggedIn() {
    return !!this.secureStorage.getStorage<OkAuth>(authKey.userLoginKey);
  }

  localSigninPersist(body: any) {
    this.secureStorage.setStorage(authKey.userLoginKey, body);
  }

  requestLogin(auth: UserAuth): Observable<ApiResponse<OkAuth>> {
    const url = environment.api + environment.backend.apiLogin;
    return this.http.post<ApiResponse<OkAuth>>(url, JSON.stringify(auth));
  }

  requestLogoutUser(): Observable<ApiResponse<OkAuth>> {
    const url = environment.api + environment.backend.apiLogout;
    return this.http.get<ApiResponse<any>>(url);
  }

  requestLogout() {
    this.secureStorage.cleanStorage();
    this.secureStorage.setStorage(KeyStorage.themeKey.lastTheme, this.themeServide.getThemeConfig().theme);
  }

  localUserInfo(userInfo: IUser) {
    this.secureStorage.setStorage(authKey.userInfoKey, userInfo);
  }


  getUserInfo(): IUser {
    return this.secureStorage.getStorage<IUser>(authKey.userInfoKey);
  }
}
